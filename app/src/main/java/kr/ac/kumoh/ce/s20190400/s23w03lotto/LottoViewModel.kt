package kr.ac.kumoh.ce.s20190400.s23w03lotto

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random
import androidx.lifecycle.MutableLiveData

class LottoViewModel : ViewModel( ) { // ViewModel()에서 상속 받아라
    //private var _numbers = intArrayOf(0, 0, 0, 0, 0, 0)
    private var _numbers = MutableLiveData<IntArray>(IntArray(6) { 0 })
    val numbers: LiveData<IntArray> // public으로 사용, 다른데서 써라 그리고 _변수 는 대체로 프라이빗으로 사용
        get() = _numbers
    fun generate() {
        var num = 0
        var newNumbers = IntArray(6) { 0 }

        for (i in newNumbers.indices) { // 코틀린의 for문
            //_numbers[i] = Random.nextInt(1, 46)
            // 중복 검사
            do {
                num = Random.nextInt(1, 46)
            } while (newNumbers.contains(num))
            newNumbers[i] = num

            Log.i("Number!!!", newNumbers[i].toString())
        }

        // 정렬
        newNumbers.sort()

        _numbers.value = newNumbers
    }
}
