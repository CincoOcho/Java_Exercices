package com.mycompany.testings;

import java.util.Scanner;

/*
     @author CincoOcho < ///7 https://github.com/CincoOcho ///7>
 */
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int begin = scn.nextInt();
        int limit = scn.nextInt();
        int auxBegin = begin + 1;
        int auxLimit = limit - 1;
        int wall = limit - 1;

        long acum = 0;
        if (limit - 1 == begin) {
            System.out.println(begin);
        } else {

            for (int i = begin; i < limit; i++) {
                acum = begin * auxLimit;
                if (acum == begin) {
                    break;
                } else {
                    auxLimit--;
                }
                for (int j = auxBegin; j < wall; j++, auxLimit--, i++) {
                    acum *= auxLimit;
                }
                limit--;
                i++;
            }
            System.out.println(acum);
        }
    }

}