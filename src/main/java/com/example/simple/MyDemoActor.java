package com.example.simple;

import akka.actor.*;

public class MyDemoActor extends UntypedAbstractActor {

    @Override
    public void onReceive(Object message) throws Throwable {
        System.out.println("MyDemoActor收到消息了现在发送");
            System.out.println(getSender().path());
        ActorSystem system = ActorSystem.create("test");
        ActorSelection first = system.actorSelection("akka.tcp://test@192.168.93.32:59928/user/demo");
        first.tell("ss", ActorRef.noSender());

    }
}
