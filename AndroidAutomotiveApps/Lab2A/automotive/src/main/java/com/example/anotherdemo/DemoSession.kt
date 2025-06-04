package com.example.anotherdemo

import android.content.Intent
import androidx.car.app.Screen
import androidx.car.app.Session

class DemoSession : Session() {
    override fun onCreateScreen(intent: Intent): Screen {
        return FirstScreen(carContext)
    }
}