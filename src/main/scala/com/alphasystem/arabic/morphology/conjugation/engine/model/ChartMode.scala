package com.alphasystem.arabic.morphology.conjugation.engine.model

import com.alphasystem.arabic.model.{NamedTemplate, RootType, VerbType, WeakVerbType}

/**
  * @author sali
  */
case class ChartMode(template: NamedTemplate = NamedTemplate.FORM_I_CATEGORY_A_GROUP_U_TEMPLATE,
                     rootType: RootType = RootType.CONSONANT,
                     verbType: VerbType = VerbType.CONSONANT,
                     weakVerbType: Option[WeakVerbType] = None)
