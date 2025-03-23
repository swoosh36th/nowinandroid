package com.google.samples.apps.nowinandroid.ui.homeworks.homework15.pages

import androidx.compose.ui.test.SemanticsNodeInteractionsProvider
import com.google.samples.apps.nowinandroid.core.designsystem.component.C
import io.github.kakaocup.compose.node.element.ComposeScreen
import io.github.kakaocup.compose.node.element.KNode

class MainScreen(
  semanticsProvider: SemanticsNodeInteractionsProvider
) : ComposeScreen<MainScreen>(semanticsProvider) {
  val searchButton = KNode(semanticsProvider) { hasTestTag(C.TOP_APP_BAR_SEARCH_BUTTON) }
  val mainTitleLocator = KNode(semanticsProvider) { hasTestTag(C.TOP_APP_BAR_MAIN_TITLE) }
  val settingsButton = KNode(semanticsProvider) { hasTestTag(C.TOP_APP_BAR_SETTINGS_BUTTON) }
  val forYouMainTitleLocator = KNode(semanticsProvider) { hasTestTag(C.FOR_YOU_SCREEN_MAIN_TITLE) }
  val forYouSubTitleLocator = KNode(semanticsProvider) { hasTestTag(C.FOR_YOU_SCREEN_SUB_TITLE) }
  val doneButton = KNode(semanticsProvider) { hasTestTag(C.FOR_YOU_SCREEN_DONE_BUTTON) }
  val forYouButton = KNode(semanticsProvider) {
    hasTestTag("NiaNavItem")
    hasText("For you")
  }
  val savedButton = KNode(semanticsProvider) {
    hasTestTag("NiaNavItem")
    hasText("Saved")
  }
  val interestsButton = KNode(semanticsProvider) {
    hasTestTag("NiaNavItem")
    hasText("Interests")
  }
}