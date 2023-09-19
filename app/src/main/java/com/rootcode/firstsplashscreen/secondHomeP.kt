package com.rootcode.firstsplashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.Toolbar

class secondHomeP : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_home_p)
        val regiform = findViewById<Button>(R.id.regibut)
        val logform = findViewById<Button>(R.id.loginbut)

        regiform.setOnClickListener {
            var intent = Intent(this,registationForm::class.java)
            startActivity(intent)
        }

        logform.setOnClickListener {
            var intent = Intent(this,logFrom::class.java)
            startActivity(intent)
        }
    }

}