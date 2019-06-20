package kata.academy.lln

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import kata.academy.lln.algorithms.NextNumberBiggerFragment
import kata.academy.lln.databinding.ActivityMainBinding
import kata.academy.lln.fundamentals.DoubleArrayFragment
import kata.academy.lln.fundamentals.SummationFragment
import kata.academy.lln.fundamentals.VowelCountFragment

/**
 * @author lucas lima
 * @since 11/06/2019
 * @att 19/06/2019
 */
class MainActivity : AppCompatActivity(), BaseLauncher {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val fragment = getNextNumberBigger()
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()

        transaction.replace(R.id.fragment, fragment)
        transaction.addToBackStack(null)

        transaction.commit()

    }

    override fun getDoubleArray(): Fragment {
        return DoubleArrayFragment()
    }

    override fun getSummation(): Fragment {
        return SummationFragment()
    }

    override fun getVowelCount(): Fragment {
        return VowelCountFragment()
    }

    override fun getNextNumberBigger(): Fragment {
        return NextNumberBiggerFragment()
    }
}
