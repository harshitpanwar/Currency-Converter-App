package com.example.currencyconverter

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

//setting up Application class for dagger hilt

@HiltAndroidApp
class CurrencyApplication : Application()