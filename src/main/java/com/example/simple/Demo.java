package com.example.simple;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
public class Demo {
    public static void main(String[] args) {

        ActorSystem system = ActorSystem.create("MySystem");
        ActorRef first = system.actorOf(Props.create(FirstActor.class),"first");
        ActorRef demo = system.actorOf(Props.create(MyDemoActor.class),"myDemo");
        demo.tell("测试消息",ActorRef.noSender());
    }
}
