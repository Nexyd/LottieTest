package com.dani.kotlin.lottietest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import com.airbnb.lottie.TextDelegate
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        playStop.setOnClickListener {
            if (!originalTextView.isAnimating)
                originalTextView.resumeAnimation()
            else
                originalTextView.pauseAnimation()
        }
    }
}