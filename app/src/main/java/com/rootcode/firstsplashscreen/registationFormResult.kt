package com.rootcode.firstsplashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class registationFormResult : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registation_form_result)

        val homebtnreg = findViewById<Button>(R.id.loghoperes)

        homebtnreg.setOnClickListener {
            var intent = Intent(this,secondHomeP::class.java)
            startActivity(intent)
        }

        val regiresultuser = findViewById<TextView>(R.id.ediregiresultuser)
        val regiresultemail = findViewById<TextView>(R.id.ediregiresultemail)
        val regiresultpass = findViewById<TextView>(R.id.ediregiresultpassword)

        val USER = intent.getStringExtra("reginame")
        val EMAIL = intent.getStringExtra("regimail")
        val PASS = intent.getStringExtra("regipass")

        regiresultuser.setText("Username: "+USER)
        regiresultemail.setText("Email :"+EMAIL)
        regiresultpass.setText("Password :"+PASS)
    }
}