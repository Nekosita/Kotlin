package com.example.onamaeapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity2 : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)

        val tvName:TextView=findViewById(R.id.tVName)
        val btnBack:Button=findViewById(R.id.btnBack)

        //3)渡された値を取り出す-＞テキスト表示
        val myName= intent.getStringExtra("MY_NAME")
            tvName.text =myName +"さん"

        //戻るボタン
        btnBack.setOnClickListener{
            finish()
        }
    }

}