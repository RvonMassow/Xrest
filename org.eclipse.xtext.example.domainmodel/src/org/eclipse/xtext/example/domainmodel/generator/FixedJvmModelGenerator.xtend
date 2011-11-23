/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.example.domainmodel.generator

import org.eclipse.xtext.common.types.JvmFormalParameter
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator
import org.eclipse.xtext.xbase.compiler.ImportManager
import java.util.List
import org.eclipse.xtext.common.types.JvmAnnotationReference

class FixedJvmModelGenerator extends JvmModelGenerator {

	override generateParameter(JvmFormalParameter it, ImportManager importManager) {
		'''«annotations.generateInlineAnnotations(importManager)» final «
			parameterType.serialize(importManager)» «simpleName»'''.toString
	}

	def generateInlineAnnotations(List<JvmAnnotationReference> annotations, ImportManager importManager) {
		if (annotations.empty)
			return null
		'''
		«FOR a : annotations»
			@«importManager.serialize(a.annotation)»«FOR value : a.values BEFORE '(' SEPARATOR ', ' AFTER ')'»«value.toJava(importManager)»«ENDFOR»«
		ENDFOR»'''
	}
}
