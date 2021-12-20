package com.example.lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.lifecycle.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var dataBinding2 : ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding2 = DataBindingUtil.setContentView(this,R.layout.activity_main2)

        dataBinding2.buttonId2.setOnClickListener{
            val intent2 = Intent(this,MainActivity::class.java)
            startActivity(intent2)
        }
    }
}