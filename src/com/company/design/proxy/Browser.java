package com.company.design.proxy;

public class Browser implements IBrowser{
    private String url;

    public Browser(String url) {
        this.url = url;
    }

    @Override
    public Html show() {
        System.out.println("browser loding html url: " + url);
        // 새로운 html
        return new Html(url);
    }
}
