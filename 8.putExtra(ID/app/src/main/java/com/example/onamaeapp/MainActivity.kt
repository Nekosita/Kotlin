package com.example.onamaeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //中のパーツを定義します
        val et:EditText=findViewById(R.id.et)
        val btnStart:Button=findViewById(R.id.btnStart)

        //1)画面遷移
        btnStart.setOnClickListener{

            //5)条件分岐
            if(et.text.toString()==""){
                //トースト
                //Toast.makeText(this,"何にがを書いてください。",Toast.LENGTH_LONG).show()
                //(5-2)アラートダイアログ
                AlertDialog.Builder(this).setTitle("ERROR!").setMessage("何が書いて").setPositiveButton("PUSH",null).show()

            }else{
                //それ以外
                val intent=Intent(this,SecondActivity2::class.java)

                //2)値を渡す
                intent.putExtra("MY_NAME",et.text.toString())
                startActivity(intent)

            }


        }

    }

}


