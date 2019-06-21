package kata.academy.lln.algorithms

import android.graphics.Color
import org.junit.Assert.*
import org.junit.Test

class RgbToHexFragmentTest {

    @Test
    fun testFixed() {
        assertEquals("000000", RgbToHexFragment().rgb(0, 0, 0))
        assertEquals("000000", RgbToHexFragment().rgb(0, 0, -20))
        assertEquals("FFFFFF", RgbToHexFragment().rgb(300, 255, 255))
        assertEquals("ADFF2F", RgbToHexFragment().rgb(173, 255, 47))
        assertEquals("9400D3", RgbToHexFragment().rgb(148, 0, 211))
    }

}