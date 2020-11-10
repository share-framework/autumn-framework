package org.andot.autumn.aop;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibDynamicProxy {
    public static <T> T createProxyInstance(final Class<T> tClass){
        return (T) Enhancer.create(tClass, new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                before();
                Object result = methodProxy.invokeSuper(o, objects);
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
