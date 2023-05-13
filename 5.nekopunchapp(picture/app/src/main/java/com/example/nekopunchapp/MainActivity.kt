package com.example.nekopunchapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //1)画面タッチ
    override fun onTouchEvent(event: MotionEvent?): Boolean {

        var iv:ImageView=findViewById(R.id.iv)

        //2)条件分岐（押した時、動かした時、離れた時）
            when(event?.action){
                //cat02の画像に切り替えます
                MotionEvent.ACTION_DOWN->iv.setImageResource(R.drawable.cat02)
                MotionEvent.ACTION_MOVE->iv.setImageResource(R.drawable.cat03)
                MotionEvent.ACTION_UP->iv.setImageResource(R.drawable.cat01)
            }

        return super.onTouchEvent(event)
    }


}