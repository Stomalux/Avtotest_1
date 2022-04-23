package ru.netology

import commission
import org.junit.Test

import org.junit.Assert.*

class AvtoTest_1KtTest {

    @Test
    fun commission_VK_Pay_Norm() {

        // Arrange — подготовка данных (задание переменных).
        val tipKardTest: String = "VK_Pay"
        val summOldTest: Int = 10_000_00
        val summNewTest: Int = 15_000_00

        //  Act — выполнение целевого действия (вызов функции).
        val result = commission(

            tipKard = tipKardTest,
            summOld = summOldTest,
            summNew = summNewTest
        )

        //  Assert — сравнение ожидаемого результата с фактическим.
        assertEquals(0, result)
    }

    @Test
    fun commission_VK_Pay_Nev() {

        // Arrange — подготовка данных (задание переменных).
        val tipKardTest: String = "VK_Pay"
        val summOldTest: Int = 10
        val summNewTest: Int = 16_000_00

        //  Act — выполнение целевого действия (вызов функции).
        val result = commission(

            tipKard = tipKardTest,
            summOld = summOldTest,
            summNew = summNewTest
        )

        //  Assert — сравнение ожидаемого результата с фактическим.
        assertEquals(-1, result)
    }

    @Test
    fun commission_VK_Pay_Old() {

        // Arrange — подготовка данных (задание переменных).
        val tipKardTest: String = "VK_Pay"
        val summOldTest: Int = 35_000_00
        val summNewTest: Int = 10_000_00

        //  Act — выполнение целевого действия (вызов функции).
        val result = commission(

            tipKard = tipKardTest,
            summOld = summOldTest,
            summNew = summNewTest
        )

        //  Assert — сравнение ожидаемого результата с фактическим.
        assertEquals(-1, result)
    }

    @Test
    fun commission_Maestro_Min() {

        // Arrange — подготовка данных (задание переменных).
        val tipKardTest: String = "Maestro"
        val summOldTest: Int = 10_00
        val summNewTest: Int = 74_000_00

        //  Act — выполнение целевого действия (вызов функции).
        val result = commission(

            tipKard = tipKardTest,
            summOld = summOldTest,
            summNew = summNewTest
        )

        //  Assert — сравнение ожидаемого результата с фактическим.
        assertEquals(0, result)
    }

    @Test
    fun commission_Maestro_Normal() {

        // Arrange — подготовка данных (задание переменных).
        val tipKardTest: String = "Maestro"
        val summOldTest: Int = 100_000_00
        val summNewTest: Int = 74_000_00

        //  Act — выполнение целевого действия (вызов функции).
        val result = commission(

            tipKard = tipKardTest,
            summOld = summOldTest,
            summNew = summNewTest
        )

        //  Assert — сравнение ожидаемого результата с фактическим.
        assertEquals(46400, result)
    }
    @Test
    fun commission_Mastercard_Min() {

        // Arrange — подготовка данных (задание переменных).
        val tipKardTest: String = "Mastercard"
        val summOldTest: Int = 10_00
        val summNewTest: Int = 74_000_00

        //  Act — выполнение целевого действия (вызов функции).
        val result = commission(

            tipKard = tipKardTest,
            summOld = summOldTest,
            summNew = summNewTest
        )

        //  Assert — сравнение ожидаемого результата с фактическим.
        assertEquals(0, result)
    }

    @Test
    fun commission_Mastercard_Normal() {

        // Arrange — подготовка данных (задание переменных).
        val tipKardTest: String = "Mastercard"
        val summOldTest: Int = 100_000_00
        val summNewTest: Int = 74_000_00

        //  Act — выполнение целевого действия (вызов функции).
        val result = commission(

            tipKard = tipKardTest,
            summOld = summOldTest,
            summNew = summNewTest
        )

        //  Assert — сравнение ожидаемого результата с фактическим.
        assertEquals(46400, result)
    }

    @Test
    fun commission_Visa_Ok() {

        // Arrange — подготовка данных (задание переменных).
        val tipKardTest: String = "Visa"
        val summOldTest: Int = 100_000_00
        val summNewTest: Int = 100_000_00

        //  Act — выполнение целевого действия (вызов функции).
        val result = commission(

            tipKard = tipKardTest,
            summOld = summOldTest,
            summNew = summNewTest
        )

        //  Assert — сравнение ожидаемого результата с фактическим.
        assertEquals(75000, result)
    }

    @Test
    fun commission_Visa_Min() {

        // Arrange — подготовка данных (задание переменных).
        val tipKardTest: String = "Visa"
        val summOldTest: Int = 100_000_00
        val summNewTest: Int = 100

        //  Act — выполнение целевого действия (вызов функции).
        val result = commission(

            tipKard = tipKardTest,
            summOld = summOldTest,
            summNew = summNewTest
        )

        //  Assert — сравнение ожидаемого результата с фактическим.
        assertEquals(0, result) // поломал сборку 0 вместо 3500
    }
    @Test
    fun commission_Mir_Ok() {

        // Arrange — подготовка данных (задание переменных).
        val tipKardTest: String = "Mir"
        val summOldTest: Int = 100_000_00
        val summNewTest: Int = 100_000_00

        //  Act — выполнение целевого действия (вызов функции).
        val result = commission(

            tipKard = tipKardTest,
            summOld = summOldTest,
            summNew = summNewTest
        )

        //  Assert — сравнение ожидаемого результата с фактическим.
        assertEquals(75000, result)
    }

    @Test
    fun commission_Mir_Min() {

        // Arrange — подготовка данных (задание переменных).
        val tipKardTest: String = "Mir"
        val summOldTest: Int = 100_000_00
        val summNewTest: Int = 100

        //  Act — выполнение целевого действия (вызов функции).
        val result = commission(

            tipKard = tipKardTest,
            summOld = summOldTest,
            summNew = summNewTest
        )

        //  Assert — сравнение ожидаемого результата с фактическим.
        assertEquals(3500, result)
    }

}