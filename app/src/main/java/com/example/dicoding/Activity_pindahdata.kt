package com.example.dicoding

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Activity_pindahdata : AppCompatActivity() {

    companion object {
        const val EXTRA_AGE = "extra_age"
        const val  EXTRA_NAME = "extra_name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pindahdata)

        val tvDataReceived : TextView = findViewById(R.id.tv_data_received)
        val name = intent.getStringExtra(EXTRA_NAME)
        val age = intent.getIntExtra(EXTRA_AGE, 0)

        val text = "Name : $name, Your age : $age"
        tvDataReceived.text = text
    }
}