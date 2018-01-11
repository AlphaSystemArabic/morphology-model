package com.alphasystem.arabic

import com.alphasystem.arabic.model.ArabicWord
import com.alphasystem.arabic.morphology.models.Radical

/**
  * @author sali
  */
package object morphology {

  implicit class ArabicWordOps(arabicWord: ArabicWord) {
    def replaceLetters(firstRadical: Radical,
                       secondRadical: Radical,
                       thirdRadical: Radical,
                       mayBeFourthRadical: Option[Radical]): ArabicWord = {
      val aw = new ArabicWord(arabicWord)
        .replaceLetter(firstRadical.index, firstRadical.letter)
        .replaceLetter(secondRadical.index, secondRadical.letter)
        .replaceLetter(thirdRadical.index, thirdRadical.letter)
      mayBeFourthRadical match {
        case None => aw
        case Some(fourthRadical) => aw.replaceLetter(fourthRadical.index, fourthRadical.letter)
      }
    }

  }
}
