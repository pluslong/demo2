package com.my;

public class My {

    public void say(String saystr){
        System.out.println(saystr);
    }

    public My() {
    }

    public static void main(String[] args) {
        new My().say("拟好");
    }
}
