package org.andot.autumn.aop;

public class Test {
    public static void main(String[] args) {
        /*Greeting greeting = DynamicProxy.createProxyInstance(new Test1());
        greeting.seyHello();
        Greeting greeting1 = DynamicProxy.createProxyInstance(new Test2());
        greeting1.seyHello();
        Test3 test3 = DynamicProxy.createProxyInstance(new Test3());
        test3.seyHello();*/


        Test1 greeting = CglibDynamicProxy.createProxyInstance(Test1.class);
        greeting.seyHello();
        Test2 greeting1 = CglibDynamicProxy.createProxyInstance(Test2.class);
        greeting1.seyHello();
        Test3 test3 = CglibDynamicProxy.createProxyInstance(Test3.class);
        test3.seyHello();
    }
}
