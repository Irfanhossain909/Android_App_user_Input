package com.rootcode.firstsplashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class logFormResult : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_form_result)

        val homebtnreg1 = findViewById<Button>(R.id.logbtnreshome)

        homebtnreg1.setOnClickListener {
            var intent = Intent(this,secondHomeP::class.java)
            startActivity(intent)
        }

        val logresultuser = findViewById<TextView>(R.id.edilogresultuser)
        val logresultpass = findViewById<TextView>(R.id.edilogresultpassword)

        val User = intent.getStringExtra("loguser")
        val Pass = intent.getStringExtra("logpass")

        logresultuser.setText("Username :"+User)
        logresultpass.setText("Password :"+Pass)
    }
}