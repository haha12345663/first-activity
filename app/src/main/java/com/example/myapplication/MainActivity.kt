package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var img: ImageView
    private lateinit var btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
       /* Log.d("Get new Data","onCreate");
        btn = findViewById(R.id.button2)
        btn.setOnClickListener{
            val intent = Intent(this, FirstFragment::class.java)
            startActivity(intent)
        }
        btn = findViewById(R.id.button3)
        btn.setOnClickListener{
            val intent2 = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.facebook.com/"))
            startActivity(intent2)
        }*/
    }

    /*override fun onStart() {
        super.onStart()
        img = findViewById(R.id.imageView)
        Glide.with(this).load("https://source.unsplash.com/user/c_v_r")
            .skipMemoryCache(true)
            .diskCacheStrategy(DiskCacheStrategy.NONE).into(img);
        Log.d("Get new Data","onStart");

    }

    override fun onResume() {
        super.onResume()
        Log.d("Get new Data","onResume");

    }

    override fun onPause() {
        super.onPause()
        Log.i("Get new Data","onPause");

    }

    override fun onStop() {
        super.onStop()
        Log.i("Get new Data","onStop");

    }*/

    fun clickcc(cc: View) {
        Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show()
    }
}