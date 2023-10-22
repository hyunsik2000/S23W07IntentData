package kr.ac.kumoh.ce.s20190400.s23w07intentdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kr.ac.kumoh.ce.s20190400.s23w07intentdata.databinding.ActivityImageBinding

class ImageActivity : AppCompatActivity() {
    private lateinit var main: ActivityImageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        main = ActivityImageBinding.inflate(layoutInflater)
        setContentView(main.root)

        Log.i("Image",
            intent.getStringExtra("location") ?: "없음")

        val res = when(intent.getStringExtra("location")){
            "omg" -> R.drawable.omg
            "cupid" -> R.drawable.cupid
            else -> R.drawable.ic_launcher_foreground
        }


        main.image.setImageResource(res)
        }
    }
