package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        textViewName.text = intent.extras?.getString("NAME", "")
        textViewLastName.text = intent.extras?.getString("LASTNAME", "")
        textViewAge.text = intent.extras?.getInt("AGE").toString()



        Toast.makeText(this, "ბნ. ნიკოლოზ ნუ გამწირავ \uD83D\uDE25 სამსახურში ბევრს ვმუშაობ \uD83D\uDE2D", Toast.LENGTH_LONG).show()
    }
}