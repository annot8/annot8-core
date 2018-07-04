package io.annot8.core.components;

import io.annot8.core.components.responses.SourceResponse;
import io.annot8.core.context.ItemFactory;

/**
 * Base processor interface from which all sources extend.
 *
 * Sources read data from somewhere (e.g. a file system, or a database) and produce items that will
 * be processed by other components.
 */
public interface Source extends Annot8Component {

  /**
   * Read from the data source and return new items if found
   */
  SourceResponse read(ItemFactory itemFactory);

}
