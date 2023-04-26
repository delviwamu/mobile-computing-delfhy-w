package com.example.loginsaya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class RegisterActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnregister : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btnregister = findViewById(R.id.btn_register)
        btnregister.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_register -> kotlin.run {
                val intentRegister = Intent(this@RegisterActivity, ContentActivity::class.java)
                startActivity(intentRegister)
            }
        }
    }
}