/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author aakansha
 */
import java.io.*;
import java.util.Scanner;
class sumwo
{
    public static int sum(int a,int b)
    {
        return(a+b);
    }
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter first number");
        int num1=scan.nextInt();
        System.out.println("enter second number");
        int num2=scan.nextInt();
        System.out.println("enter third number");
        int num3=scan.nextInt();
        System.out.println("enter fourth number");
        int num4=scan.nextInt();
        System.out.println("enter fifth number");
        int num5=scan.nextInt();
        int s=sum(sum(sum(sum(num1,num2),num3),num4),num5);
        System.out.println("sum="+s);
    }
}
