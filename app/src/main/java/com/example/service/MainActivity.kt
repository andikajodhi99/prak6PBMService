package com.example.service

import android.app.Activity
import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //btn facebook jika diklik akan menampilkan facebook.com
        btn_facebook.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://facebook.com/langitinspirasi"))
            startActivity(i)
        })
        //button instagram jika di klik akan menampilkan halaman instagram
        btn_instagram.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/langitinspirasi"))
            startActivity(i)
        })
        //mendeklarasikan variable MediaPlayer dan memanggil data mp3
        var MediaPlayer: MediaPlayer? = MediaPlayer.create(this,R.raw.kekasih )
        //button yang berfungsi untuk melakukakan pause mp3
        btn_Play.setOnClickListener{
            MediaPlayer?.start()
        }
        //button yang berfungsi untuk melakukakan pause
        btn_Pause.setOnClickListener{
            MediaPlayer?.pause()
        }
        btn_Setop.setOnClickListener{
            MediaPlayer?.pause()
            MediaPlayer?.seekTo(0)
        }
    }
}
