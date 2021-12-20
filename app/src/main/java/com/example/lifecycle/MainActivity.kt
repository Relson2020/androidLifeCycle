package com.example.lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.lifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val tag = "MainActivity"
    private lateinit var dataBinding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding= DataBindingUtil.setContentView(this,R.layout.activity_main)
        lifecycle.addObserver(Observer())
        Log.i(tag,"onCreate()")

        dataBinding.buttonId.setOnClickListener{
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(tag,"onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.i(tag,"onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.i(tag,"onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.i(tag,"onStop()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(tag,"onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(tag,"onDestroy()")
    }
}