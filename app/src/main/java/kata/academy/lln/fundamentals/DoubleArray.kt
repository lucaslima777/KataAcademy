package kata.academy.lln.fundamentals

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import kata.academy.lln.R
import kata.academy.lln.databinding.ActivityDoubleArrayBinding

/**
 * @author lucas lima
 * @since 11/06/2019
 */
class DoubleArray : AppCompatActivity(), BaseActivity {

    private lateinit var binding: ActivityDoubleArrayBinding

    override fun description() {
        /**
         * Given an array of integers, return a new array with each value doubled.
         * For example:
         * [1, 2, 3] --> [2, 4, 6]
         * For the beginner, try to use the map method - it comes in very handy quite a lot so is a good one to know.
         */
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_double_array)

        var arrayString: String
        val list = mutableListOf(1, 2, 3)


        binding.buttonVerify.setOnClickListener {

            arrayString = binding.editArray.text.toString()

            list.clear()
            list.add(arrayString.toInt())

            maps(list.toIntArray())

            Toast.makeText(this, maps(list.toIntArray()).get(0).toString(), Toast.LENGTH_LONG).show()
        }
    }

    fun maps(x: IntArray) = x.map {
        it * 2
    }.toIntArray()

}
