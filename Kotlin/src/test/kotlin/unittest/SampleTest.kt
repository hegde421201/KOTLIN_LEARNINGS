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


    }
}

//@Test annotation is used to mark the methods for testing. It is present in the package org.junit.jupiter.api
//The above annotated function can be private or protected also