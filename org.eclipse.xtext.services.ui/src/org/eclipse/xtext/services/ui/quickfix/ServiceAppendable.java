/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.services.ui.quickfix;

import javax.inject.Inject;

import org.eclipse.xtext.services.services.Component;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.compiler.StringBuilderBasedAppendable;
import org.eclipse.xtext.xbase.jvmmodel.JvmModelAssociator;

/**
 * @author Robert von Massow - Initial contribution and API
 */
@SuppressWarnings("restriction")
public class ServiceAppendable extends StringBuilderBasedAppendable {

	public static class Factory {

		@Inject
		private JvmModelAssociator associations;

		public ServiceAppendable get(IXtextDocument document, Component component, int offset) {
			return new ServiceAppendable(new ImportManager(false), document, associations, component, offset);
		}
	}

	private final Component component;
	private final JvmModelAssociator associations;
	private final int offset;
	private IXtextDocument document;

	protected ServiceAppendable(ImportManager importManager, IXtextDocument document, JvmModelAssociator associations, Component component, int offset) {
		super(importManager);
		this.document = document;
		this.associations = associations;
		this.component = component;
		this.offset = offset;
	}

	
}
