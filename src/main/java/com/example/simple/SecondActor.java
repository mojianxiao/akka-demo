package com.example.simple;

import akka.actor.UntypedAbstractActor;

public class SecondActor extends UntypedAbstractActor {

    @Override
    public void onReceive(Object message) throws Throwable {

        System.out.println("SecondActor收到的消息为:"+message);
    }

  
}
