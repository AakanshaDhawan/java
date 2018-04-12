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
public class fact {
    static int fac(int n)
    {
        if (n==1)
            return 1;
        else
            return (n*fac(n-1));
    }
  public static void main(String aa[])throws IOException
    {
        int n,f;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number");
        n=Integer.parseInt(br.readLine());
        System.out.println("factorial is:"+fac(n));
    }  

    
}
