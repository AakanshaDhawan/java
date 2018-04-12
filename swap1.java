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
public class swap1 {
     public static void main(String aa[])throws IOException
    {
        int a,b,c;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        System.out.println("Items Before Swpping: A:"+a+"b:"+b);
        c=a;
        a=b;
        b=c;
        System.out.println("Items After Swpping: A:"+a+"b:"+b);
    }
     
}
