package com.example.compose

import androidx.compose.ui.test.assert
import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.junit4.AndroidComposeTestRule
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import io.qameta.allure.android.allureScreenshot
import io.qameta.allure.android.runners.AllureAndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AllureAndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule
    val compose = createAndroidComposeRule<MainActivity>()


    @Test
    fun useAppContext(){
        compose.apply {
            setContent {
                Hello(name = "Text")
            }
            onNodeWithTag("Text").assertTextEquals("Hello Text")

        }
        allureScreenshot("useAppContext")
    }
}