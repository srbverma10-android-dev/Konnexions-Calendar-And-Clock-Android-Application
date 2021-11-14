package com.sourabhverma.konnexionscalendarandclockandroidapplication

import android.os.Build
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextClock
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doOnTextChanged
import com.google.android.material.snackbar.Snackbar

class ClockActivity : AppCompatActivity() {

    private lateinit var clock : TextClock
    private lateinit var parentLayout : LinearLayout

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clock)
        clock = findViewById(R.id.text_clock)
        parentLayout = findViewById(R.id.parentLayout)
        clock.doOnTextChanged { text, _, _, _ ->
            text?.let { Snackbar.make(parentLayout, it, Snackbar.LENGTH_SHORT).show() }
        }
    }
}