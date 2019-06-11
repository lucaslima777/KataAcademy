package kata.academy.lln.fundamentals

import org.junit.Assert.assertArrayEquals
import org.junit.Test


class DoubleArrayTest {

    @Test
    fun testFixed() {
        assertArrayEquals(intArrayOf(2, 4, 6), maps(intArrayOf(1, 2, 3)))
        assertArrayEquals(intArrayOf(8, 2, 2, 2, 8), maps(intArrayOf(4, 1, 1, 1, 4)))
        assertArrayEquals(intArrayOf(4, 4, 4, 4, 4, 4), maps(intArrayOf(2, 2, 2, 2, 2, 2)))
    }

    fun maps(x: IntArray) = x.map {
        it * 2
    }.toIntArray()
}