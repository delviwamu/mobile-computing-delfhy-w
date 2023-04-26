package com.example.loginsaya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class LogoutActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnlogin : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logout)

        btnlogin = findViewById(R.id.btn_login)
        btnlogin.setOnClickListener(this)
    }

    override fun onClick(v: View) {

        when(v.id){
            R.id.btn_login -> kotlin.run {
                val intentLogin = Intent(this@LogoutActivity,MainActivity::class.java)
                startActivity(intentLogin)
            }
        }

    }
}