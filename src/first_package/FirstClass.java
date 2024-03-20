package first_package;

public class FirstClass {

    public static void main(String[] args) {

        // Write a program that can return the factorial number of 5.
        int num = 5;

        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial number is: " + factorial);


    }

}
