package edu.gatech;

/**
 * Created by jdaniel on 5/6/17.
 */
public class AddNumbers {
    public static void main(String[] args) {
        // Parse two numers form system args
        Integer a = Integer.parseInt(args[0]);
        Integer b = Integer.parseInt(args[1]);
        // Add the numbers
        int sum = a+b;
        // Print the result
        System.out.println(a + "+" + b + "=" + sum);
    }

}
