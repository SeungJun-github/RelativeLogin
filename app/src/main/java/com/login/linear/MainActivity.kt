package com.login.linear

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageGoogleLogo = findViewById<ImageView>(R.id.image_google_logo)
        val textLoginGuide = findViewById<TextView>(R.id.text_login_guide)
        val textResult = findViewById<TextView>(R.id.text_result)
        val editId = findViewById<EditText>(R.id.edit_id)
        val editPassword = findViewById<EditText>(R.id.edit_password)
        val btnLogin = findViewById<Button>(R.id.btn_login)

        btnLogin.setOnClickListener(View.OnClickListener() {
            var result = editId.text.toString() + "님 환영합니다!"
            textResult.text = result
        })
    }
}