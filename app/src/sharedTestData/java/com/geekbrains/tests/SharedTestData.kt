package com.geekbrains.tests

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice

internal const val TEST_NUMBER = 42
internal const val TEST_NUMBER_OF_RESULTS_ZERO = "Number of results: 0"
internal const val TEST_NUMBER_OF_RESULTS_PLUS_1 = "Number of results: 1"
internal const val TEST_NUMBER_OF_RESULTS_MINUS_1 = "Number of results: -1"

fun getUiDevice(): UiDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())

fun getContext() = ApplicationProvider.getApplicationContext<Context>()