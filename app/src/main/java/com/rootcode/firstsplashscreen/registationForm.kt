package com.rootcode.firstsplashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class registationForm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registation_form)

        val regiresult = findViewById<Button>(R.id.regiresultbtn)

        val regiuser = findViewById<EditText>(R.id.ediregiuser)
        val regiemail = findViewById<EditText>(R.id.ediregiemail)
        val regipass = findViewById<EditText>(R.id.ediregiepass)

        regiresult.setOnClickListener {

            var Regiuser:String = regiuser.getText().toString()
            var Regiemail:String = regiemail.getText().toString()
            var Regipass:String = regipass.getText().toString()
            var intent = Intent(this,registationFormResult::class.java)


            intent.putExtra("reginame",Regiuser)
            intent.putExtra("regimail",Regiemail)
            intent.putExtra("regipass",Regipass)


            startActivity(intent)
        }
    }
}