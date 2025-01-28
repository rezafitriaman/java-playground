package com.example.helloworld;

public class AverageFinder {
    private static boolean ready = false;
    static double findAverage(String[] input) {
        double result = 0;
        for (String s : input) {
//            if(s.equals("2")){
//                throw new RuntimeException();
//            }else {
//                result += Integer.parseInt(s);
//            }
                ready = true;
            result += Integer.parseInt(s);
//                System.out.println("hit");
                if (s.equals("3")) {
                    ready = false;
                }
        }
        isReady(ready);

        return result / getLength(input);
    }

    private static int getLength(String[] input) {
        return input.length;
    }

    private static void isReady(boolean ready) {
        if (ready) {
            System.out.println("yes");
        }
    }
}
//false ready false
//        false
//        true
//        true
//        true
//        false