package io.annot8.core.helpers.builders;

import io.annot8.core.exceptions.IncompleteException;

/**
 * Helper interface to indicate that a builder has a save method
 *
 * @param <A> The object being built by this builder
 */
public interface WithBuild<A> {

  /**
   * Return the object being built by this builder
   */
  A save() throws IncompleteException;
}
