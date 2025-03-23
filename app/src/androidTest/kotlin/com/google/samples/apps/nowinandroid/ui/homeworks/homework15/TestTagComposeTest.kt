package com.google.samples.apps.nowinandroid.ui.homeworks.homework15

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import com.google.samples.apps.nowinandroid.MainActivity
import com.google.samples.apps.nowinandroid.ui.homeworks.homework15.pages.MainScreen
import com.google.samples.apps.nowinandroid.ui.homeworks.homework15.pages.SearchScreen
import com.kaspersky.components.composesupport.config.withComposeSupport
import com.kaspersky.kaspresso.kaspresso.Kaspresso
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test

class TestTagComposeTest : TestCase(Kaspresso.Builder.withComposeSupport()) {
  @get:Rule
  val composeTestRule = createAndroidComposeRule<MainActivity>()
  val mainScreen = MainScreen(composeTestRule)
  val searchScreen by lazy { SearchScreen(composeTestRule) }

  @Test
  fun mainScreenTest() {
    run {
      mainScreen {
        step("Verify 'Main' screen title text") {
          mainTitleLocator.assertTextEquals("Now in Android")
        }
        step("Verify 'Search' button is enabled") {
          searchButton.assertIsEnabled()
        }
        step("Verify 'Settings' button is displayed") {
          settingsButton.assertIsDisplayed()
        }
        step("Verify 'For you' screen main title text") {
          forYouMainTitleLocator.assertTextEquals("What are you interested in?")
        }
        step("Verify 'For you' screen sub title text") {
          forYouSubTitleLocator.assertTextContains("updates", substring = true, ignoreCase = true)
        }
        step("Verify 'Done' button is displayed") {
          doneButton.assertIsDisplayed()
        }
        step("Verify 'For you' button is displayed") {
          forYouButton.assertIsDisplayed()
        }
        step("Verify 'Saved' button is displayed") {
          savedButton.assertIsDisplayed()
        }
        step("Verify 'Interests' button is displayed") {
          interestsButton.assertIsDisplayed()
        }
      }
    }
  }

  @Test
  fun searchScreenTest() {
    run {
      mainScreen {
        step("Verify 'Main' screen title is displayed") {
          mainTitleLocator.assertIsDisplayed()
        }
        step("Click 'Search' button") {
          searchButton {
            assertIsDisplayed()
            performClick()
          }
        }
      }
      searchScreen {
        step("Verify 'Back' button is displayed") {
          backButton.assertIsDisplayed()
        }
        step("Verify 'Search' input is enabled") {
          searchInput.assertIsEnabled()
        }
      }
    }
  }
}