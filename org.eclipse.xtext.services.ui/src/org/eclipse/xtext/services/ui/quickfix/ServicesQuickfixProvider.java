
package org.eclipse.xtext.services.ui.quickfix;

import static org.eclipse.xtext.util.Strings.equal;

import javax.inject.Inject;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.services.services.Component;
import org.eclipse.xtext.services.validation.ServicesIssueCodes;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;

public class ServicesQuickfixProvider extends DefaultQuickfixProvider {

	@Fix(ServicesIssueCodes.INVALID_NAME)
	public void capitalizeName(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Capitalize name", "Capitalize the name.", "upcase.png", new IModification() {
			
			@Override
			public void apply(IModificationContext context) throws Exception {
				IXtextDocument xtextDocument = context.getXtextDocument();
				String firstLetter = xtextDocument.get(issue.getOffset(), 1);
				xtextDocument.replace(issue.getOffset(), 1, firstLetter.toUpperCase());
			}
		});
	}

	@Inject
	private ServiceAppendable.Factory appendableProvider;

	@Fix(ServicesIssueCodes.MISSING_IMPLEMENTATION)
	public void fixMissingImplementation(final Issue issue, IssueResolutionAcceptor acceptor) {
		if(issue.getData() != null && issue.getData().length > 0) {
			acceptor.accept(issue, "Implement missing services", "Adds stubs for missing implementations", null, new ISemanticModification() {
				
				@Override
				public void apply(EObject element, IModificationContext context)
						throws Exception {
					Component component = (Component) element;
					IXtextDocument document = context.getXtextDocument();
					ServiceAppendable appendable = appendableProvider.get(document, component, getFunctionInsertOffset(component));
				}
			});
		}
	}

	private int getFunctionInsertOffset(Component component) {
		ICompositeNode componentNode = NodeModelUtils.findActualNodeFor(component);
		if (componentNode == null)
			throw new IllegalStateException("Cannot find node for component " + component.getName());
		int lastBrace = -1;
		for (ILeafNode leafNode : componentNode.getLeafNodes()) {
			if (leafNode.getGrammarElement() instanceof Keyword
					&& equal("}", ((Keyword) leafNode.getGrammarElement()).getValue())) {
				lastBrace = leafNode.getOffset();
			}
		}
		return (lastBrace == -1) ? lastBrace = componentNode.getTotalEndOffset()
				: lastBrace;
	}
}
