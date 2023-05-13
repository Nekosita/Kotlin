package com.example.fivescoreapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ボタンを設置
        val tvScore: TextView =findViewById(R.id.tvScore)
        val btnMinus: Button =findViewById(R.id.btnMinus)
        val btnPlus:Button=findViewById(R.id.btnPlus)
        var num=0

        //1)+ボタンを押したら、スコアが1増える
        btnPlus.setOnClickListener{
            num++
            //3)スコア(num)が5になったらGameClear
            if(num==5){
                val intent = Intent(this,GameClear::class.java)
                startActivity(intent)
            }else{
                //１）プラスしたスコアをテキストに表示
                tvScore.text = num.toString()
            }
        }
        //2)-ボタンを押したら、スコアが1減る
        btnMinus.setOnClickListener{
            num--
            //3)スコア(num)が5になったらGameClear
            if(num==-5){
                val intent = Intent(this,GameOver::class.java)
                startActivity(intent)
            }else{
                //１）マイナスしたスコアをテキストに表示
                tvScore.text = num.toString()
            }
        }
    }
}