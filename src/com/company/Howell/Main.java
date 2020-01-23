package com.company.Howell;
import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	int i = 0;

	while(i < 10) {
        System.out.println(i);
        i += 2;
    }

    for(i = 0; i<10;){
        System.out.println(i);
        i+=2;
    }

    do {
        System.out.println(i);
        i+=2;
    }while(i < 8);

        int[]integers = {1,2,3,4,-1,-2,10};
        for(i=0; i<integers.length; i++){
            if(integers[i]<0){
                System.out.println("Negative Found: " +integers[i]);
            }
        }
        for(int j =1; j <=1; j++){
            System.out.println(j);
        }
        String st1 = input.nextLine();
        String st2 = st1.substring(1, st1.length() - 1);
        System.out.println(st2);

    }
}
