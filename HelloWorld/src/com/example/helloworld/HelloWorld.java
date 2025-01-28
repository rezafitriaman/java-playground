package com.example.helloworld;

import static com.example.helloworld.AverageFinder.findAverage;

public class HelloWorld {
    public static void main(String[] args) {
       System.out.println("Hello World!");
       System.out.println("Average finder v0.1");
       double avg = findAverage(args);

       System.out.println("The average is " + avg);

       Person reza = new Person("Reza", 28, "Asingastraat");
       System.out.println(reza);
    }
}
