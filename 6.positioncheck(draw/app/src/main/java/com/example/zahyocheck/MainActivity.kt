package com.example.zahyocheck

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        //2)新しいクラスを表示させる
        val ballView=BallView(this)
        setContentView(ballView)
    }

    //1)Viewを継承したクラス
    class BallView(context:Context?):View(context){
        private var paint:Paint=Paint()
        private var circleX:Float=400F
        private var circleY:Float=500F

        //3)onDrawで描画の準備
        override fun onDraw(canvas: Canvas?) {
            super.onDraw(canvas)
            canvas?.drawColor(Color.GRAY)//カンバス（背景）色
            //4)ペイントする色の指定と、丸い図形
            paint.color=Color.YELLOW
            canvas?.drawCircle(circleX,circleY,100F,paint)
            //コントロールの表面全体を無効化して、コントロールを再描画します。
            //invalidate()
        }
        //5)画面タッチ
        override fun onTouchEvent(event: MotionEvent?): Boolean {

            //タッチポジション
            circleX= event!!.x
            circleY= event.y
            //コントロールの表面全体を無効化して、コントロールを再描画します。
            invalidate()

            //マウス押した時の一瞬のみ
            //return super.onTouchEvent(event )
            //マウス長押ししたら付いてる
            return true
        }


    }

}