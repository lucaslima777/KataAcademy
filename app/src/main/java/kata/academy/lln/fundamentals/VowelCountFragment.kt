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
import kata.academy.lln.databinding.FragmentVowelCountBinding

/**
 * @author lucas lima
 * @since 07/06/2019
 * @att 19/06/2019
 */
class VowelCountFragment : Fragment(), BaseActivity {

    private lateinit var binding: FragmentVowelCountBinding
    private lateinit var vowel: String

    override fun description() {
        /**
         * Return the number (count) of vowels in the given string.
         * We will consider a, e, i, o, and u as vowels for this Kata.
         * The input string will only consist of lower case letters and/or spaces.
         */
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_vowel_count, container, false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        binding.buttonVerify.setOnClickListener {

            vowel = binding.editVowel.text.toString()

            getCount(vowel)
            Toast.makeText(context, getCount(vowel).toString(), Toast.LENGTH_LONG).show()
        }
    }

    fun getCount(str: String): Int {
        return str.count { x -> getString(R.string.vowel).contains(x) }
    }

}
