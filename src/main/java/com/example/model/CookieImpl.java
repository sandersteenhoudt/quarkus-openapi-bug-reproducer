package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * Implementation of the regular Cookie interface
 *
 * The @JsonProperty annotations of the interface's
 * methods are ignored, as are the ones on this implementation's {@link #anotherFieldProperty()
 * method}.
 *
 * The field names are picked up verbatim, and can be overridden by an annotation, as
 * demonstrated with {@link #fieldProperty}
 */
public class CookieImpl implements Cookie {

  private final String implementationName;
  private final boolean implementationGlutenFree;
  @JsonProperty("annotationOnField")
  private List<String> fieldProperty;
  private Map<String, String> anotherFieldProperty;

  public CookieImpl(final String implementationName, final boolean implementationGlutenFree) {
    this.implementationName = implementationName;
    this.implementationGlutenFree = implementationGlutenFree;
  }

  @Override
  public String name() {
    return implementationName;
  }

  @Override
  public boolean glutenFree() {
    return implementationGlutenFree;
  }


  public List<String> someProperties() {
    return fieldProperty;
  }

  @JsonProperty("annotationOnMethod")
  public Map<String, String> anotherFieldProperty() {
    return anotherFieldProperty;
  }
}
