package org.eclipse.xtext.example.domainmodel.generator;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmAnnotationType;
import org.eclipse.xtext.common.types.JvmAnnotationValue;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator;

@SuppressWarnings("all")
public class FixedJvmModelGenerator extends JvmModelGenerator {
  public CharSequence generateParameter(final JvmFormalParameter it, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    EList<JvmAnnotationReference> _annotations = it.getAnnotations();
    CharSequence _generateInlineAnnotations = this.generateInlineAnnotations(_annotations, importManager);
    _builder.append(_generateInlineAnnotations, "");
    _builder.append(" final ");
    JvmTypeReference _parameterType = it.getParameterType();
    String _serialize = this.serialize(_parameterType, importManager);
    _builder.append(_serialize, "");
    _builder.append(" ");
    String _simpleName = it.getSimpleName();
    _builder.append(_simpleName, "");
    String _string = _builder.toString();
    return _string;
  }
  
  public CharSequence generateInlineAnnotations(final List<JvmAnnotationReference> annotations, final ImportManager importManager) {
    CharSequence _xblockexpression = null;
    {
      boolean _isEmpty = annotations.isEmpty();
      if (_isEmpty) {
        return null;
      }
      StringConcatenation _builder = new StringConcatenation();
      {
        for(final JvmAnnotationReference a : annotations) {
          _builder.append("@");
          JvmAnnotationType _annotation = a.getAnnotation();
          CharSequence _serialize = importManager.serialize(_annotation);
          _builder.append(_serialize, "");
          {
            EList<JvmAnnotationValue> _values = a.getValues();
            boolean _hasElements = false;
            for(final JvmAnnotationValue value : _values) {
              if (!_hasElements) {
                _hasElements = true;
                _builder.append("(", "");
              } else {
                _builder.appendImmediate(", ", "");
              }
              CharSequence _java = this.toJava(value, importManager);
              _builder.append(_java, "");
            }
            if (_hasElements) {
              _builder.append(")", "");
            }
          }
        }
      }
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
}
