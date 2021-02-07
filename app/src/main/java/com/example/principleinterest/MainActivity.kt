package com.example.principleinterest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val erroryear = Toast.makeText(applicationContext,"Please change years.", Toast.LENGTH_LONG)
        var totalall = 0

        calculate.setOnClickListener(){
            if (year > 0 && year < 4){
//                totalall = 0
                addprin * 3% = totalall
                var totalprininter = findViewById<TextView>(R.id.totalprininter)
                totalprininter.setText("$totalall")
            } else {
                if (year > 3 && year < 8){
//                totalall = 0
                    addprin * 5% = totalall
//                var totalprininter = findViewById<TextView>(R.id.totalprininter)
                    totalprininter.setText("$totalall")
                } else {
                    if (year > 7 && year < 11){
//                totalall = 0
                        addprin * 7% = totalall
//                var totalprininter = findViewById<TextView>(R.id.totalprininter)
                        totalprininter.setText("$totalall")
                    } else {
                        erroryear.show()
                    }
                }
            }
        }

        clear.setOnClickListener(){
            totalall = 0
            totalprininter.setText("$totalall")
            var toastreset = Toast.makeText(applicationContext,"Reset value",Toast.LENGTH_LONG)
            toastreset.show()

            year.setText(null)
            addprin.setText(null)
        }
    }
}