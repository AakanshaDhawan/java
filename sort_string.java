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
class sort_string
{
    static String b[]={"case","public","final"};

    public static void sort(int n)
    {
        int i,j;String k;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-1;j++)
            {
                if(b[j].compareTo(b[j+1])>0)
                {
                    k=b[j];
                    b[j]=b[j+1];
                    b[j+1]=k;
                }
            }
        }
    }
    public static void main(String args[])
    {
        
        int i;
        sort(2);
        for(i=0;i<2;i++)
        {
            System.out.println(b[i]);
        }
    }
}
