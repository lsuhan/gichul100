package org.example;

import static org.example.Loop.back10950;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // TODO: 2022-12-10 틀린문제. 
/*        백준: 10950-- 문제 이해를 잘못..(테스트 케이스 만큼의 갯수를 한번에 출력하는 문제인데 한번씩 scanner로 출력)
        back10950();*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine()," ");
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
        }
        br.close();

        bw.flush();
        bw.close();
    }
}