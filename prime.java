/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static programs.fact.fac;

/**
 *
 * @author aakansha
 */
public class prime {
    public static void main(String aa[])throws IOException
    {
        int n,f=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number");
        n=Integer.parseInt(br.readLine());
        for(int i=0;i<n/2;i++)
        {
            if(n%i==0)
                f=1;
        }
        if (f==0)
            System.out.println("prime no");
        else
            System.out.println("not prime");
    }  
    
}
