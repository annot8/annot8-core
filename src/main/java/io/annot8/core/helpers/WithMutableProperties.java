/* Annot8 (annot8.io) - Licensed under Apache-2.0. */
package io.annot8.core.helpers;

import io.annot8.core.properties.MutableProperties;

/** Helper interface to indicate that a class supports {@link MutableProperties} */
public interface WithMutableProperties {

  /**
   * Get the properties
   *
   * @return the mutable properties associated with this object
   */
  MutableProperties getProperties();
}
