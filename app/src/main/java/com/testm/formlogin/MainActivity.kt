package com.testm.formlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun login(view: View){
        val username = findViewById(R.id.et_username) as EditText
        val password = findViewById(R.id.et_password) as EditText
        val usernameStr = username.text.toString()
        val passwordStr = password.text.toString()
        val intent = Intent(this, Dashboard::class.java)


        if (usernameStr == "yoga" && passwordStr == "1234" ){
            startActivity(intent)
            Toast.makeText(this, "Login Sukses", Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(this, "Login Gagal", Toast.LENGTH_SHORT).show()
        }

    }
}
