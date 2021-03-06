package com.alphasystem.arabic.morphology.graph.model;

/**
 * @author sali
 */
public enum GraphNodeType {

    /**
     * A node that will always has part of speech tag.
     */
    TERMINAL,

    /**
     * Represents part of speech.
     */
    PART_OF_SPEECH,

    /**
     * Represents two or more terminal nodes to make a phrase.
     */
    PHRASE,

    /**
     * Represents relationship between two nodes.
     */
    RELATIONSHIP,

    /**
     * Represents a node from outside of current set of nodes.
     */
    REFERENCE,

    /**
     * A implicit word with part of speech and Arabic text to fill grammatical meaning / relationship.
     */
    HIDDEN,

    /**
     * An implied node without any Arabic text and only part of speech to complete grammatical meaning / relationship.
     */
    IMPLIED,

    /**
     * Represents the root of each of above category in the tree. This is not used in actual graph.
     */
    ROOT,

}
