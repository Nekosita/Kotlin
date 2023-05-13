package com.example.gameapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //1)戻るボタン設定
        val btnBack:Button=findViewById(R.id.btnBack)

        //2)戻るボタン押したら(アクティビティの終了
        btnBack.setOnClickListener{
            //新しいページの設定
            //val intent= Intent(this,MainActivity::class.java)
            //startActivity(intent)
            finish()
        }
    }
}