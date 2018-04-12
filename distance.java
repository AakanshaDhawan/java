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
 class point {
    int x,y;
    point()
    {
        x=0;
        y=0;
    }
    point(int a,int b)
    {
        x=a;
        y=b;
    }
    void dis(point q,point r)
    {
        double dis1,dis;
        dis1=(((r.x-q.x)*(r.x-q.x))+((r.y-q.y)*(r.y-q.y)));
        dis=Math.sqrt(dis1);
        System.out.println("distance is :"+dis);
    }
}
public class distance
{
  
     public static void main(String aa[])throws IOException
    {
        int a,b,c,d;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter first point");
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
         System.out.println("Enter second point");
         c=Integer.parseInt(br.readLine());
        d=Integer.parseInt(br.readLine());
        point p=new point(a,b);
        point q=new point(c,d);
        point.dis(p,q);
    }
}
