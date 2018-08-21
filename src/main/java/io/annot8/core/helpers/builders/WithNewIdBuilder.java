package io.annot8.core.helpers.builders;

/**
 * Helper interface to indicate that a builder should assign a new ID to an object
 *
 * @param <A> The builder class
 */
public interface WithNewIdBuilder<A> {

  /**
   * Assign a new id to the built object
   *
   * @return a builder with a new ID
   */
  A newId();
}
