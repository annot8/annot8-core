package io.annot8.core.data;

import io.annot8.core.helpers.builders.WithFrom;
import io.annot8.core.helpers.builders.WithSave;
import java.util.Collection;
import java.util.stream.Stream;

/**
 * Base tags interface from which all tags implementations extend.
 */
public interface Tags {

  /**
   * Return true if this object contains the specified tag
   */
  default boolean has(final String tag) {
    return get().anyMatch(tag::equals);
  }

  /**
   * Return all the tags current held in this object
   */
  Stream<String> get();

  /**
   * Builder interface to create (immutable) Tags classes
   */
  interface Builder extends
      WithFrom<Builder, Tags>,
      WithSave<Tags> {

    /**
     * Add a tag to this tags object
     */
    Builder addTag(final String tag);

    /**
     * Add a collection of tags to this tags object
     */
    default Builder addTags(final Collection<String> tags){
      tags.forEach(this::addTag);
      return this;
    }

    /**
     * Remove a tag to this tags object
     */
    Builder removeTag(final String tag);

    /**
     * Remove a collection of tags to this tags object
     */
    default Builder removeTags(final Collection<String> tags){
      tags.forEach(this::removeTag);
      return this;
    }

  }
}
