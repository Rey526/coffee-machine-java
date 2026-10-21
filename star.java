package com.example.demo;

import java.util.Scanner;

public class star {


        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

           int len  = scan.nextInt();

           String[][] star = new String [len][len];

           int middle = len / 2;

           for(int i = 0 ; i < star.length; i++){
               for(int j = 0; j < star[i].length; j++){
                   if(i == j || i + j == len - 1){

                       star[i][j] = "*";

                   }else if(j == middle){
                       star[i][middle] = "*";


                   }else if(i == middle){
                       star[middle][j] = "*";

                   }
                   else{
                       star[i][j] = ".";

                   }

               }
               System.out.println(String.join(" ", star[i]));

           }






        }
    }































