package kata.academy.lln.fundamentals

import org.junit.Assert.assertArrayEquals
import org.junit.Test


class DoubleArrayTest {

    @Test
    fun testFixed() {
        assertArrayEquals(intArrayOf(2, 4, 6), DoubleArrayFragment().maps(intArrayOf(1, 2, 3)))
        assertArrayEquals(intArrayOf(8, 2, 2, 2, 8), DoubleArrayFragment().maps(intArrayOf(4, 1, 1, 1, 4)))
        assertArrayEquals(intArrayOf(4, 4, 4, 4, 4, 4), DoubleArrayFragment().maps(intArrayOf(2, 2, 2, 2, 2, 2)))
    }

}