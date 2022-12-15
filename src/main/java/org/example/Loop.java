package org.example;

import java.io.*;
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

    public static void back2439() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <=n; i++){
            for(int j = n- i; j >=1; j--){
                bw.write(" ");
            }
            for(int j =1; j <= i; j++){
                bw.write("*");
            }
            bw.write("\n");

        }


        bw.flush();
        br.close();
        bw.close();

    }

    public static void back1110()  throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int su = Integer.parseInt(br.readLine());
        int copy = su;
        int cnt = 0;
        do {
            su = ((su % 10) * 10) + (((su / 10) + (su % 10)) % 10);
            cnt++;
        } while (copy != su);

        System.out.println(cnt);


    }
}
