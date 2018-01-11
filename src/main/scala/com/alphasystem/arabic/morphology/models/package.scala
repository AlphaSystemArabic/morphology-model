package com.alphasystem.arabic.morphology

import com.alphasystem.arabic.model.{ ArabicLetterType, ArabicSupport, ArabicWord, SarfMemberType }
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

  case class Radical(letter: ArabicLetterType, index: Int)

  case class RootLetters(firstRadical: Radical = Radical(FA, 0),
                         secondRadical: Radical = Radical(AIN, 1),
                         thirdRadical: Radical = Radical(LAM, 2),
                         fourthRadical: Option[Radical] = None)
      extends AbstractSimpleDocument {

    override val id: String = {
      val fr = fourthRadical match {
        case None => ""
        case Some(value) => s"_${value.letter.name()}"
      }
      s"${firstRadical.letter.name()}_${secondRadical.letter.name()}_${thirdRadical.letter.name()}$fr"
    }
  }

  case class RootWord(rootLetters: RootLetters,
                      sarfTermType: SarfTermType,
                      sarfMemberType: SarfMemberType,
                      baseWord: ArabicWord,
                      rootWord: ArabicWord)
      extends ArabicSupport {

    override def toLabel: ArabicWord = rootWord
  }
}
