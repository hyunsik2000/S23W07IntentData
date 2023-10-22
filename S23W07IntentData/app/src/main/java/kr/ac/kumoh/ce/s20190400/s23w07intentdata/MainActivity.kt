package kr.ac.kumoh.ce.s20190400.s23w07intentdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kr.ac.kumoh.ce.s20190400.s23w07intentdata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    companion object{
        const val KEY_NAME = "location"
    }

    private lateinit var main: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        main = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        setContentView(main.root)

        main.btnOmg.setOnClickListener {
            Toast.makeText(this,
                "Omg",
                Toast.LENGTH_SHORT).show()
            val intent = Intent(this,
                ImageActivity::class.java)
            intent.putExtra(KEY_NAME,"omg")
            startActivity(intent)
        }
        main.btnCupid.setOnClickListener {
            Toast.makeText(this,
                "Cupid",
                Toast.LENGTH_SHORT).show()
            val intent = Intent(this,
                ImageActivity::class.java)
            intent.putExtra(KEY_NAME,"cupid")
            startActivity(intent)
        }
    }
}