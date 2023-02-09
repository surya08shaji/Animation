package com.example.animationexample

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

     private lateinit var image:ImageView
     private lateinit var title:TextView

    private lateinit var zoomIn:Button
    private lateinit var zoomOut:Button
    private lateinit var fade:Button
    private lateinit var blink:Button
    private lateinit var move:Button
    private lateinit var slide:Button
    private lateinit var clockwise:Button
    private lateinit var anticlockwise:Button

    private lateinit var animation: Animation

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image = findViewById(R.id.image)
        zoomIn = findViewById(R.id.zoomIn)
        zoomOut = findViewById(R.id.zoomOut)
        fade = findViewById(R.id.fade)
        blink = findViewById(R.id.blink)
        move = findViewById(R.id.move)
        slide = findViewById(R.id.slide)
        clockwise = findViewById(R.id.clockwise)
        anticlockwise = findViewById(R.id.anticlockwise)
        title = findViewById(R.id.title)

        zoomIn.setOnClickListener {
            animation = AnimationUtils.loadAnimation(
                applicationContext,
                R.anim.zoom_in
            )
            image.startAnimation(animation)
            title.startAnimation(animation)
            title.text = "Zoom In"
        }

        zoomOut.setOnClickListener {
            animation = AnimationUtils.loadAnimation(
                applicationContext,
                R.anim.zoom_out
            )
            image.startAnimation(animation)
            title.startAnimation(animation)
            title.text = "Zoom Out"
        }

        fade.setOnClickListener {
            animation = AnimationUtils.loadAnimation(
                applicationContext,
                R.anim.fade
            )
            image.startAnimation(animation)
            title.startAnimation(animation)
            title.text = "Fade"
        }

        blink.setOnClickListener {
            animation = AnimationUtils.loadAnimation(
                applicationContext,
                R.anim.blink
            )
            image.startAnimation(animation)
            title.startAnimation(animation)
            title.text = "Blink"
        }

        move.setOnClickListener {
            animation = AnimationUtils.loadAnimation(
                applicationContext,
                R.anim.move
            )
            image.startAnimation(animation)
            title.startAnimation(animation)
            title.text = "Move"
        }

        slide.setOnClickListener {
            animation = AnimationUtils.loadAnimation(
                applicationContext,
                R.anim.slide
            )
            image.startAnimation(animation)
            title.startAnimation(animation)
            title.text = "Slide"
        }
        clockwise.setOnClickListener {
            animation = AnimationUtils.loadAnimation(
                applicationContext,
                R.anim.clockwise
            )
            image.startAnimation(animation)
            title.startAnimation(animation)
            title.text = "Clockwise"
        }

        anticlockwise.setOnClickListener {
            animation = AnimationUtils.loadAnimation(
                applicationContext,
                R.anim.anticlockwise
            )
            image.startAnimation(animation)
            title.startAnimation(animation)
            title.text = "Anti-Clockwise"
        }
    }
}