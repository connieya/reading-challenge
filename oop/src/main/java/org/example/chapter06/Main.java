package org.example.chapter06;

public class Main {
    public static void main(String[] args) {
        Assembler assembler = new Assembler();
        assembler.createAndWire();
        Worker worker = assembler.getWorker();
        JobCLI jobCLI = assembler.getJobCLI();


    }
}
