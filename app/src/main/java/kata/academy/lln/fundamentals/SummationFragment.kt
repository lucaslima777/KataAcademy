package kata.academy.lln.fundamentals


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import kata.academy.lln.BaseActivity
import kata.academy.lln.R
import kata.academy.lln.databinding.FragmentSummationBinding

/**
 * @author lucas lima
 * @since 11/06/2019
 * @att 19/06/2019
 */
class SummationFragment : Fragment(), BaseActivity {

    private lateinit var binding: FragmentSummationBinding
    private var summation: Int = 0

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

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_summation, container, false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        binding.buttonVerify.setOnClickListener {
            summation = summation(binding.editNum.text.toString().toInt())

            Toast.makeText(
                context, summation.toString(), Toast.LENGTH_LONG
            ).show()
        }
    }

    fun summation(n: Int) = (1..n).sum()

}
