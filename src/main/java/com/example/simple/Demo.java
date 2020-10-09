package com.example.simple;

import akka.actor.ActorRef;

public class Demo {
    public static void main(String[] args) {
        ActorSystemTools.start();
        ActorRef demo = ActorSystemTools.actorOf(MyDemoActor.class);
        ActorRef first = ActorSystemTools.actorOf(FirstActor.class);
        demo.tell("测试消息",first);
    }
}
