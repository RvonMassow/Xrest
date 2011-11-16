package org.eclipse.xtext.example.domainmodel.generator;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator;

@SuppressWarnings("all")
public class DMGenerator implements IGenerator {
  @Inject
  private JvmModelGenerator jvmModelGenerator;
  
  public void doGenerate(final Resource r, final IFileSystemAccess fsa) {
    this.jvmModelGenerator.doGenerate(r, fsa);
  }
}
