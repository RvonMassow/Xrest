/*
 * generated by Xtext
 */
package org.eclipse.xtext.services.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.services.ui.contentassist.ServicesProposalProvider;
import org.eclipse.xtext.services.ui.quickfix.ServicesQuickfixProvider;
import org.eclipse.xtext.ui.editor.contentassist.IContentProposalProvider;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionProvider;

/**
 * Use this class to register components to be used within the IDE.
 */
public class ServicesUiModule extends org.eclipse.xtext.services.ui.AbstractServicesUiModule {
	public ServicesUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public Class<? extends IssueResolutionProvider> bindIssueResolutionProvider() {
		return ServicesQuickfixProvider.class;
	}

	@Override
	public Class<? extends IContentProposalProvider> bindIContentProposalProvider() {
		return ServicesProposalProvider.class;
	}
}
