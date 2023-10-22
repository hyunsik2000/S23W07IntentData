package kr.ac.kumoh.ce.s20190400.s23w04carddealer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import kr.ac.kumoh.ce.s20190400.s23w04carddealer.databinding.ActivityMainBinding
import androidx.lifecycle.ViewModelProvider
class MainActivity : AppCompatActivity() {
    private lateinit var main: ActivityMainBinding //뷰 바인딩
    private lateinit var model: CardDealerViewModel //뷰 모델
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        main = ActivityMainBinding.inflate(layoutInflater) //뷰 바인딩 선언
        //setContentView(R.layout.activity_main)
        setContentView(main.root)
        model = ViewModelProvider(this)[CardDealerViewModel::class.java]
        // 뷰 모델 선언
        model.cards.observe(this, Observer { //뷰 모델.cards.observe 옵저버
            val res = IntArray(5)
            for (i in res.indices){ //배열 읽기
                res[i] = resources.getIdentifier( //resources.getIdentifier(name: String, defType: String, defPackage: String)
                getCardName(it[i]), //카드 이름을 가져오고
                "drawable",
                packageName
                )
                }
            main.card1.setImageResource(res[0]) //뷰에 imageview인 card1에 이미지 설정
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
        return "c_${number}_of_${shape}" // 카드 이름을 반환
}