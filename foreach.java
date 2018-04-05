/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programs;

import java.io.*;

/**
 *
 * @author aakansha
 */
public class foreach {
     public static void main(String aa[])throws IOException
    {
        int marks[]={125,90,5,264,57};
        int high=maximum(marks);
        System.out.println("heighest Score"+high);
    }

    private static int maximum(int[] marks) {
         int max=0;
         for(int num:marks)
         {
             if(num>max)
                 max=num;
         }
         return max;
    }
    
}
