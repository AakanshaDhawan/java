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
class revint
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter number:");
int r =Integer.parseInt(br.readLine());
int k[]=new int[20];
int i=0,sum=0;
System.out.println("Reverse Order:");
while(r!=0)
{
k[i]=r%10;sum=sum+k[i];
System.out.println(k[i]);
r=r/10;
i++;
}

System.out.println("Sum:"+sum);
}
}
