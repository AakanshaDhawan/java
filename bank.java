/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programs;

/**
 *
 * @author aakansha
 */
import java.io.*;
import java.util.Scanner;
class bank
{
public static void main(String args[])
{
Scanner scan =new Scanner(System.in);
int bal=5000;
System.out.println("Balence in your Account="+bal);
System.out.println("press 1 for credit");
System.out.println("press 2 for debit");
System.out.println("Enter your choice:");
int ch=scan.nextInt();
switch(ch)
{
case 1:
System.out.println("enter amount:");
int amt1=scan.nextInt();
bal=bal+amt1;
System.out.println("Balence="+bal);
break;
case 2:
System.out.println("enter amount:");
int amt2=scan.nextInt();
bal=bal-amt2;
System.out.println("Balence="+bal);
break;
default:
System.out.println("Wrong choices");
}

}
}
