/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swap;
import java.util.Scanner;


public class Swap {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,temp;
        System.out.println("Enter the two numbers");
        Scanner obj=new Scanner(System.in);
        a= obj.nextInt();
        b= obj.nextInt();
        System.out.println(" the two numbers before swapping a= "+a);
        System.out.println("b="+b);
        
        temp=a;
        a=b;
        b=temp;
        
        System.out.println("the two numbers after swapping  are a="+a);
        System.out.println("b="+b);
        
        
    }
    
}
