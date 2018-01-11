package com.alphasystem.arabic.morphology

import com.alphasystem.arabic.model._
import com.alphasystem.arabic.model.ArabicLetterType.{ AIN, FA, LAM }
import com.alphasystem.arabic.morphology.model.support.{ Flexibility, SarfTermType }

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

  case class Radicals(firstRadical: Radical,
                      secondRadical: Radical,
                      thirdRadical: Radical,
                      fourthRadical: Option[Radical] = None)

  case class RootWord(baseWord: ArabicWord,
                      rootWord: ArabicWord,
                      firstRadicalIndex: Int = 0,
                      secondRadicalIndex: Int = 1,
                      thirdRadicalIndex: Int = 2,
                      mayBeFourthRadicalIndex: Option[Int] = None,
                      firstRadical: ArabicLetter = ArabicLetters.FA_WITH_FATHA,
                      secondRadical: ArabicLetter = ArabicLetters.AIN_WITH_FATHA,
                      thirdRadical: ArabicLetter = ArabicLetters.LAM_WITH_FATHA,
                      mayBeFourthRadical: Option[ArabicLetter] = None,
                      sarfTermType: Option[SarfTermType] = None,
                      sarfMemberType: Option[SarfMemberType] = None)
      extends ArabicSupport {

    override def toLabel: ArabicWord = rootWord
  }

  object RootWord {
    def createRootWord(firstRadicalIndex: Int,
                       secondRadicalIndex: Int,
                       thirdRadicalIndex: Int,
                       mayBeFourthRadicalIndex: Option[Int],
                       arabicLetters: ArabicLetter*): RootWord = {
      val arabicWord = new ArabicWord(arabicLetters: _*)
      RootWord(
        arabicWord,
        arabicWord,
        firstRadicalIndex,
        secondRadicalIndex,
        thirdRadicalIndex,
        mayBeFourthRadicalIndex
      )
    }

    def createRootWord(firstRadicalIndex: Int,
                       secondRadicalIndex: Int,
                       thirdRadicalIndex: Int,
                       arabicLetters: ArabicLetter*): RootWord = {
      val arabicWord = new ArabicWord(arabicLetters: _*)
      RootWord(arabicWord, arabicWord, firstRadicalIndex, secondRadicalIndex, thirdRadicalIndex, None)
    }
  }

  trait RootWordSupport extends ArabicSupport {
    val rootWord: RootWord
  }

  trait NounSupport extends RootWordSupport {
    val name: String
    val feminine: Boolean
    val flexibility: Flexibility
  }

  trait VerbSupport extends RootWordSupport
}
