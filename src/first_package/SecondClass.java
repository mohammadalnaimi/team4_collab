package first_package;

import java.util.logging.SocketHandler;

public class SecondClass {

    public static void main(String[] args) {

        System.out.println("Hello guys!");

        System.out.println("How are you?");

        /*
        Given an int n, return true if it is within 10 of 100 or 200.

        Outptut:

        93 → true
        90 → true
        89 → false
        105 → true
        120 → false
         */

        int num = 96;

        if((num>89 && num<111) || (num>189 && num< 211)){
            System.out.println("true");;
        }else{
            System.out.println("false");
        }


    }
}
