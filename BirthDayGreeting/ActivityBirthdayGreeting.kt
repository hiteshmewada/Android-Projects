package com.example.birthdaygreet

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ActivityBirthdayGreeting : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)
        val name= intent.getStringExtra(NAME_EXTRA)
        val textView = findViewById<TextView>(R.id.BirthdayGreeting)
        textView.text="Happy Birthday $name"

    }
}