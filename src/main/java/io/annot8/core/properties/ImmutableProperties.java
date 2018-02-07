package io.annot8.core.properties;

import io.annot8.core.helpers.builders.WithFrom;
import io.annot8.core.helpers.builders.WithPropertiesBuilder;
import io.annot8.core.helpers.builders.WithSave;

/**
 * Base immutable properties interface from which all other immutable properties extend.
 */
public interface ImmutableProperties extends Properties {

  /**
   * Builder interface to create (immutable) properties classes
   */
  interface Builder extends
      WithFrom<Builder, Properties>,
      WithPropertiesBuilder<Builder>,
      WithSave<ImmutableProperties> {

  }

}
