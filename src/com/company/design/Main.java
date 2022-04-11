package com.company.design;

import com.company.design.adepter.*;
import com.company.design.aop.AopBrowser;
import com.company.design.proxy.Browser;
import com.company.design.proxy.BrowserProxy;
import com.company.design.proxy.IBrowser;
import com.company.design.singleton.Aclazz;
import com.company.design.singleton.Bclazz;
import com.company.design.singleton.SocketClient;

import java.util.concurrent.atomic.AtomicLong;

public class Main {

    public static void main(String[] args) {
        /*Aclazz aclazz = new Aclazz();
        Bclazz bclazz = new Bclazz();

        // 같은 클래스인지 확인 하기 위함
        SocketClient aClient = aclazz.getSocketClient();
        SocketClient bClient = bclazz.getSocketClient();

        System.out.println("두개의 객체가 동일한가?");
        System.out.println(aClient.equals(bClient));*/

     /*   HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        // 220v -> 110v
        Cleaner cleaner = new Cleaner();
        Electronic110V adapter = new SocketAdapter(cleaner);
        connect(adapter);

        // 220v -> 110v
        AirConditioner airConditioner = new AirConditioner();
        Electronic110V ariAdapter = new SocketAdapter(airConditioner);
        connect(ariAdapter);*/

     /*   IBrowser browser = new BrowserProxy("www.naver.com");
        browser.show();
        browser.show();
        browser.show();
        browser.show();
        browser.show();*/

        //동시성 문제
        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBrowser aopBrowser = new AopBrowser("www.naver.com",
            // 람다식
            ()->{
                System.out.println("before");
                start.set(System.currentTimeMillis());
            },
            ()->{
                long now = System.currentTimeMillis();
                end.set(now - start.get());
            }
        );

        aopBrowser.show();
        System.out.println("loading time : " + end.get());

        aopBrowser.show();
        System.out.println("loading time : " + end.get());

    }

    // 콘센트
    // public static void connect(Electronic110V electronic110V) {
    //  electronic110V.powerOn();
    //}
}
