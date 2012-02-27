/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.example.domainmodel;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.example.domainmodel.domainmodel.Property;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.SimpleLocalScopeProvider;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;

/**
 * @author skomp - Initial contribution and API
 */
public class DomainmodelScopeProvider extends XbaseScopeProvider {

	@Override
	public IScope getScope(EObject context, EReference reference) {
		String name = reference.getName();
		if(context instanceof Property && name == "mappedBy"){
			IScope tmp = super.getScope(context, reference);
		}
		return super.getScope(context, reference);
	}
}
