package kata.academy.lln.fundamentals

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import kata.academy.lln.R
import kata.academy.lln.databinding.ActivityVowelCountBinding


/**
 * @author lucas lima
 * @since 07/06/2019
 */
class VowelCount : AppCompatActivity(), BaseActivity {

    private lateinit var binding: ActivityVowelCountBinding
    private lateinit var vowel: String

    override fun description() {
        /**
         * Return the number (count) of vowels in the given string.
         * We will consider a, e, i, o, and u as vowels for this Kata.
         * The input string will only consist of lower case letters and/or spaces.
         */
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_vowel_count)

        binding.buttonVerify.setOnClickListener {

            vowel = binding.editVowel.text.toString()

            getCount(vowel)
            Toast.makeText(this, getCount(vowel).toString(), Toast.LENGTH_LONG).show()
        }
    }

    fun getCount(str: String): Int {
        return str.count { x -> getString(R.string.vowel).contains(x) }
    }
}
