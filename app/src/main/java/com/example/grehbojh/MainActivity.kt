package com.example.grehbojh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.InputType
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_main.inputedWeight

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val planets = resources.getStringArray(R.array.Planets)


        val spinner = findViewById<Spinner>(R.id.listSpinner)
        if (spinner != null) {
            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item, planets
            )
            spinner.adapter = adapter
            spinner.setBackgroundColor()

            spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                    view: View, position: Int, id: Long) {
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {

                }
            }

                goButton.setOnClickListener {
                    var inputText = inputedWeight.text
                    var intent = Intent(this, GoActivity::class.java)
                    intent.putExtra("position",spinner.selectedItemPosition)
                    intent.putExtra("weigh", inputText)
                    startActivity(intent)
                }
        }
    }
}



private fun Spinner.setBackgroundColor() {
    listSpinner.setBackgroundColor(255-255-255)
}

