package com.example.demo;
import java.util.Scanner;

public class percentagecalculator {
    public static void main(String[] args) {
    Scanner permittotakeinput=new Scanner(System.in); // taking permission to use powers of jaadu
    // taking input of marks from user
        System.out.print("Enter Maths Mark = ");
        int mark1=permittotakeinput.nextInt();
        System.out.print("Enter Physics Mark = ");
        int mark2=permittotakeinput.nextInt();
        System.out.print("Enter Chemistry Mark = ");
        int mark3=permittotakeinput.nextInt();
        System.out.print("Enter English Mark = ");
        int mark4=permittotakeinput.nextInt();
        System.out.print("Enter IP Mark = ");
        int mark5=permittotakeinput.nextInt();
        // adding the marks of all subject
        int sum=mark1+mark2+mark3+mark4+mark5;
        float divide=sum/5f;
       // int percentage=divide*100;
        System.out.print("Percentage = ");
        System.out.println(divide+"%");
    }

}
