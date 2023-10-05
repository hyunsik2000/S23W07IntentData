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
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kr.ac.kumoh.ce.s20190400.s23w03lotto.databinding.ActivityMainBinding
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    private lateinit var main: ActivityMainBinding
    private lateinit var model: LottoViewModel
    private lateinit var txtNum: Array<TextView?>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("Lifecycle!!!", "onCreate()")
        // setContentView(R.layout.activity_main)
        main = ActivityMainBinding.inflate(layoutInflater)
        setContentView(main.root)

        txtNum = arrayOf(main.num1, main.num2, main.num3, main.num4, main.num5, main.num6)

        model = ViewModelProvider(this)[LottoViewModel::class.java]

        model.numbers.observe(this, Observer {
            txtNum.forEachIndexed { index, textView ->
                textView?.text = model.numbers.value!![index].toString()
        }
        })

        main.btnGenerate.setOnClickListener { // 인터페이스란 구현되지 않은 함수들이 있는 클래스 (함수 틀 제공)
            model.generate() // 데이터가 바껴있지만 화면에 확인 x , MVVM? 에서는 데이터를 바꾸면 뷰에 자동으로 반영됨
            //txtNum.forEachIndexed { index, textView ->
              //  textView?.text = model.numbers.value!![index].toString() // 데이터를 값에 넣어서 화면에 확인
            }
//            main.num1.text = model.numbers[0].toString()
//            main.num2.text = model.numbers[1].toString()
//            main.num3.text = model.numbers[2].toString()
//            main.num4.text = model.numbers[3].toString()
//            main.num5.text = model.numbers[4].toString()
//            main.num6.text = model.numbers[5].toString()
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