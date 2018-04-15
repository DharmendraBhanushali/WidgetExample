package com.dharmendra.widgetexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //FindViewByID for All your Widget


        val textView = findViewById<TextView>(R.id.textViewName) as TextView

        val button = findViewById<Button>(R.id.button) as Button

        val editText = findViewById<EditText>(R.id.editTextName) as EditText


        //Now we Create OnClickListner for Button Click which get Value from EditText and Set in Textview

        button.setOnClickListener {

            //Get Data from Edittext and Store in String

            var name: String = editText.text.toString()

            //set Value in TextView if name is not Empty other wise Display toast Message

            if (name.isEmpty()) {
                Toast.makeText(this@MainActivity, "Please Enter Something in EditText", Toast.LENGTH_LONG).show()
                textView.setText("")
            } else {
                textView.setText("Hello " + name)
            }

        }

    }
}