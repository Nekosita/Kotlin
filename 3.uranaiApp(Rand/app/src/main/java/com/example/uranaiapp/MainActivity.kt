package com.example.uranaiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //1）idを取得
        var tv:TextView=findViewById(R.id.uranaiText)
        var btn:Button=findViewById(R.id.uranaiBtn)


        //2）クリック処理
        btn.setOnClickListener{
            // tv.text="大吉"
            //2-2)配列、文言用意
            var uranai=arrayOf("大吉","中吉","小吉","凶","大凶")

            //3)乱数を作る
            var num =Random().nextInt(uranai.count())
            //tv.text=num.toString()

            //4)表示
            tv.text=uranai.get(num)

        }


    }
}