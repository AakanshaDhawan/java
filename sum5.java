package programs;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aakansha
 */
public class sum5 {
      public static void main(String aa[])throws IOException
    {
        int a,b,c,d,e,sum;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter five numbers");
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        c=Integer.parseInt(br.readLine());
        d=Integer.parseInt(br.readLine());
        e=Integer.parseInt(br.readLine());        
        sum=a+b+c+d+e;
        System.out.println("sum is:"+sum);
    }  
}
