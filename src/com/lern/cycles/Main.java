package com.lern.cycles;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        int i = 0;
        while (i < args.length) {
            System.out.println(args[i]);
            i++;
        }

        int a = 0;
        do {
            System.out.println(args[a]);
            a++;
        } while(a < args.length);

        recursion(args, 0);
    }

    private static void recursion(String[] array, int i) {
        System.out.println(array[i]);

        if (i + 1 < array.length) {
            recursion(array, i + 1);
        }
    }

    //func({"1", "2"], 0) -> func(["1","2"], 1) -> sout  -> exit from function
}
