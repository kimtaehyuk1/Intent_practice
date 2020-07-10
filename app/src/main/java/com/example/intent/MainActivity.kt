package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_sub_.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btn_a.setOnClickListener {
            val intent = Intent(this,Sub_Activity::class.java) // 다음 화면 넘기기위한 intent 객체 선언 (자기자신,갈 layout이름 :: class.java)
            intent.putExtra("Msg",tv_sendMsg.text.toString()) //intent로 이동할때 값까지 넣어주기, HelloWord라는 텍스트 값을 담은 뒤  msg라는 키로 잠금.
            startActivity(intent) //위의 값까지 해서 보내준다 Sub_Activity 에서 이거 받아야함
            // 만약 여기 finish() 이거 코딩하면 Sub_Activity로 가고 이 액티비티는 끝남
        }


    }
}