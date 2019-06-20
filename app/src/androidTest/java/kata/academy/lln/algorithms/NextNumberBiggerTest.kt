package kata.academy.lln.algorithms

import org.junit.Assert.assertEquals
import org.junit.Test

class NextNumberBiggerTest {

    @Test
    fun basicTests() {
        assertEquals(21, NextNumberBiggerFragment().nextBiggerNumber(12))
        assertEquals(531, NextNumberBiggerFragment().nextBiggerNumber(513))
        assertEquals(2071, NextNumberBiggerFragment().nextBiggerNumber(2017))
        assertEquals(441, NextNumberBiggerFragment().nextBiggerNumber(414))
        assertEquals(414, NextNumberBiggerFragment().nextBiggerNumber(144))
    }
}