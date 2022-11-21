package com.lern.cycles;

public class Main {

    public static void main(String[] args) {

        args = new String[]{"FOR"};
        for (int i = 0; i < args.length; i++) {

            System.out.println(args[i]);
        }

        args = new String[]{"WHILE"};
        int i = 0;
        while (i < args.length) {

            System.out.println(args[i]);

            i++;
        }

        args = new String[]{"DO WHILE"};
        int a = 0;
        do{
            System.out.println(args[a]);
            a++;
        }while(a < args.length);

        args = new String[]{"RECURSION #1", "RECURSION #2"};
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
