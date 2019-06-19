package kata.academy.lln.fundamentals

import org.junit.Assert.assertEquals
import org.junit.Test

class VowelCountTest {


    @Test
    fun testFixed() {

        assertEquals(5, getCount("abracadabra"))
        assertEquals(1, getCount("test"))
        assertEquals(3, getCount("example"))
    }

    fun getCount(str: String): Int {
        return str.count { x -> "aeiou".contains(x) }
    }

}