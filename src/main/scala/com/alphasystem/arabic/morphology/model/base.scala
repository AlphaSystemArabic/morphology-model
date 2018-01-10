package com.alphasystem.arabic.morphology.model

trait AbstractSimpleDocument {
  val id: String
}

trait AbstractDocument extends AbstractSimpleDocument {
  val displayName: String
}
