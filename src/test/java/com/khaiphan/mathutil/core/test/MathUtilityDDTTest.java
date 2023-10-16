
package com.khaiphan.mathutil.core.test;

import com.khaiphan.mathutil.core.MathUtility;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author ADMIN
 */
public class MathUtilityDDTTest {
    
    
    //ta cần cb bộ data để nhồi vào cái hàm qua 2 tham số 
    //đã chừa sẵn,
    //kĩ thuật tách data kiểm thử ra khỏi câu lệnh so sánh
    //để data ở riêng 1 chỗ, từ từ fill vào hàm so sánh
    //kĩ thuật này gọi là ddt data drven testing
    
    //data thường sẽ để ở mảng 2 chiều, 1 cái là đầu vào 1 cái là đầu ra expected 
    //và có nhiều cặp như thế 
    //kĩ thuật này còn gọi là tham số hóa kiểm thử 
    //đưa data vào qua tham số hàm
    
    //mảng 2 chiều này sẽ nhồi vào hàm ở dưới 
    public static Object[][] initData(){
        Object[][] dataSet = {{0, 1}, 
                              {1, 1}, 
                              {3, 6}, 
                              {4, 24}, 
                              {5, 120}};
        
        return dataSet;
    }
    
    @ParameterizedTest
    @MethodSource("initData")
    public void verifyFactorialGivenRightArumentReturnsOk(int n, long expected){
        assertEquals(expected, MathUtility.getFactorial(n));
    }

}
