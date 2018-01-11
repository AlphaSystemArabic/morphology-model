package com.alphasystem.arabic.morphology.models

import com.alphasystem.arabic.model.ArabicWord
import com.alphasystem.arabic.morphology.model.support.Flexibility
import com.alphasystem.arabic.model.ArabicLetters._
import RootWord.createRootWord

/**
  * @author sali
  */
object Noun {

  sealed abstract class Noun private[models] (override val rootWord: RootWord,
                                              override val feminine: Boolean = false,
                                              override val flexibility: Flexibility = Flexibility.FULLY_FLEXIBLE)
      extends NounSupport {
    override def toLabel: ArabicWord = rootWord.rootWord
  }

  final case object FORM_I_MASCULINE_ACTIVE_PARTICIPLE
      extends Noun(createRootWord(0, 2, 3, FA_WITH_FATHA, LETTER_ALIF, AIN_WITH_KASRA, LAM_WITH_DAMMATAN)) {
    override val name: String = "FORM_I_MASCULINE_ACTIVE_PARTICIPLE"
  }

  final case object FORM_I_FEMININE_ACTIVE_PARTICIPLE
      extends Noun(
        createRootWord(0, 2, 3, FA_WITH_FATHA, LETTER_ALIF, AIN_WITH_KASRA, LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN),
        true
      ) {
    override val name: String = "FORM_I_FEMININE_ACTIVE_PARTICIPLE"
  }

  final case object FORM_I_MASCULINE_PASSIVE_PARTICIPLE
      extends Noun(
        createRootWord(1, 2, 4, MEEM_WITH_FATHA, FA_WITH_SUKUN, AIN_WITH_DAMMA, WAW_WITH_SUKUN, LAM_WITH_DAMMATAN)
      ) {
    override val name: String = "FORM_I_MASCULINE_PASSIVE_PARTICIPLE"
  }

  final case object FORM_I_FEMININE_PASSIVE_PARTICIPLE
      extends Noun(
        createRootWord(
          1,
          2,
          4,
          MEEM_WITH_FATHA,
          FA_WITH_SUKUN,
          AIN_WITH_DAMMA,
          WAW_WITH_SUKUN,
          LAM_WITH_FATHA,
          TA_MARBUTA_WITH_DAMMATAN
        ),
        true
      ) {
    override val name: String = "FORM_I_FEMININE_PASSIVE_PARTICIPLE"
  }

  final case object FORM_I_CATEGORY_U_MASCULINE_ACTIVE_PARTICIPLE
      extends Noun(createRootWord(0, 1, 3, FA_WITH_FATHA, AIN_WITH_KASRA, YA_WITH_SUKUN, LAM_WITH_DAMMATAN)) {
    override val name: String = "FORM_I_CATEGORY_U_MASCULINE_ACTIVE_PARTICIPLE"
  }

  final case object FORM_I_CATEGORY_U_FEMININE_ACTIVE_PARTICIPLE
      extends Noun(
        createRootWord(0, 1, 3, FA_WITH_FATHA, AIN_WITH_KASRA, YA_WITH_SUKUN, LAM_WITH_FATHA, TA_MARBUTA_WITH_DAMMATAN),
        true
      ) {
    override val name: String = "FORM_I_CATEGORY_U_FEMININE_ACTIVE_PARTICIPLE"
  }

  final case object FORM_II_MASCULINE_ACTIVE_PARTICIPLE
      extends Noun(
        createRootWord(1, 2, 3, MEEM_WITH_DAMMA, FA_WITH_FATHA, AIN_WITH_SHADDA_AND_KASRA, LAM_WITH_DAMMATAN)
      ) {
    override val name: String = "FORM_II_MASCULINE_ACTIVE_PARTICIPLE"
  }

  final case object FORM_II_FEMININE_ACTIVE_PARTICIPLE
      extends Noun(
        createRootWord(
          1,
          2,
          3,
          MEEM_WITH_DAMMA,
          FA_WITH_FATHA,
          AIN_WITH_SHADDA_AND_KASRA,
          LAM_WITH_FATHA,
          TA_MARBUTA_WITH_DAMMATAN
        ),
        true
      ) {
    override val name: String = "FORM_II_FEMININE_ACTIVE_PARTICIPLE"
  }

  final case object FORM_II_MASCULINE_PASSIVE_PARTICIPLE
      extends Noun(
        createRootWord(1, 2, 3, MEEM_WITH_DAMMA, FA_WITH_FATHA, AIN_WITH_SHADDA_AND_FATHA, LAM_WITH_DAMMATAN)
      ) {
    override val name: String = "FORM_II_MASCULINE_PASSIVE_PARTICIPLE"
  }

  final case object FORM_II_FEMININE_PASSIVE_PARTICIPLE
      extends Noun(
        createRootWord(
          1,
          2,
          3,
          MEEM_WITH_DAMMA,
          FA_WITH_FATHA,
          AIN_WITH_SHADDA_AND_FATHA,
          LAM_WITH_FATHA,
          TA_MARBUTA_WITH_DAMMATAN
        ),
        true
      ) {
    override val name: String = "FORM_II_FEMININE_PASSIVE_PARTICIPLE"
  }

  final case object FORM_III_MASCULINE_ACTIVE_PARTICIPLE
      extends Noun(
        createRootWord(1, 3, 4, MEEM_WITH_DAMMA, FA_WITH_FATHA, LETTER_ALIF, AIN_WITH_KASRA, LAM_WITH_DAMMATAN)
      ) {
    override val name: String = "FORM_III_MASCULINE_ACTIVE_PARTICIPLE"
  }

  final case object FORM_III_FEMININE_ACTIVE_PARTICIPLE
      extends Noun(
        createRootWord(
          1,
          3,
          4,
          MEEM_WITH_DAMMA,
          FA_WITH_FATHA,
          LETTER_ALIF,
          AIN_WITH_KASRA,
          LAM_WITH_FATHA,
          TA_MARBUTA_WITH_DAMMATAN
        ),
        true
      ) {
    override val name: String = "FORM_III_FEMININE_ACTIVE_PARTICIPLE"
  }

  final case object FORM_III_MASCULINE_PASSIVE_PARTICIPLE
      extends Noun(
        createRootWord(1, 3, 4, MEEM_WITH_DAMMA, FA_WITH_FATHA, LETTER_ALIF, AIN_WITH_FATHA, LAM_WITH_DAMMATAN)
      ) {
    override val name: String = "FORM_III_MASCULINE_PASSIVE_PARTICIPLE"
  }

  final case object FORM_III_FEMININE_PASSIVE_PARTICIPLE
      extends Noun(
        createRootWord(
          1,
          3,
          4,
          MEEM_WITH_DAMMA,
          FA_WITH_FATHA,
          LETTER_ALIF,
          AIN_WITH_FATHA,
          LAM_WITH_FATHA,
          TA_MARBUTA_WITH_DAMMATAN
        ),
        true
      ) {
    override val name: String = "FORM_III_FEMININE_PASSIVE_PARTICIPLE"
  }

  final case object FORM_IV_MASCULINE_ACTIVE_PARTICIPLE
      extends Noun(createRootWord(1, 2, 3, MEEM_WITH_DAMMA, FA_WITH_SUKUN, AIN_WITH_KASRA, LAM_WITH_DAMMATAN)) {
    override val name: String = "FORM_IV_MASCULINE_ACTIVE_PARTICIPLE"
  }

  final case object FORM_IV_FEMININE_ACTIVE_PARTICIPLE
      extends Noun(
        createRootWord(
          1,
          2,
          3,
          MEEM_WITH_DAMMA,
          FA_WITH_SUKUN,
          AIN_WITH_KASRA,
          LAM_WITH_FATHA,
          TA_MARBUTA_WITH_DAMMATAN
        ),
        true
      ) {
    override val name: String = "FORM_IV_FEMININE_ACTIVE_PARTICIPLE"
  }

  final case object FORM_IV_MASCULINE_PASSIVE_PARTICIPLE
      extends Noun(createRootWord(1, 2, 3, MEEM_WITH_DAMMA, FA_WITH_SUKUN, AIN_WITH_FATHA, LAM_WITH_DAMMATAN)) {
    override val name: String = "FORM_IV_MASCULINE_PASSIVE_PARTICIPLE"
  }

  final case object FORM_IV_FEMININE_PASSIVE_PARTICIPLE
      extends Noun(
        createRootWord(
          1,
          2,
          3,
          MEEM_WITH_DAMMA,
          FA_WITH_SUKUN,
          AIN_WITH_FATHA,
          LAM_WITH_FATHA,
          TA_MARBUTA_WITH_DAMMATAN
        ),
        true
      ) {
    override val name: String = "FORM_IV_FEMININE_PASSIVE_PARTICIPLE"
  }

  final case object FORM_V_MASCULINE_ACTIVE_PARTICIPLE
      extends Noun(
        createRootWord(
          2,
          3,
          4,
          MEEM_WITH_DAMMA,
          TA_WITH_FATHA,
          FA_WITH_FATHA,
          AIN_WITH_SHADDA_AND_KASRA,
          LAM_WITH_DAMMATAN
        )
      ) {
    override val name: String = "FORM_V_MASCULINE_ACTIVE_PARTICIPLE"
  }

  final case object FORM_V_FEMININE_ACTIVE_PARTICIPLE
      extends Noun(
        createRootWord(
          2,
          3,
          4,
          MEEM_WITH_DAMMA,
          TA_WITH_FATHA,
          FA_WITH_FATHA,
          AIN_WITH_SHADDA_AND_KASRA,
          LAM_WITH_FATHA,
          TA_MARBUTA_WITH_DAMMATAN
        ),
        true
      ) {
    override val name: String = "FORM_V_FEMININE_ACTIVE_PARTICIPLE"
  }

  final case object FORM_V_MASCULINE_PASSIVE_PARTICIPLE
      extends Noun(
        createRootWord(
          2,
          3,
          4,
          MEEM_WITH_DAMMA,
          TA_WITH_FATHA,
          FA_WITH_FATHA,
          AIN_WITH_SHADDA_AND_FATHA,
          LAM_WITH_DAMMATAN
        )
      ) {
    override val name: String = "FORM_V_MASCULINE_PASSIVE_PARTICIPLE"
  }

  final case object FORM_V_FEMININE_PASSIVE_PARTICIPLE
      extends Noun(
        createRootWord(
          2,
          3,
          4,
          MEEM_WITH_DAMMA,
          TA_WITH_FATHA,
          FA_WITH_FATHA,
          AIN_WITH_SHADDA_AND_FATHA,
          LAM_WITH_FATHA,
          TA_MARBUTA_WITH_DAMMATAN
        ),
        true
      ) {
    override val name: String = "FORM_V_FEMININE_PASSIVE_PARTICIPLE"
  }

  final case object FORM_VI_MASCULINE_ACTIVE_PARTICIPLE
      extends Noun(
        createRootWord(
          2,
          4,
          5,
          MEEM_WITH_DAMMA,
          TA_WITH_FATHA,
          FA_WITH_FATHA,
          LETTER_ALIF,
          AIN_WITH_KASRA,
          LAM_WITH_DAMMATAN
        )
      ) {
    override val name: String = "FORM_VI_MASCULINE_ACTIVE_PARTICIPLE"
  }

  final case object FORM_VI_FEMININE_ACTIVE_PARTICIPLE
      extends Noun(
        createRootWord(
          2,
          4,
          5,
          MEEM_WITH_DAMMA,
          TA_WITH_FATHA,
          FA_WITH_FATHA,
          LETTER_ALIF,
          AIN_WITH_KASRA,
          LAM_WITH_FATHA,
          TA_MARBUTA_WITH_DAMMATAN
        ),
        true
      ) {
    override val name: String = "FORM_VI_FEMININE_ACTIVE_PARTICIPLE"
  }

  final case object FORM_VI_MASCULINE_PASSIVE_PARTICIPLE
      extends Noun(
        createRootWord(
          2,
          4,
          5,
          MEEM_WITH_DAMMA,
          TA_WITH_FATHA,
          FA_WITH_FATHA,
          LETTER_ALIF,
          AIN_WITH_FATHA,
          LAM_WITH_DAMMATAN
        )
      ) {
    override val name: String = "FORM_VI_MASCULINE_PASSIVE_PARTICIPLE"
  }

  final case object FORM_VI_FEMININE_PASSIVE_PARTICIPLE
      extends Noun(
        createRootWord(
          2,
          4,
          5,
          MEEM_WITH_DAMMA,
          TA_WITH_FATHA,
          FA_WITH_FATHA,
          LETTER_ALIF,
          AIN_WITH_FATHA,
          LAM_WITH_FATHA,
          TA_MARBUTA_WITH_DAMMATAN
        ),
        true
      ) {
    override val name: String = "FORM_VI_FEMININE_PASSIVE_PARTICIPLE"
  }

  final case object FORM_VII_MASCULINE_ACTIVE_PARTICIPLE
      extends Noun(
        createRootWord(2, 3, 4, MEEM_WITH_DAMMA, NOON_WITH_SUKUN, FA_WITH_FATHA, AIN_WITH_KASRA, LAM_WITH_DAMMATAN)
      ) {
    override val name: String = "FORM_VII_MASCULINE_ACTIVE_PARTICIPLE"
  }

  final case object FORM_VII_FEMININE_ACTIVE_PARTICIPLE
      extends Noun(
        createRootWord(
          2,
          3,
          4,
          MEEM_WITH_DAMMA,
          NOON_WITH_SUKUN,
          FA_WITH_FATHA,
          AIN_WITH_KASRA,
          LAM_WITH_FATHA,
          TA_MARBUTA_WITH_DAMMATAN
        ),
        true
      ) {
    override val name: String = "FORM_VII_FEMININE_ACTIVE_PARTICIPLE"
  }

  final case object FORM_VII_MASCULINE_PASSIVE_PARTICIPLE
      extends Noun(
        createRootWord(2, 3, 4, MEEM_WITH_DAMMA, NOON_WITH_SUKUN, FA_WITH_FATHA, AIN_WITH_FATHA, LAM_WITH_DAMMATAN)
      ) {
    override val name: String = "FORM_VII_MASCULINE_PASSIVE_PARTICIPLE"
  }

  final case object FORM_VII_FEMININE_PASSIVE_PARTICIPLE
      extends Noun(
        createRootWord(
          2,
          3,
          4,
          MEEM_WITH_DAMMA,
          NOON_WITH_SUKUN,
          FA_WITH_FATHA,
          AIN_WITH_FATHA,
          LAM_WITH_FATHA,
          TA_MARBUTA_WITH_DAMMATAN
        ),
        true
      ) {
    override val name: String = "FORM_VII_FEMININE_PASSIVE_PARTICIPLE"
  }

  final case object FORM_VIII_MASCULINE_ACTIVE_PARTICIPLE
      extends Noun(
        createRootWord(1, 3, 4, MEEM_WITH_DAMMA, FA_WITH_SUKUN, TA_WITH_FATHA, AIN_WITH_KASRA, LAM_WITH_DAMMATAN)
      ) {
    override val name: String = "FORM_VIII_MASCULINE_ACTIVE_PARTICIPLE"
  }

  final case object FORM_VIII_FEMININE_ACTIVE_PARTICIPLE
      extends Noun(
        createRootWord(
          1,
          3,
          4,
          MEEM_WITH_DAMMA,
          FA_WITH_SUKUN,
          TA_WITH_FATHA,
          AIN_WITH_KASRA,
          LAM_WITH_FATHA,
          TA_MARBUTA_WITH_DAMMATAN
        ),
        true
      ) {
    override val name: String = "FORM_VIII_FEMININE_ACTIVE_PARTICIPLE"
  }

  final case object FORM_VIII_MASCULINE_PASSIVE_PARTICIPLE
      extends Noun(
        createRootWord(1, 3, 4, MEEM_WITH_DAMMA, FA_WITH_SUKUN, TA_WITH_FATHA, AIN_WITH_FATHA, LAM_WITH_DAMMATAN)
      ) {
    override val name: String = "FORM_VIII_MASCULINE_PASSIVE_PARTICIPLE"
  }

  final case object FORM_VIII_FEMININE_PASSIVE_PARTICIPLE
      extends Noun(
        createRootWord(
          1,
          3,
          4,
          MEEM_WITH_DAMMA,
          FA_WITH_SUKUN,
          TA_WITH_FATHA,
          AIN_WITH_FATHA,
          LAM_WITH_FATHA,
          TA_MARBUTA_WITH_DAMMATAN
        ),
        true
      ) {
    override val name: String = "FORM_VIII_FEMININE_PASSIVE_PARTICIPLE"
  }

  final case object FORM_IX_MASCULINE_ACTIVE_PARTICIPLE
      extends Noun(createRootWord(1, 2, 3, MEEM_WITH_DAMMA, FA_WITH_SUKUN, AIN_WITH_KASRA, LAM_WITH_DAMMATAN)) {
    override val name: String = "FORM_IX_MASCULINE_ACTIVE_PARTICIPLE"
  }

  final case object FORM_IX_FEMININE_ACTIVE_PARTICIPLE
      extends Noun(
        createRootWord(
          1,
          2,
          3,
          MEEM_WITH_DAMMA,
          FA_WITH_SUKUN,
          AIN_WITH_KASRA,
          LAM_WITH_FATHA,
          TA_MARBUTA_WITH_DAMMATAN
        ),
        true
      ) {
    override val name: String = "FORM_IX_FEMININE_ACTIVE_PARTICIPLE"
  }

  final case object FORM_X_MASCULINE_ACTIVE_PARTICIPLE
      extends Noun(
        createRootWord(
          3,
          4,
          5,
          MEEM_WITH_DAMMA,
          SEEN_WITH_SUKUN,
          TA_WITH_FATHA,
          FA_WITH_SUKUN,
          AIN_WITH_KASRA,
          LAM_WITH_DAMMATAN
        )
      ) {
    override val name: String = "FORM_X_MASCULINE_ACTIVE_PARTICIPLE"
  }

  final case object FORM_X_FEMININE_ACTIVE_PARTICIPLE
      extends Noun(
        createRootWord(
          3,
          4,
          5,
          MEEM_WITH_DAMMA,
          SEEN_WITH_SUKUN,
          TA_WITH_FATHA,
          FA_WITH_SUKUN,
          AIN_WITH_KASRA,
          LAM_WITH_FATHA,
          TA_MARBUTA_WITH_DAMMATAN
        ),
        true
      ) {
    override val name: String = "FORM_X_FEMININE_ACTIVE_PARTICIPLE"
  }

  final case object FORM_X_MASCULINE_PASSIVE_PARTICIPLE
      extends Noun(
        createRootWord(
          3,
          4,
          5,
          MEEM_WITH_DAMMA,
          SEEN_WITH_SUKUN,
          TA_WITH_FATHA,
          FA_WITH_SUKUN,
          AIN_WITH_FATHA,
          LAM_WITH_DAMMATAN
        )
      ) {
    override val name: String = "FORM_X_MASCULINE_PASSIVE_PARTICIPLE"
  }

  final case object FORM_X_FEMININE_PASSIVE_PARTICIPLE
      extends Noun(
        createRootWord(
          3,
          4,
          5,
          MEEM_WITH_DAMMA,
          SEEN_WITH_SUKUN,
          TA_WITH_FATHA,
          FA_WITH_SUKUN,
          AIN_WITH_FATHA,
          LAM_WITH_FATHA,
          TA_MARBUTA_WITH_DAMMATAN
        ),
        true
      ) {
    override val name: String = "FORM_X_FEMININE_PASSIVE_PARTICIPLE"
  }

  final case object NOUN_OF_PLACE_AND_TIME_V1
      extends Noun(
        createRootWord(1, 2, 3, MEEM_WITH_FATHA, FA_WITH_SUKUN, AIN_WITH_FATHA, LAM_WITH_DAMMATAN),
        false,
        Flexibility.PARTLY_FLEXIBLE
      ) {
    override val name: String = "NOUN_OF_PLACE_AND_TIME_V1"
  }

  final case object NOUN_OF_PLACE_AND_TIME_V2
      extends Noun(
        createRootWord(1, 2, 3, MEEM_WITH_FATHA, FA_WITH_SUKUN, AIN_WITH_KASRA, LAM_WITH_DAMMATAN),
        false,
        Flexibility.PARTLY_FLEXIBLE
      ) {
    override val name: String = "NOUN_OF_PLACE_AND_TIME_V2"
  }

  final case object NOUN_OF_PLACE_AND_TIME_V3
      extends Noun(
        createRootWord(
          1,
          2,
          3,
          MEEM_WITH_FATHA,
          FA_WITH_SUKUN,
          AIN_WITH_FATHA,
          LAM_WITH_FATHA,
          TA_MARBUTA_WITH_DAMMATAN
        ),
        true
      ) {
    override val name: String = "NOUN_OF_PLACE_AND_TIME_V3"
  }

}
