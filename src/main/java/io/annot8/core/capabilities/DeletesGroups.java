package io.annot8.core.capabilities;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;


/**
 * Wrapper for repeated {@link DeletesGroup}.
 *
 * Developers do not need to use this (it is used internally by java to autowrap multiple annotations).
 */
@Documented
@Retention(RUNTIME)
@Target(TYPE)
public @interface DeletesGroups {

  /**
   * Get the array of annotations
   * @return the repeated annotations
   */
  DeletesGroup[] value();
}
