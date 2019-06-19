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
 */
class NextNumberBiggerFragment : Fragment() {

    private lateinit var binding: FragmentNextNumberBiggerBinding

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
            Toast.makeText(context, "test", Toast.LENGTH_LONG).show()
        }
    }

}
