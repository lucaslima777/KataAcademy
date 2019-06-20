package kata.academy.lln.algorithms

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import kata.academy.lln.R
import kata.academy.lln.databinding.FragmentNextNumberBiggerBinding

/**
 * @author lucas lima
 * @since 18/06/2019
 * @att 19/06/2019
 */
class NextNumberBiggerFragment : Fragment() {

    private lateinit var binding: FragmentNextNumberBiggerBinding
    private var number: Long = 0


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_next_number_bigger, container, false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        binding.buttonVerify.setOnClickListener {
            number = nextBiggerNumber(binding.editNum.text.toString().toLong())

            Toast.makeText(
                context, number.toString(), Toast.LENGTH_LONG
            ).show()
        }
    }

    fun nextBiggerNumber(n: Long): Long {
        val text = n.toString().toMutableList()
        for (i in text.size - 2 downTo 0) {
            if (text[i] < text[i + 1]) {
                val tail = text.subList(i + 1, text.size)
                val min = tail.withIndex().filter { it.value > text[i] }.minBy { it.value }!!
                text[i + 1 + min.index] = text[i]
                text[i] = min.value
                tail.sort()
                return text.joinToString("").toLong()
            }
        }
        return -1
    }

}
