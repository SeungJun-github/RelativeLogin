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

        val imagKakaoLogo = findViewById<ImageView>(R.id.image_kakao_logo)
        val textLoginGuide = findViewById<TextView>(R.id.text_login_guide)
        val textResult = findViewById<TextView>(R.id.text_result)
        val editId = findViewById<EditText>(R.id.edit_id)
        val editPassword = findViewById<EditText>(R.id.edit_password)
        val btnLogin = findViewById<Button>(R.id.btn_login)

        btnLogin.setOnClickListener(View.OnClickListener() {
            var result = editId.text.toString() + "님 환영합니다!"
            var password = editPassword.text.toString()
            if(password=="bcsd")textResult.text = result
            else textResult.text = "비밀번호가 틀렸습니다. 다시 확인해주세요!"
        })

    }
}