package com.example.simple;

import akka.actor.*;

public class MyDemoActor extends UntypedAbstractActor {

    @Override
    public void onReceive(Object message) throws Throwable {
        System.out.println("MyDemoActor收到消息了现在发送");
            System.out.println(getSender().path());
        ActorSelection first = this.getContext().actorSelection("akka://MySystem/user/secondActor");
        first.tell("ss",ActorRef.noSender());
        //first.tell("ss", ActorRef.noSender());

    }
}
