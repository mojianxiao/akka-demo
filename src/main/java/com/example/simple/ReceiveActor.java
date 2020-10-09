package com.example.simple;

import akka.actor.UntypedAbstractActor;
public class ReceiveActor extends UntypedAbstractActor {

    @Override
    public void onReceive(Object msg) throws Exception {
        if (msg instanceof String) {
            try {
                System.out.println("收到消息 msg:" + msg.toString());
                this.getSender().tell("Hello I'm " + this.getSelf().path().name(), getSelf());
            } catch (Exception e) {
                e.printStackTrace();
                //logger.error(e.getMessage(), e);
                this.getSender().tell("Error!", getSelf());
            }
        } else {
            //logger.info(msg.toString());
        }
    }

}
