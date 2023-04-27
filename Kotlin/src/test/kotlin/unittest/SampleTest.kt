package unittest

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.fail

import kotlin.test.Test
import kotlin.test.assertEquals

internal class SampleTest {

    private val testSample: Sample = Sample()

    @Test
    fun testSum() {
        val expected = 49
        assertEquals(expected, testSample.sum(47, 2))
      //  fail("Assertion failed")
    }
}