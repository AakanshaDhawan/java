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
class marks
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int k[]=new int[20];int sum=0;float f;
        int i;
        System.out.println("Enter marks of five subjects:");
        for(i=0;i<5;i++)
        {
            k[i]=Integer.parseInt(br.readLine());
            sum=sum+k[i];
        }
        f=sum/5;
        System.out.println("percentage="+f+"%");
    }
}