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
public class avg_arr {
     public static void main(String aa[])throws IOException
    {
        int n;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size");
        n=Integer.parseInt(br.readLine());
        int ar[]=new int[n],sum=0;
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the element");
            ar[i]=Integer.parseInt(br.readLine());
            sum=sum+ar[i];
        }
        System.out.println("avg of array"+(sum/n));
    } 
}
