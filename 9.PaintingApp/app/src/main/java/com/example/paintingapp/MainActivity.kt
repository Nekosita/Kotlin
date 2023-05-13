package com.example.paintingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.paintktapp.MyView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnClear: Button =findViewById(R.id.btnClear)
        //５）Viewの取得⇒クリア処理
        val myView : MyView =findViewById(R.id.myView)

        btnClear.setOnClickListener {
            myView.clearCanvas()
        }
    }
}