package com.example.simple;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
public class Demo {
    public static void main(String[] args) {

        //ActorSystem system = ActorSystem.create("MySystem");
        //ActorRef secondActor = system.actorOf(Props.create(SecondActor.class),"secondActor");
        //ActorRef demo = system.actorOf(Props.create(MyDemoActor.class),"myDemo");
        //demo.tell("测试消息",ActorRef.noSender());
        AkkaService akkaService =  AkkaService.getInstance(10001, "localServer", "localActor");
        //ActorRef demo =akkaService.getActorSystem()..actorOf(Props.create(MyDemoActor.class),"myDemo");
        akkaService.init();
        String str = akkaService.visitService("remoteServer", "127.0.0.1", 10002, "remoteActor", "Hello I'm local!");
        System.out.println(str);
    }
}
