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
public class sum_even {
      public static void main(String aa[])throws IOException
    {
        int n, sum=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<10;i++)
        {
            System.out.println("enter the number");
            n=Integer.parseInt(br.readLine());
            if(n%2==0)
                sum=sum+n;
        }
        System.out.println("sum of even numbers is:"+sum);
    }  
    
}
