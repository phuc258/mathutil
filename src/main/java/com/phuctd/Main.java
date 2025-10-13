package com.phuctd;


import com.phuctd.mathutil.core.MathUtility;

public class Main {
    public static void main(String[] args) {
        testFactorialGivenRightArg0RunsWell();
        testFactorialGivenRightArg5RunsWell();
        testFactorialGivenRightArg6RunsWell();
        testFactorialGivenWrongArgMinus5ThrowsException();
    }

    //TEST CASE #3: Check/Verify getFactorial() method with Invalid parameter, e.g. n = -5
    //STEPS/ PROCEDURE:
    //  1. Given a invalid n, e.g. n = -5
    //  2. Call/invoke getFactorial(n = 6)
    //  3. Execute
    //EXPECTED RESULT:
    //  The method will throw an exception
    //STATUS:
    //  PASSED HAY FAILED ĐOÁN XEM, CHẠY APP ĐÃ!!!
    public static void testFactorialGivenWrongArgMinus5ThrowsException() {
        MathUtility.getFactorial(-5); //PASSED VÌ KÌ VỌNG NGOẠI LỆ XUẤT HIỆN, VÀ NGOẠI LỆ XUẬT HIỆN THẬT!!!
        //THẤY NGOẠI LỆ MÀ PASSED LÀ TÌNH HUỐNG TA THIẾT KẾ HÀM SẼ XẢY RA NGOẠI LỆ VỚI SỐ ÂM GIAI THỪA!!!!
    }

    //TEST CASE #3: Check/Verify getFactorial() method with valid parameter, e.g. n = 0
    //STEPS/ PROCEDURE:
    //  1. Given a valid n, e.g. n = 0
    //  2. Call/invoke getFactorial(n = 6)
    //  3. Execute
    //EXPECTED RESULT:
    //  The method must return 720 as the result of 6!
    //STATUS:
    //  PASSED HAY FAILED ĐOÁN XEM, CHẠY APP ĐÃ!!!
    public static void testFactorialGivenRightArg6RunsWell() {
        System.out.println("6! | expected: 720 " + " | actual: " + com.phuctd.mathutil.core.MathUtility.getFactorial(6));
    }
    //TEST CASE #2: Check/Verify getFactorial() method with valid parameter, e.g. n = 0
    //STEPS/ PROCEDURE:
    //  1. Given a valid n, e.g. n = 0
    //  2. Call/invoke getFactorial(n = 5)
    //  3. Execute
    //EXPECTED RESULT:
    //  The method must return 120 as the result of 5!
    //STATUS:
    //  PASSED HAY FAILED ĐOÁN XEM, CHẠY APP ĐÃ!!!
    public static void testFactorialGivenRightArg5RunsWell() {
        int n = 5; //đầu vào
        long expected = 120; //hope to see 5! = 120, kì vọng thoy

        //gọi hàm để xem actual
        long actualValue = com.phuctd.mathutil.core.MathUtility.getFactorial(n);

        //test nè, so sánh expected vs actual
        //dùng biến boolean hoặc in ra
        System.out.println("5! | expected: " + expected + " | actual: " + actualValue);
    }
    //TEST CASE #1: Check/Verify getFactorial() method with valid parameter, e.g. n = 0
    //STEPS/ PROCEDURE:
    //  1. Given a valid n, e.g. n = 0
    //  2. Call/invoke getFactorial(n = 0)
    //  3. Execute
    //EXPECTED RESULT:
    //  The method must return 1 as the result of 0!
    //STATUS:
    //  PASSED HAY FAILED ĐOÁN XEM, CHẠY APP ĐÃ!!!
    public static void testFactorialGivenRightArg0RunsWell() {
        int n = 0; //đầu vào
        long expected = 1; //hope to see 0! = 1, kì vọng thoy

        //gọi hàm để xem actual
        long actualValue = com.phuctd.mathutil.core.MathUtility.getFactorial(n);

        //test nè, so sánh expected vs actual
        //dùng biến boolean hoặc in ra
        System.out.println("0! | expected: " + expected + " | actual: " + actualValue);
    }
}