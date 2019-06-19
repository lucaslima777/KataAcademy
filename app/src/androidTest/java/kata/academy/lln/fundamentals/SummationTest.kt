package kata.academy.lln.fundamentals

import org.junit.Assert.assertEquals
import org.junit.Test

class SummationTest {
    @Test
    fun test1() {
        assertEquals(1, SummationFragment().summation(1))
    }

    @Test
    fun test2() {
        assertEquals(36, SummationFragment().summation(8))
    }
}