/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programs;

import java.io.*;

public class sol {
    public static void main(String aa[])throws IOException
    {
        int a,b,c;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        c=a+b;
        System.out.println("The sum is:"+c);
    }
}
