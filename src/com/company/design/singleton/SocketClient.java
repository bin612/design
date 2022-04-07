package com.company.design.singleton;

public class SocketClient {
    // 자기 자신을 가지고 있어야 함
    // null 초기화
    private static SocketClient socketClient = null;

    // 기본 생성자를 private으로 막아줌
    private SocketClient() {

    }

    public static SocketClient getInstance() {

        if(socketClient == null) {
           socketClient = new SocketClient(); // 소켓이 null이면 신규 생성 후 리턴 해준다.
        }
        return socketClient;
    }

    public void connect() {
        System.out.println("connect");
    }
}
