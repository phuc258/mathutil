package com.phuctd.mathutil.core.test;

import org.junit.jupiter.api.Test;

import static com.phuctd.mathutil.core.MathUtility.*;
//import static chỉ dành cho những hàm static , để giúp ta làm biếng gõ tên class chấm. Lẽ ra phải là
//MathUtility.getFactorial(); thì nay chỉ cần gõ getFactorial() là đủ
//giả sử class có nhiều hàm static, thì ta đổi qua dấu *;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {
    @Test
    public void testFactorialGivenRightArg4RunsWell() {
        assertEquals(24, getFactorial(4));
    }
    @Test
    public void testFactorialGivenRightArg3RunsWell() {
        assertEquals(6, getFactorial(3));
    }
    @Test
    public void testFactorialGivenRightArg5RunsWell() {
        assertEquals(120, getFactorial(5));
    }



    @Test //@Test là ghi chú, đánh dấu, kí hiệu - annotation báo hiệu rằng hàm này là hàm main() có thể run
    //1 class test có thể có nhiều @Test, vậy 1 class Test có thể có nhiều hàm main()  - để ứng với nhiều kịch bản test
    // nhiều test case khác nhau đều run đc

    //TEST CASE #1: Check/Verify getFactorial() method with valid parameter, e.g. n = 0
    //STEPS/ PROCEDURE:
    //  1. Given a valid n, e.g. n = 0
    //  2. Call/invoke getFactorial(n = 0)
    //  3. Execute
    //EXPECTED RESULT:
    //  The method must return 1 as the result of 0!
    //STATUS:
    //  PASSED HAY FAILED ĐOÁN XEM, CHẠY APP ĐÃ!!!
    public void testFactorialGivenRightArg0RunsWell() {
        int n = 0; //đầu vào
        long expected = 1; //hope to see 0! = 1, kì vọng thoy

        //gọi hàm để xem actual
        long actualValue = getFactorial(n);

        //test nè, so sánh expected vs actual
        //dùng biến boolean hoặc in ra
        assertEquals(expected, actualValue);
        //vietsub"so sánh xem 0! có trả về con số 1 hay ko"
        //                          actual        expected

        assertEquals(1, getFactorial(0));
        //            actual        expected
        //hàm assertEquals() sẽ so sánh 2 value này, nó thảy ra 2 màu
        //màu xanh - PASSED - nếu 2 value giống nhau
        //màu đỏ - FAILED - nếu 2 value khác nhau
        //mắt vẫn phải nhìn, chỉ nhìn 2 màu
    }
}