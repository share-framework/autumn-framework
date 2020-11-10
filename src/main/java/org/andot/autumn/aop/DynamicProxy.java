package org.andot.autumn.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy {
    public static <T> T createProxyInstance(final T t){
        return (T) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), t.getClass().getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                before();
                Object result = method.invoke(t, args);
                after();
                return result;
            }

            private void before(){
                System.err.println("before");
            }
            private void after(){
                System.err.println("after");
            }
        });
    }
}
