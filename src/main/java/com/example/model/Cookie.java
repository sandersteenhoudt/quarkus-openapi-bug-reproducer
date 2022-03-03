package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A normal interface not processed by Immutables
 * Has @JsonProperty annotations on the methods, which are ignored
 */
public interface Cookie {

  @JsonProperty("name")
  String name();

  @JsonProperty("isGlutenFree")
  boolean glutenFree();
}
