package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity2 : AppCompatActivity() {

    private val TAG = MainActivity2::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val back = findViewById<Button>(R.id.button2)
        back.setOnClickListener{
            //Will navigate to Activity 2 immediately
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        
        Log.d(TAG, "$TAG:onResume")
    }

    //Second method
    override fun onStart() {
        super.onStart();
        Log.d(TAG, "$TAG:onStart")
    }

    //Second method
    override fun onResume() {
        super.onResume();
        Log.d(TAG, "$TAG:onResume")
    }

    override fun onPause() {
        super.onPause();
        Log.d(TAG, "$TAG:onPause")
    }

    override fun onStop() {
        super.onStop();
        Log.d(TAG, "$TAG:onStop")
    }

    override fun onRestart() {
        super.onRestart();
        Log.d(TAG, "$TAG:onRestart")
    }

    override fun onDestroy() {
        super.onDestroy();
        Log.d(TAG, "$TAG:onDestroy")
    }
}