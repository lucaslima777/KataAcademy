package kata.academy.lln.algorithms

import org.junit.Assert.*
import org.junit.Test

class NextNumberBiggerTest {

    var reverseString: String = ""

    @Test
    fun basicTests() {
        //assertEquals(21, nextBiggerNumber(12))
        //assertEquals(531, nextBiggerNumber(513))
        //assertEquals(2071, nextBiggerNumber(2017))
        assertEquals(441, nextBiggerNumber(414))
        assertEquals(414, nextBiggerNumber(144))
    }

    fun nextBiggerNumber(n: Long): Long {

        //val numbers = n.toString().map { it.toString().toInt() } //[1, 2]
        val numbers = n.toString()
        numbers.substring(1) + numbers[0]

        reverseString = ""
        reverseString = numbers.substring(1) + numbers[0]

        for (i in 0..numbers.length) {
            if (i == 1) {
                reverseString = reverseString.substring(1) + reverseString[0]

            } else if (i >= 2) {
                reverseString = numbers.substring(2) + numbers[1]
                reverseString = numbers[0] + reverseString

            } else {
                reverseString = numbers.substring(1) + numbers[0]
            }

            if (reverseString.toLong() > n) {
                return reverseString.toLong()
            }
        }
        // 135/351/513/135
        return -1
    }
}