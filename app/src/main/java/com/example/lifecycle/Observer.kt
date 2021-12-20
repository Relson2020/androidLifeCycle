package com.example.lifecycle

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class Observer: DefaultLifecycleObserver {
    private val tag2 = "Observer"

    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
        Log.i(tag2 , "observer onCreate()")
    }
    override fun onStart(owner: LifecycleOwner) {
        super.onStart(owner)
        Log.i(tag2 , "observer onStart()")
    }

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        Log.i(tag2 , "observer onResume()")
    }

    override fun onPause(owner: LifecycleOwner) {
        super.onPause(owner)
        Log.i(tag2 , "observer onPause()")
    }

    override fun onStop(owner: LifecycleOwner) {
        super.onStop(owner)
        Log.i(tag2 , "observer onStop()")
    }

    override fun onDestroy(owner: LifecycleOwner) {
        super.onDestroy(owner)
        Log.i(tag2 , "observer onDestroy()")
    }

}