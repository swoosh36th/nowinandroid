package com.google.samples.apps.nowinandroid.ui.homeworks.homework15.pages

import androidx.compose.ui.test.SemanticsNodeInteractionsProvider
import com.google.samples.apps.nowinandroid.core.designsystem.component.C
import io.github.kakaocup.compose.node.element.ComposeScreen
import io.github.kakaocup.compose.node.element.KNode

class SearchScreen(
  semanticsProvider: SemanticsNodeInteractionsProvider
) : ComposeScreen<SearchScreen>(semanticsProvider) {
  val backButton = KNode(semanticsProvider) { hasTestTag(C.SEARCH_SCREEN_BACK_BUTTON) }
  val searchInput = KNode(semanticsProvider) { hasTestTag(C.SEARCH_SCREEN_TEXT_INPUT) }
}