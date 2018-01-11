package com.alphasystem.arabic.morphology

import com.alphasystem.arabic.model._
import com.alphasystem.arabic.model.ArabicLetterType.{ AIN, FA, LAM }
import com.alphasystem.arabic.morphology.model.support.SarfTermType

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

  case class Radical(letter: ArabicLetter, index: Int)

  case class RootWord(rootLetters: RootLetters,
                      sarfTermType: SarfTermType,
                      sarfMemberType: SarfMemberType,
                      baseWord: ArabicWord,
                      rootWord: ArabicWord)
      extends ArabicSupport {

    override def toLabel: ArabicWord = rootWord
  }
}
