package com.example.boot_web2;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.TimeUnit;

@DisplayName("Junit5测试类")
//@SpringBootTest
public class Junit5Test {


    @DisplayName("测试displayName注解")
    @Test
    void testDisplayName(){
        System.out.println("2. 给类或方法起名，可在控制台左边看到");
    }


    @BeforeEach
    void testBeforeEach(){
        System.out.println("1. 在每个测试方法之前运行");
    }


    @AfterEach
    void testAfterEach(){
        System.out.println("3. 在每个测试方法之后执行");
    }


    @BeforeAll
    static void testBeforeAll(){
        System.out.println("0. 在所有测试方法之前执行");
    }


    @AfterAll
    static void testAfterAll(){
        System.out.println("4. 在所有测试方法之后执行");
    }


//************************************************************************************************************

    @Disabled
    void testDisabled(){
        System.out.println("此注释的方法不执行");
    }


    @Test
    @Timeout(value = 500,unit = TimeUnit.MILLISECONDS)
    void testTimeout() throws InterruptedException {
        System.out.println("若此方法执行超过指定时间，则超时，报异常");
        Thread.sleep(700);
    }


    @Test
    @RepeatedTest(5)
    void testRepeatedTest(){
        System.out.println("指定此测试方法的执行次数");
    }


//**************************************** 测试断言 ************************************************************

    @Test
    @DisplayName("测试断言")
    void testSimpleAssertions(){
        int car = car(10, 1);
        //设置断言，期待值和返回值是否相等
        Assertions.assertEquals(11,car,"业务逻辑计算失败");
    }
    int car(int i , int j){
        return i+j+1;
    }


    @Test
    @DisplayName("测试断言2")
    void testSimpleAssertions2(){
        Object object1 = new Object();
        Object object2 = new Object();
        //设置断言判断两个对象是否是同一个对象
        Assertions.assertSame(object1,object2);
    }


    /**
     * 数组断言
     */
    @Test
    @DisplayName("数组断言")
    void testSimpleAssertions3(){
        //判断两个数组是否相等
        Assertions.assertArrayEquals(new int[]{1,2},new int[]{1,2});
    }


    /**
     *  组合断言
     */
    @Test
    @DisplayName("组合断言")
    void all(){
        //所有断言全部需要成功
        Assertions.assertAll("test",
                ()->Assertions.assertTrue(true&&true,"结果不为true"),
                ()->Assertions.assertEquals(2,3,"结果不相等"));
    }



    /**
     *  异常断言
     */
    @Test
    @DisplayName("异常断言")
    void testException(){
        Assertions.assertThrows(ArithmeticException.class,()->{int i = 10/0;},"异常居然正常执行");
    }


//*************************************************************************************************************

    /**
     * 测试前置条件
     * 如果前置条件失败了，则跳过
     */
    @DisplayName("测试前置条件")
    @Test
    void testAssumptions(){
        Assumptions.assumeTrue(false,"结果不是true");
        System.out.println("正常执行");
    }

//*************************************************************************************************************

    /*

        NullSource
        EnumSource
        MethodSource

     */


    /**
     *   参数化测试
     *   可以指定参数类型，和参数值。
     *   会依次根据参数测试
     */
    @DisplayName("参数化测试")
    @ParameterizedTest
    @ValueSource(ints = {1,2,4,5,6})
    void testParameterizedTest(int i){
        System.out.println(i);
    }



}
