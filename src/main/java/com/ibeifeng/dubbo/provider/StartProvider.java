package com.ibeifeng.dubbo.provider;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 
 * StartProvider
 *	
 * @Description 启动provider类
 * @author yanglin
 * @version 1.0,2017年8月23日
 * @see
 * @since
 */
public class StartProvider {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "provider.xml" });
        context.start();
        System.out.println("dubbo provider starat");
        try {
            System.in.read();   // 按任意键退出
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
}
