package com.example.anotherdemo

import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.MessageTemplate
import androidx.car.app.model.Template

class SecondScreen(carContext: CarContext , val title : String ,val desc : String) : Screen(carContext) {
    override fun onGetTemplate(): Template {
        val msgtemp = MessageTemplate.Builder("This is $title")
            .build()

        return msgtemp
    }
}