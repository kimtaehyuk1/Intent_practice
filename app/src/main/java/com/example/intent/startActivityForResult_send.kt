package com.example.intent

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_start_for_result_send.*


class startActivityForResult_send : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_for_result_send)

        btn_write.setOnClickListener { //화면 전환된 액티비티 종료후 다시 처음으로 데이터 보내는 방식으로 이걸로 다음메소드 호출후 onActivityResult()로 결과 받기
            val intent = Intent(this,startActivityForResult_get::class.java)
            startActivityForResult(intent,100) //이속성은 intent변수의 속성인 화면전환인 동시에 그화면에서 100이란 int 값을 요청

        }
    }
            //Alt inset를 눌러서 orride받기 여긴 화면이동후 그 화면에서 request코드로 원하는 값 받았으면 여기서 계속 코딩 하라는 얘기
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data) //결과값을 받아보는곳 request코드와 다들 수 있다.


                if (requestCode == 100) { //이건 형식임?
                        if(resultCode==Activity.RESULT_OK) {

                            tv_1.text = intent.getStringExtra("title")
                            tv_2.text = intent.getStringExtra("contents")

                        }
                    }







    }
}