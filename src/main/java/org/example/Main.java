package org.example;

import static org.example.Loop.back10950;
import static org.example.Loop.back2439;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //TODO: 2022-12-10 틀린문제.
/*        백준: 10950-- 문제 이해를 잘못..(테스트 케이스 만큼의 갯수를 한번에 출력하는 문제인데 한번씩 scanner로 출력)
        back10950();*/
        //TODO: 2022-12-12 틀린문제 (loop 예제 끝)
        //백준: 2439 거꾸로 별찍기.
        /*back2439();*/

        Scanner sc = new Scanner(System.in);

        while (true){

            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a > 0 && b > 0){
                System.out.println(a + b);
            }else{
                break;
            }
        }




    }
}
