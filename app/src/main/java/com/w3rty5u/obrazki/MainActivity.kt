package com.w3rty5u.obrazki

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var i = 0;
        val btnNext = findViewById<Button>(R.id.goForward);
        val btnBack = findViewById<Button>(R.id.goBack);
        val tekstTu = findViewById<TextView>(R.id.textView);
        val czyWidoczne = findViewById<CheckBox>(R.id.checkBox);
        val obrazekTu = findViewById<ImageView>(R.id.imageView);
        val czyWlasnaWidoczne = findViewById<CheckBox>(R.id.czyIlPrzezr);
        val ileWlasna = findViewById<EditText>(R.id.ilePrzezr);
        btnNext.setOnClickListener {
            i++;
            if(i==5){
                i=0;
            }
            when(i){
                1-> {obrazekTu.setImageResource(R.drawable.man);
                    tekstTu.text = "kon"
                }
                2 -> {
                    obrazekTu.setImageResource(R.drawable.pigeon);
                    tekstTu.text = "golab"
                }
                3 -> {obrazekTu.setImageResource(R.drawable.seadoggo);
                    tekstTu.text = "foka"
                }
                4 -> {
                    obrazekTu.setImageResource(R.drawable.doge);
                    tekstTu.text = "pies"
                }
                0 -> {
                    obrazekTu.setImageResource(R.drawable.belgjum);
                    tekstTu.text = "belgia"
                }
            }
        }
        btnBack.setOnClickListener {
            i = i-1;
            if(i==-1){
                i=4;
            }
            when(i){
                1-> {obrazekTu.setImageResource(R.drawable.man);
                    tekstTu.text = "kon"
                }
                2 -> {
                    obrazekTu.setImageResource(R.drawable.pigeon);
                    tekstTu.text = "golab"
                }
                3 -> {obrazekTu.setImageResource(R.drawable.seadoggo);
                    tekstTu.text = "foka"
                }
                4 -> {
                    obrazekTu.setImageResource(R.drawable.doge);
                    tekstTu.text = "pies"
                }
                0 -> {
                    obrazekTu.setImageResource(R.drawable.belgjum);
                    tekstTu.text = "belgia"
                }
            }
        }
        czyWidoczne.setOnCheckedChangeListener {_, isChecked ->
            if (isChecked){
                obrazekTu.visibility = View.VISIBLE
                tekstTu.visibility = View.VISIBLE
            }
            else{
                obrazekTu.visibility = View.INVISIBLE
                tekstTu.visibility = View.INVISIBLE
            }
        }
        czyWlasnaWidoczne.setOnCheckedChangeListener{_, isChecked ->
            if(isChecked){
                var visWlasna = ileWlasna.text.toString().toFloat();
                obrazekTu.alpha = visWlasna;
            }
            else{
                obrazekTu.alpha = 1f;
            }
        }

    }
}