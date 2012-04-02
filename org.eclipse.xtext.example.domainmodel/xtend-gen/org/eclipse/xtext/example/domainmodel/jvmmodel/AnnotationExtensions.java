package org.eclipse.xtext.example.domainmodel.jvmmodel;

import javax.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;

@SuppressWarnings("all")
public class AnnotationExtensions {
  @Inject
  private JvmTypesBuilder _jvmTypesBuilder;
  
  public JvmAnnotationReference createGetAnnotation(final EObject it) {
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(it, "javax.ws.rs.GET");
    return _annotation;
  }
  
  public JvmAnnotationReference createPostAnnotation(final EObject it) {
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(it, "javax.ws.rs.POST");
    return _annotation;
  }
  
  public JvmAnnotationReference createPutAnnotation(final EObject it) {
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(it, "javax.ws.rs.PUT");
    return _annotation;
  }
  
  public JvmAnnotationReference createDeleteAnnotation(final EObject it) {
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(it, "javax.ws.rs.DELETE");
    return _annotation;
  }
  
  public JvmAnnotationReference createPathAnnotation(final EObject it, final String param) {
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(it, "javax.ws.rs.Path", param);
    return _annotation;
  }
  
  public JvmAnnotationReference createInjectAnnotation(final EObject it) {
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(it, "javax.inject.Inject");
    return _annotation;
  }
  
  public JvmAnnotationReference createPathParamAnnotation(final EObject it, final String name) {
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(it, "javax.ws.rs.PathParam", name);
    return _annotation;
  }
  
  public JvmAnnotationReference createFormParamAnnotation(final EObject it, final String name) {
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(it, "javax.ws.rs.FormParam", name);
    return _annotation;
  }
  
  public JvmAnnotationReference createProducesAnnotation(final EObject it, final String mime) {
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(it, "javax.ws.rs.Produces", mime);
    return _annotation;
  }
  
  public JvmAnnotationReference createConsumesAnnotation(final EObject it, final String mime) {
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(it, "javax.ws.rs.Consumes", mime);
    return _annotation;
  }
  
  public JvmAnnotationReference createContextAnnotation(final EObject it) {
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(it, "javax.ws.rs.core.Context");
    return _annotation;
  }
}
