package com.example.simple;

import akka.actor.AbstractActor;
import akka.actor.UntypedAbstractActor;

public class MyDemoActor extends UntypedAbstractActor {

    @Override
    public void onReceive(Object message) throws Throwable {
        System.out.println("MyDemoActor收到消息了现在发送");
        getSender().tell("消息为:"+message, getSelf());

    }
}
