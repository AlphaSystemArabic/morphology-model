package com.alphasystem.arabic.morphology.conjugation.engine

import com.alphasystem.arabic.model.{ NamedTemplate, RootType, VerbType, WeakVerbType }
import com.alphasystem.arabic.morphology.model.support.{ PageOrientation, SortDirection, SortDirective }

/**
  * @author sali
  */
package object models {

  case class ChartMode(template: NamedTemplate = NamedTemplate.FORM_I_CATEGORY_A_GROUP_U_TEMPLATE,
                       rootType: RootType = RootType.CONSONANT,
                       verbType: VerbType = VerbType.CONSONANT,
                       weakVerbType: Option[WeakVerbType] = None)

  case class ConjugationConfiguration(removePassiveLine: Boolean = false, skipRuleProcessing: Boolean = false)

  case class PageOption(orientation: PageOrientation = PageOrientation.LANDSCAPE)

  case class ChartConfiguration(omitToc: Boolean = false,
                                omitAbbreviatedConjugation: Boolean = false,
                                omitDetailedConjugation: Boolean = false,
                                omitTitle: Boolean = false,
                                omitHeader: Boolean = false,
                                omitSarfTermCaption: Boolean = false,
                                sortDirective: SortDirective = SortDirective.NONE,
                                sortDirection: SortDirection = SortDirection.ASCENDING,
                                arabicFontFamily: String,
                                translationFontFamily: String,
                                arabicFontSize: Int = 16,
                                translationFontSize: Int = 10,
                                headingFontSize: Long = 24,
                                pageOption: PageOption = PageOption())

}
