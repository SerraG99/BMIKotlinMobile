package com.example.bmi

import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.io.File

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        var imageView: ImageView = findViewById(R.id.im_title)
        val assetManager = assets
        var inputStream = assetManager.open("title.jpeg")
        var bitmap = BitmapFactory.decodeStream(inputStream)
        imageView.setImageBitmap(bitmap)



        imageView = findViewById(R.id.im_res)
        inputStream = assetManager.open("question.png")
        bitmap = BitmapFactory.decodeStream(inputStream)
        imageView.setImageBitmap(bitmap)




    }
}