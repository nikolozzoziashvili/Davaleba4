package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.activity_third.*
import kotlinx.android.synthetic.main.activity_third.finishButton

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val name = intent.extras?.getString("NAME", "")
        val lastName = intent.extras?.getString("LASTNAME", "")

        finishButton.setOnClickListener{
            val ageText: String = editTextAge.text.trim().toString()

            if (ageText.isEmpty()){
                Toast.makeText(this, "Please input your age", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            var age: Int = ageText.toInt()

            val intent = Intent(this, FinishActivity::class.java)
            intent.putExtra("NAME", name)
            intent.putExtra("LASTNAME", lastName)
            intent.putExtra("AGE", age)
            finish()
            startActivity(intent)
        }
    }
}