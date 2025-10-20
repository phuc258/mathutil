package com.phuctd.mathutil.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {
    //CHUẨN BỊ BỘ DATA ĐỂ RIÊNG, SAU ĐÓ FILL VÀO LỆNH TEST
    //MẢNG 2 CHIỀU. GỒM GIÁ TRỌ KÌ VỌNG | CON n!
    public static Object[][] initTestData() {
        //trả về mảng 2 chiều
        //các phần tử của mảng cách nhau dấu ,}
        Object[][] dataset =
                {{0, 1}, //0! = 1    //{5, 10, 15, 20}
                {1, 1}, //1! = 1
                {2, 2}, //2! = 2
                {3, 6}, //3! = 6
                {4, 24}, //4! = 24
                {5, 120}, //5! = 120
                {6, 720} //6! = 720 //[7][2]
        };
        return dataset;
    }

    @ParameterizedTest
    @MethodSource("initTestData") //tên hàm cung cấp data
    public void testFactorialGivenRightArgRunsWell(int n, long expected) {

        assertEquals(expected, MathUtility.getFactorial(n));
        }
    }