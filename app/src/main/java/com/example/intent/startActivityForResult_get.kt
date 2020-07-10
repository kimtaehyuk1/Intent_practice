package com.example.intent

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_start_for_result_get.*

class startActivityForResult_get : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_for_result_get)

        btn_save.setOnClickListener {
            val intent = Intent() //아직 어디로 이동하라는거 없어도 일단 여기서 화면 전환 쓸거기땜에 이변수 선언했고 send에서 request코드 보냈기에 뺴주는 형식으로 코드 작성
            intent.putExtra("title",et_title.text.toString())
            intent.putExtra("contents",et_contents.text.toString())
            setResult(Activity.RESULT_OK, intent) //setResult 있다는 자체가 메인에서 먼가 requst한거 있고 결과 값을 돌려준다글로 다시 이 값을 가지고 간다 --> onActivityResult로 간다.
            // resultCode와 여기 intent 값을 가지고 요청코드와 맞든안맞든 일단 보낸다.

            // !!!!!!!!!!!!!!!!!처음에 선언 해주는 이유 set줄때 형식
            // 그리고 왜 요청코드는 여기서 안씀?!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        }




    }
}