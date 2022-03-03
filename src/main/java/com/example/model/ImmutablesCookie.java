package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value.Immutable;

/**
 * Interface using <a href="https://immutables.github.io">Immutables</a>. Added here for
 * completeness because it's how I discovered this behaviour.
 * <p>
 * Same behaviour as {@link Cookie}: annotations on the methods are ignored
 */
@Immutable
@JsonSerialize(as = ImmutableImmutablesCookie.class) //Seems to have no effect
@JsonDeserialize(as = ImmutableImmutablesCookie.class)  //Seems to have no effect
//@Schema(implementation = ImmutableImmutablesCookie.class) //Uncommenting this "copies" the field names (not the annotations) from ImmutableImmutablesCookie, which makes sense
public interface ImmutablesCookie {

  @JsonProperty("name")
  String name();

  @JsonProperty("isGlutenFree")
  boolean glutenFree();
}
