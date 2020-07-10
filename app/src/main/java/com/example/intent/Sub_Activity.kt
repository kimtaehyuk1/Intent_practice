package com.example.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sub_.*

class Sub_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub_)

        if(intent.hasExtra("Msg")) { //hasExtra는 intent안에 있는 객체에서 Msg라는 이름을 찾아서 있으면 if문 돌아감 또 intent는 다른 액티비티인데도 import해서 받아진거

            tv_getMsg.text =  intent.getStringExtra("Msg") // Msg라는 키로 연것임 ==자연스레 값이 넘어옴 : 받은것임

        }






    }
}