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
import kata.academy.lln.databinding.FragmentDoubleArrayBinding

/**
 * @author lucas lima
 * @since 11/06/2019
 * @att 19/06/2019
 */
class DoubleArrayFragment : Fragment(), BaseActivity {

    private lateinit var binding: FragmentDoubleArrayBinding

    private lateinit var arrayString: String
    private val list = mutableListOf(1, 2, 3)

    override fun description() {
        /**
         * Given an array of integers, return a new array with each value doubled.
         * For example:
         * [1, 2, 3] --> [2, 4, 6]
         * For the beginner, try to use the map method - it comes in very handy quite a lot so is a good one to know.
         */
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_double_array, container, false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        binding.buttonVerify.setOnClickListener {
            arrayString = binding.editArray.text.toString()

            list.clear()
            list.add(arrayString.toInt())

            maps(list.toIntArray())

            Toast.makeText(context, maps(list.toIntArray()).get(0).toString(), Toast.LENGTH_LONG).show()
        }
    }

    fun maps(x: IntArray) = x.map {
        it * 2
    }.toIntArray()

}
