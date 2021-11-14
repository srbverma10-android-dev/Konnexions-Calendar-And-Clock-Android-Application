package com.sourabhverma.konnexionscalendarandclockandroidapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var buttonCalendar : Button
    private lateinit var buttonClock : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        setOnClickListeners()

    }

    private fun setOnClickListeners() {
        buttonCalendar.setOnClickListener {
            Toast.makeText(this, "Opening Calendar", Toast.LENGTH_SHORT).show()
            val openCalendarActivity = Intent(this, CalendarActivity::class.java)
            startActivity(openCalendarActivity)
        }
        buttonClock.setOnClickListener {
            Toast.makeText(this, "Opening Clock", Toast.LENGTH_SHORT).show()
            val openCalendarActivity = Intent(this, ClockActivity::class.java)
            startActivity(openCalendarActivity)
        }
    }

    private fun init(){
        buttonCalendar = findViewById(R.id.open_Calendar)
        buttonClock = findViewById(R.id.open_Clock)
    }

}