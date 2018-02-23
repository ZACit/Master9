package com.zachary.gq.master9;

public class SectionFour {

    public static void main(String[] args) {

        System.out.println("123");

        // Java 9 Master Class |  "What's New in Java 9" Section 4, Lecture 19

        // Create a new class called "Processhandle", name it, and asign..

        ProcessHandle currProcess = ProcessHandle.current();
        System.out.println("PID: " + currProcess.pid());


        // .Info is an interface? @2:25
        ProcessHandle.Info currProcessInfo = currProcess.info();
        System.out.println("Info: " + currProcessInfo);


        // this is a test, git and branching.
        // and again..
        // and again....

        //commit test 1..
        System.out.println("this is a string");

    }
}
