package org.eclipse.xtext.example.domainmodel.generator

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import com.google.inject.Inject
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator

class DMGenerator implements IGenerator {
	
	@Inject JvmModelGenerator jvmModelGenerator
	
	override doGenerate(Resource r, IFileSystemAccess fsa) {
		jvmModelGenerator.doGenerate(r, fsa)
	}
}