package com.example.simple;

import akka.actor.*;

public class FirstActor extends UntypedAbstractActor {

    @Override
    public void onReceive(Object message) throws Throwable {

        System.out.println("FirstActor收到的消息为:"+message);
    }

  
}
