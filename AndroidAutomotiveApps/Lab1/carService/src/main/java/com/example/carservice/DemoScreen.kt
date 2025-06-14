package com.example.carservice

import android.util.Log
import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.MessageTemplate
import androidx.car.app.model.Template
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class DemoScreen(carContext: CarContext) : Screen(carContext), DefaultLifecycleObserver {

    init{
        lifecycle.addObserver(this)
    }


    val TAG = "AndroidAutoDemoScreen"


    override fun onGetTemplate(): Template {
        Log.i(TAG, "onGetTemplate: ")
        return MessageTemplate.Builder("Hello Android Auto").build()
    }


    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
        Log.i(TAG, "onCreate: ")
    }

    override fun onDestroy(owner: LifecycleOwner) {
        super.onDestroy(owner)
        Log.i(TAG, "onDestroy: ")
    }

    override fun onPause(owner: LifecycleOwner) {
        super.onPause(owner)
        Log.i(TAG, "onPause: ")
    }

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        Log.i(TAG, "onResume: ")
    }

    override fun onStart(owner: LifecycleOwner) {
        super.onStart(owner)
        Log.i(TAG, "onStart: ")
    }

    override fun onStop(owner: LifecycleOwner) {
        super.onStop(owner)
        Log.i(TAG, "onStop: ")
    }
}