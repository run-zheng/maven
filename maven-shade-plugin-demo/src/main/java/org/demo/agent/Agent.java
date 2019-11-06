package org.demo.agent;

import java.lang.instrument.Instrumentation;

public class Agent {
    public static void premain(String args, Instrumentation inst){
        System.out.println("Hello Agent!!!");
    }

    public static void premain(String args){
        System.out.println("Hello Agent!!!");
    }
}
