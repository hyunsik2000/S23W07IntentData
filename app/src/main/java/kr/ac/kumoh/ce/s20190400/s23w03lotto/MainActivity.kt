package kr.ac.kumoh.ce.s20190400.s23w03lotto

import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import kr.ac.kumoh.ce.s20190400.s23w03lotto.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var main: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("Lifecycle!!!", "onCreate()")
        // setContentView(R.layout.activity_main)
        main = ActivityMainBinding.inflate(layoutInflater)
        setContentView(main.root)

        main.btnGenerate.setOnClickListener {
            main.num1.text = Random.nextInt(1,46).toString()
            main.num2.text = Random.nextInt(1,46).toString()
            main.num3.text = Random.nextInt(1,46).toString()
            main.num4.text = Random.nextInt(1,46).toString()
            main.num5.text = Random.nextInt(1,46).toString()
            main.num6.text = Random.nextInt(1,46).toString()

        }
    }
    override fun onStart() {
        super.onStart()
        Log.i("Lifecycle!!!", "onStart()")
    }
    override fun onResume() {
        super.onResume()
        Log.i("Lifecycle!!!", "onResume()")
    }
    override fun onPause() {
        super.onPause()
        Log.i("Lifecycle!!!","onPause()")
    }
    override fun onRestart() {
        super.onRestart()
        Log.i("Lifecycle!!!","onRestart()")
    }
    override fun onStop() {
        super.onStop()
        Log.i("Lifecycle!!!","onStop()")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i("Lifecycle!!!","onDestroy()")
    }
}