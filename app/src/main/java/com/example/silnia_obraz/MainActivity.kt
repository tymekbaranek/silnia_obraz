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

        fun Silnia(input: Int): Int {
            var SilniaW = 1
            return if(input==0)
                SilniaW
            else
                input*Silnia(input-1)
        }

        findViewById<Button>(R.id.Silniastart).setOnClickListener {
            var Silniaint = findViewById<EditText>(R.id.Silniapodaj).text.toString().toInt()
            if(Silniaint>10 || Silniaint<0){
                findViewById<TextView>(R.id.Silniawynik).text=("Zła liczba")
            }
            else findViewById<TextView>(R.id.Silniawynik).text=(Silnia(Silniaint).toString())
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