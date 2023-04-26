package com.example.loginsaya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ContentActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var contentActivity: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content)

        contentActivity = findViewById(R.id.btn_content)
        contentActivity.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_content -> kotlin.run {
                val intentContent = Intent(this@ContentActivity, LogoutActivity::class.java)
                startActivity(intentContent)
            }
        }
    }
}