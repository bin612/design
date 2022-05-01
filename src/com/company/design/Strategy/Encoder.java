package com.company.design.Strategy;

public class Encoder {

    private EncodingStrategy encodingStrategy;

    // 각각의 메시지를 받을 수 있음
    public String getMessage(String message){
        return this.encodingStrategy.encode(message);
    }

    public void setEncodingStrategy(EncodingStrategy encodingStrategy) {
        this.encodingStrategy = encodingStrategy;
    }
}
