package kr.ac.kumoh.ce.s20190400.s23w04carddealer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import kr.ac.kumoh.ce.s20190400.s23w04carddealer.databinding.ActivityMainBinding
import androidx.lifecycle.ViewModelProvider
class MainActivity : AppCompatActivity() {
    private lateinit var main: ActivityMainBinding
    private lateinit var model: CardDealerViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        main = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main)
        setContentView(main.root)
        model = ViewModelProvider(this)[CardDealerViewModel::class.java]

        model.cards.observe(this, Observer {
            val res = IntArray(5)
            for (i in res.indices){
                res[i] = resources.getIdentifier(
                getCardName(it[i]),
                "drawable",
                packageName
                )
                }
            main.card1.setImageResource(res[0])
        })

        main.btnShuffle.setOnClickListener {
            model.shuffle()
        }
    }
}
private fun getCardName(c: Int): String {
    var shape = when (c / 13) {
        0 -> "spades"
        1 -> "diamonds"
        2 -> "hearts"
        3 -> "clubs"
        else -> "error"
    }
    val number = when (c % 13) {
        0 -> "ace"
        in 1..9 -> (c % 13 + 1).toString()
        10 -> {
            shape = shape.plus("2")  // 요런 방법도 있다
            "jack"
        }
        11 -> "queen"
        12 -> "king"
        else -> "error"
    }

//    return if (number in arrayOf("jack", "queen", "king"))    "c_${number}_of_${shape}2"  else
        return "c_${number}_of_${shape}"
}