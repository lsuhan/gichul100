package org.example;

import java.util.Scanner;

public class Loop {
    public static void back10950(){
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        int[] arr = new int[t];

        for(int i = 0; i < t; i++){
            int a = in.nextInt();
            int b = in.nextInt();

            arr[i] = a + b;
        }

        in.close();

        for(int st : arr){
            System.out.println(st);
        }
    }
}
