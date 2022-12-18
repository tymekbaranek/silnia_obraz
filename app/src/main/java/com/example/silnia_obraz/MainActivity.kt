package com.example.silnia_obraz

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val silniaRun = findViewById<Button>(R.id.Silniastart)
        val silniaInput = findViewById<EditText>(R.id.Silniapodaj)

        silniaRun.setOnClickListener{
            val inputint = silniaInput.text.toString().toInt()
            if (inputint > 10  || inputint < 0) {
                val blad = "Zła liczba"
                findViewById<TextView>(R.id.Silniawynik).text = (blad)
            } else {
                var liczbaZSilnia = 1
                if (inputint == 0 || inputint == 1) {
                    liczbaZSilnia = 1
                } else {
                    for (i in 2..inputint)
                        liczbaZSilnia *= i
                }
                val text = liczbaZSilnia.toString()
                findViewById<TextView>(R.id.Silniawynik).text = (text)
            }
        }
        var przesuniecieP = 3
        findViewById<Button>(R.id.PrzyciskP).setOnClickListener {
            if (przesuniecieP > 0){
                if (przesuniecieP%3==0){
                    findViewById<ImageView>(R.id.zdj1).setImageResource(R.drawable.zdj2)}

                if (przesuniecieP%3==1){
                    findViewById<ImageView>(R.id.zdj1).setImageResource(R.drawable.zdj3)}

                if (przesuniecieP%3==2){
                    findViewById<ImageView>(R.id.zdj1).setImageResource(R.drawable.zdj1)}
            }
            przesuniecieP+=1
        }

        var przesuniecieL = 3
        findViewById<Button>(R.id.PrzyciskL).setOnClickListener {
            if (przesuniecieL > 0){
                if (przesuniecieL%3==0){
                    findViewById<ImageView>(R.id.zdj1).setImageResource(R.drawable.zdj3)}

                if (przesuniecieL%3==1){
                    findViewById<ImageView>(R.id.zdj1).setImageResource(R.drawable.zdj2)}

                if (przesuniecieL%3==2){
                    findViewById<ImageView>(R.id.zdj1).setImageResource(R.drawable.zdj1)}
            }
            przesuniecieL+=1
        }
    }
}