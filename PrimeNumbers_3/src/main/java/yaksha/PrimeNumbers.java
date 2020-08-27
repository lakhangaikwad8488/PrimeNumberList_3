package main.java.yaksha;

import java.io.*;

import java.util.Scanner;

public class PrimeNumbers{
    public static void main (String[] args) throws IOException {
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter two number :");
            int a=sc.nextInt();
            int b=sc.nextInt();
            boolean p=primeNumberList(a,b);
            if(p==false) {
            	System.out.println("Provide valid input");
            }
            
    }
    
    public static boolean primeNumberList(int a,int b) {
    	
    	if(a>b || a==b ||a<0 || b<0 || a==0 || b==0)
    	{ return false;}
        else{
                for(int i=a;i<=b;i++)
                {
                    if(isPrime(i))
                    {
                        System.out.print(i+" ");
                    }
                }
                return true;
            }
    }
    public static boolean isPrime(int n)
    {
        int c=0;
        int i=1;
        while(i<=n)
        {
            if(n%i==0)
            {
                c++;
            }
            i++;
        }
        
        if(c==2)
        {
            return true;
        }
        else
        return false;
    }
}
