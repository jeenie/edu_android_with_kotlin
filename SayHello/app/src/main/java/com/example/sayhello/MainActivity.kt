package com.example.sayhello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sayhello.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root) // 화면을 그려주는 함수
        // 콘텐츠를 화면에 표시하기 위해서
        // res/layout 디렉터리 아래에 있는 activity_main.xml 파일을 사용한다.

        binding.btnSay.setOnClickListener{
            binding.textSay.text = "Hello Kotlin!!!"
        }
    }
}