package com.example.rock_paper_scissors

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        val start: Button = findViewById(R.id.start)

        start.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}