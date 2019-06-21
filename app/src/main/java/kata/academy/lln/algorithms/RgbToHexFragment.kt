package kata.academy.lln.algorithms


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import kata.academy.lln.BaseActivity
import kata.academy.lln.R
import kata.academy.lln.databinding.FragmentRgbToHexBinding


class RgbToHexFragment : Fragment(), BaseActivity {

    private lateinit var binding: FragmentRgbToHexBinding

    override fun description() {
        /**
         * The rgb() method is incomplete.
         * Complete the method so that passing in RGB decimal values will result in a hexadecimal
         * representation being returned. The valid decimal values for RGB are 0 - 255.
         * Any (r,g,b) argument values that fall out of that range should be rounded to the closest valid value.
         *
         * The following are examples of expected output values:
         *
         * rgb(255, 255, 255) // returns FFFFFF
         * rgb(255, 255, 300) // returns FFFFFF
         * rgb(0, 0, 0) // returns 000000
         * rgb(148, 0, 211) // returns 9400D3
         */
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_rgb_to_hex, container, false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()

        binding.buttonVerify.setOnClickListener {

            Toast.makeText(
                context, rgb(
                    binding.editR.text.toString().toInt(),
                    binding.editG.text.toString().toInt(),
                    binding.editB.text.toString().toInt()
                ), Toast.LENGTH_LONG
            ).show()
        }

    }

    fun rgb(r: Int, g: Int, b: Int) = listOf(r, g, b).joinToString("") {
        it.coerceIn(0..255)
            .toString(16)
            .padStart(2, '0')
            .toUpperCase()
    }

}
