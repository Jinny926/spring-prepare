package com.meta.springprepare.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@Nested
@DisplayName("계산기 테스트")

public class CalculatorTest {
    @Test
    @DisplayName("더하기 테스트")
    void test1(){
        //Given/When
    }
}
@Test
@DisplayName("나누기 Null 테스트")
void test5(){
    Double num1=8.0;
    String op="/";
    Double num2=0.0;
    Calculator calculator=new Calculator();

    Double result=calculator.
}

@Test
@DisplayName("잘못된 연산자 입력 테스트")
void test6(){
    Double num1=8.0;
    String op="%";
    Double num2=0.0;
    Calculator calculator=new Calculator();

    // When & Then
    IllegalArgumentException thrown= Assertions.assertThrows(
            IllegalArgumentException.class,
            ()-> calculator.operate(num1,op,num2)
    );

}

