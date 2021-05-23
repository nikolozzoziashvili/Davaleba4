package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val name = intent.extras?.getString("NAME", "")

        buttonNextNext.setOnClickListener{

            val lastName: String = editTextPersonLastName.text.trim().toString()

            if (lastName.isEmpty()) {
                Toast.makeText(this, "Please input your last name", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val intent: Intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("NAME", name)
            intent.putExtra("LASTNAME", lastName)
            finish()
            startActivity(intent)
        }
    }
}