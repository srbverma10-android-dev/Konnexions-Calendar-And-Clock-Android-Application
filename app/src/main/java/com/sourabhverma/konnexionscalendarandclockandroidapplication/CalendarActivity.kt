package com.sourabhverma.konnexionscalendarandclockandroidapplication

import android.os.Bundle
import android.text.format.DateFormat
import android.widget.CalendarView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class CalendarActivity : AppCompatActivity() {

    private lateinit var calendarView: CalendarView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)

        init()

        val dateMillis: Long = calendarView.date
        val date = Date(dateMillis)

        val selectedDay = DateFormat.format("dd", date) as String
        val selectedMonthNumber = DateFormat.format("MM", date) as String
        val selectedYear = DateFormat.format("yyyy", date) as String

        var strFormattedSelectedDate = "$selectedDay-$selectedMonthNumber-$selectedYear"
        Toast.makeText(applicationContext, "Selected Date = $strFormattedSelectedDate", Toast.LENGTH_SHORT).show()

        calendarView.setOnDateChangeListener { _, year, month, day ->
            strFormattedSelectedDate = "$day-${month+1}-$year"
            Toast.makeText(applicationContext, "Selected Date = $strFormattedSelectedDate", Toast.LENGTH_SHORT).show()
        }
    }

    private fun init(){
        calendarView = findViewById(R.id.calendarView)
    }

}