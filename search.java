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
class search
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int k[]=new int[20];int sum=0;float f;
        int i;
        System.out.println("Enter 10 numbers:");
        for(i=0;i<10;i++)
        {
            k[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Enter key element:");
        int a=Integer.parseInt(br.readLine());
        for(i=0;i<10;i++)
        {
            if(a==k[i])
            {
                System.out.println("Element found at"+i+"th index");
            }
            else
            {
                System.out.println("Element not found");
            }
        }
     }
  }

