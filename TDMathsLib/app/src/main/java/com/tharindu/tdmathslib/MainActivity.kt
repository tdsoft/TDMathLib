package com.tharindu.tdmathslib

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.tharindu.tdmathlib.TestLibraryActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startActivity(Intent(this, TestLibraryActivity::class.java))
    }
}
