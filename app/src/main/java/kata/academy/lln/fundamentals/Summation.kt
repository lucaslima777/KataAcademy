package kata.academy.lln.fundamentals

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import kata.academy.lln.R
import kata.academy.lln.databinding.ActivitySummationBinding

class Summation : AppCompatActivity(), BaseActivity {

    private lateinit var binding: ActivitySummationBinding

    override fun description() {
        /**
         * Write a program that finds the summation of every number from 1 to num.
         * The number will always be a positive integer greater than 0.
         * For example:
         * summation(2) -> 3
         * 1 + 2
         * summation(8) -> 36
         * 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8
         */
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_summation)

        var num: Int

        binding.buttonVerify.setOnClickListener {

            num = GrassHopper.summation(binding.editNum.text.toString().toInt())

            Toast.makeText(
                this, num.toString(), Toast.LENGTH_LONG
            ).show()
        }

    }

    object GrassHopper {
        fun summation(n: Int) = (1..n).sum()
    }
}
