package com.rootcode.firstsplashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class logFrom : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_from)

        val logResbtn = findViewById<Button>(R.id.logbtnresult)
        val loguser = findViewById<EditText>(R.id.ediloguser)
        val logpass = findViewById<EditText>(R.id.edilogpassword)

        logResbtn.setOnClickListener {
            val Loguser:String = loguser.getText().toString()
            val Logpass:String = logpass.getText().toString()

            var intent = Intent(this,logFormResult::class.java)

            intent.putExtra("loguser",Loguser)
            intent.putExtra("logpass",Logpass)
            startActivity(intent)
        }
    }
}