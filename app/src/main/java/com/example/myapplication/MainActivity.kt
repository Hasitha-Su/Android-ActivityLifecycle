package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    //TAG is the name of activity
    private val TAG = MainActivity::class.java.simpleName

    // first method
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //passing the xml to generate a view
        setContentView(R.layout.activity_main)



        val second = findViewById<Button>(R.id.button)
        second.setOnClickListener{
            //Will navigate to Activity 2 immediately
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        // use class name to filter out easily
        Log.d(TAG, "$TAG:onCreate")
    }

    //Second method
    override fun onStart() {
        super.onStart();

        // use class name to filter out easily
        Log.d(TAG, "$TAG:onStart")
    }

    //Second method
    override fun onResume() {
        super.onResume();

        // use class name to filter out easily
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