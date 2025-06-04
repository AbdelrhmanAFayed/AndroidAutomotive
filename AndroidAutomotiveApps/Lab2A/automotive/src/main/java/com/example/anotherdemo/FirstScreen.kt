package com.example.anotherdemo

import android.widget.Toast
import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.ScreenManager
import androidx.car.app.model.ItemList
import androidx.car.app.model.ListTemplate
import androidx.car.app.model.MessageTemplate
import androidx.car.app.model.Row
import androidx.car.app.model.Template

class FirstScreen(carContext: CarContext) : Screen(carContext) {
    override fun onGetTemplate(): Template {
        val row1 = Row.Builder()
            .setTitle("First Item")
            .addText("Description")
            .setOnClickListener {
                screenManager.push(SecondScreen(carContext,"First Item","Description"))
            }
            .build()
        val row2 = Row.Builder()
            .setTitle("Second Item")
            .addText("Description")
            .setOnClickListener {
                screenManager.push(SecondScreen(carContext,"Second Item","Description"))
            }
            .build()
        val row3 = Row.Builder()
            .setTitle("Third Item")
            .addText("Description")
            .setOnClickListener {
                screenManager.push(SecondScreen(carContext,"Third Item","Description"))
            }
            .build()
        val row4 = Row.Builder()
            .setTitle("Fourth Item")
            .addText("Description")
            .setOnClickListener {
                screenManager.push(SecondScreen(carContext,"Fourth Item","Description"))
            }
            .build()
        val row5 = Row.Builder()
            .setTitle("Fifth Item")
            .addText("Description")
            .setOnClickListener {
                screenManager.push(SecondScreen(carContext,"Fifth Item","Description"))
            }
            .build()

        val itemList = ItemList.Builder()
            .addItem(row1)
            .addItem(row2)
            .addItem(row3)
            .addItem(row4)
            .addItem(row5)
            .build()
        val listTemplate = ListTemplate.Builder()
            .setSingleList(itemList)
            .setTitle("My Items")
            .build()
        return listTemplate
    }
}