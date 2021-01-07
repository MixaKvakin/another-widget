package com.tommasoberlose.anotherwidget.ui.viewmodels

import androidx.lifecycle.*
import com.chibatching.kotpref.livedata.asLiveData
import com.tommasoberlose.anotherwidget.global.Preferences

class MainViewModel : ViewModel() {

    // General Settings
    val textGlobalColor = MediatorLiveData<Boolean>().apply {
        addSource(Preferences.asLiveData(Preferences::textGlobalColor)) { value = true }
        addSource(Preferences.asLiveData(Preferences::textGlobalAlpha)) { value = true }
    }
    val textSecondaryColor = MediatorLiveData<Boolean>().apply {
        addSource(Preferences.asLiveData(Preferences::textSecondaryColor)) { value = true }
        addSource(Preferences.asLiveData(Preferences::textSecondaryAlpha)) { value = true }
    }
    val backgroundCardColor = MediatorLiveData<Boolean>().apply {
        addSource(Preferences.asLiveData(Preferences::backgroundCardColor)) { value = true }
        addSource(Preferences.asLiveData(Preferences::backgroundCardAlpha)) { value = true }
    }
    val textGlobalColorDark = MediatorLiveData<Boolean>().apply {
        addSource(Preferences.asLiveData(Preferences::textGlobalColorDark)) { value = true }
        addSource(Preferences.asLiveData(Preferences::textGlobalAlphaDark)) { value = true }
    }
    val textSecondaryColorDark = MediatorLiveData<Boolean>().apply {
        addSource(Preferences.asLiveData(Preferences::textSecondaryColorDark)) { value = true }
        addSource(Preferences.asLiveData(Preferences::textSecondaryAlphaDark)) { value = true }
    }
    val backgroundCardColorDark = MediatorLiveData<Boolean>().apply {
        addSource(Preferences.asLiveData(Preferences::backgroundCardColorDark)) { value = true }
        addSource(Preferences.asLiveData(Preferences::backgroundCardAlphaDark)) { value = true }
    }
    val textMainSize = Preferences.asLiveData(Preferences::textMainSize)
    val textSecondSize = Preferences.asLiveData(Preferences::textSecondSize)
    val textShadow = Preferences.asLiveData(Preferences::textShadow)
    val textShadowDark = Preferences.asLiveData(Preferences::textShadowDark)
    val font = MediatorLiveData<Boolean>().apply {
        addSource(Preferences.asLiveData(Preferences::customFont)) { value = true }
        addSource(Preferences.asLiveData(Preferences::customFontFile)) { value = true }
        addSource(Preferences.asLiveData(Preferences::customFontName)) { value = true }
        addSource(Preferences.asLiveData(Preferences::customFontVariant)) { value = true }
    }

    val secondRowInformation = Preferences.asLiveData(Preferences::secondRowInformation)
    val showDividers = Preferences.asLiveData(Preferences::showDividers)
    val secondRowTopMargin = Preferences.asLiveData(Preferences::secondRowTopMargin)

    // Calendar Settings
    val showEvents = Preferences.asLiveData(Preferences::showEvents)
    val calendarAllDay = Preferences.asLiveData(Preferences::calendarAllDay)
    val showUntil = Preferences.asLiveData(Preferences::showUntil)
    val showDiffTime = Preferences.asLiveData(Preferences::showDiffTime)
    val showNextEvent = Preferences.asLiveData(Preferences::showNextEvent)
    val openEventDetails = Preferences.asLiveData(Preferences::openEventDetails)
    val calendarAppName = Preferences.asLiveData(Preferences::calendarAppName)
    val widgetUpdateFrequency = Preferences.asLiveData(Preferences::widgetUpdateFrequency)

    // Clock Settings
    val showClock = Preferences.asLiveData(Preferences::showClock)
    val clockTextSize = Preferences.asLiveData(Preferences::clockTextSize)
    val clockTextColor = MediatorLiveData<Boolean>().apply {
        addSource(Preferences.asLiveData(Preferences::clockTextColor)) { value = true }
        addSource(Preferences.asLiveData(Preferences::clockTextAlpha)) { value = true }
    }
    val clockTextColorDark = MediatorLiveData<Boolean>().apply {
        addSource(Preferences.asLiveData(Preferences::clockTextColorDark)) { value = true }
        addSource(Preferences.asLiveData(Preferences::clockTextAlphaDark)) { value = true }
    }
    val showAMPMIndicator = Preferences.asLiveData(Preferences::showAMPMIndicator)

    val clockAppName = Preferences.asLiveData(Preferences::clockAppName)
    val dateFormat = Preferences.asLiveData(Preferences::dateFormat)
    val clockBottomMargin = Preferences.asLiveData(Preferences::clockBottomMargin)

    // Weather Settings
    val showWeather = Preferences.asLiveData(Preferences::showWeather)
    val weatherTempUnit = Preferences.asLiveData(Preferences::weatherTempUnit)
    val weatherRefreshPeriod = Preferences.asLiveData(Preferences::weatherRefreshPeriod)

    val weatherAppName = Preferences.asLiveData(Preferences::weatherAppName)

    val customLocationAdd = Preferences.asLiveData(Preferences::customLocationAdd)

    val weatherIconPack = Preferences.asLiveData(Preferences::weatherIconPack)
    val weatherProvider = Preferences.asLiveData(Preferences::weatherProvider)
    val weatherProviderError = Preferences.asLiveData(Preferences::weatherProviderError)
    val weatherProviderLocationError = Preferences.asLiveData(Preferences::weatherProviderLocationError)

    // Advanced Settings
    val darkThemePreference = Preferences.asLiveData(Preferences::darkThemePreference)
    val showWallpaper = Preferences.asLiveData(Preferences::showWallpaper)
    val showPreview = Preferences.asLiveData(Preferences::showPreview)
    val installedIntegrations = Preferences.asLiveData(Preferences::installedIntegrations)

    // UI
    val fragmentScrollY = MutableLiveData<Int>()
}
