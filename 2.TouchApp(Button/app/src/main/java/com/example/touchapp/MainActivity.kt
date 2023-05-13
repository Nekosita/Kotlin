package com.example.touchapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1)id取得(Viewを取得しますよ,idで)
        val text : TextView = findViewById(R.id.tv)
        val btn1 :Button = findViewById(R.id.btninu)
        val btn2 :Button = findViewById(R.id.btnCat)
        val btn3 :Button = findViewById(R.id.btnClear)

        //2）クリック処理
        btn1.setOnClickListener{
            //押し時の処理
            text.text="犬"

        }
        btn2.setOnClickListener{
            //押し時の処理
            text.text="猫"
        }
        btn3.setOnClickListener{
            //押し時の処理
            text.text=""
        }

    }


}