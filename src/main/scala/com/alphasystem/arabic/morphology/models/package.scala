package com.alphasystem.arabic.morphology

import com.alphasystem.arabic.model.ArabicLetterType
import com.alphasystem.arabic.model.ArabicLetterType.{AIN, FA, LAM}

/**
  * @author sali
  */
package object models {

  trait AbstractSimpleDocument {
    val id: String
  }

  trait AbstractDocument extends AbstractSimpleDocument {
    val displayName: String
  }

  case class RootLetters(firstRadical: ArabicLetterType = FA,
                         secondRadical: ArabicLetterType = AIN,
                         thirdRadical: ArabicLetterType = LAM,
                         fourthRadical: Option[ArabicLetterType] = None)
    extends AbstractSimpleDocument {

    override val id: String = {
      val fr = fourthRadical match {
        case None => ""
        case Some(value) => s"_${value.name()}"
      }
      s"${firstRadical.name()}_${secondRadical.name()}_${thirdRadical.name()}$fr"
    }
  }
}
