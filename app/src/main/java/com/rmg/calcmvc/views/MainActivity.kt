package com.rmg.calcmvc.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rmg.calcmvc.R
import com.rmg.calcmvc.controllers.ControllerMainActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var controllerMainActivity = ControllerMainActivity(this)
    }
}