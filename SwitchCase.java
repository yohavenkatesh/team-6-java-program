/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch.pkgcase;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int m1,m2,m3,m4,m5;
        int avg,c;
        System.out.println("Enter mark1:");
        Scanner obj=new Scanner(System.in);
        m1=obj.nextInt();
        System.out.println("Enter mark2:");
        m2=obj.nextInt();
        System.out.println("Enter mark3:");
        m3=obj.nextInt();
        System.out.println("Enter mark4:");
        m4=obj.nextInt();
        System.out.println("Enter mark5:");
        m5=obj.nextInt();
        avg=(m1+m2+m3+m4+m5)/5;
        System.out.println("Average mark obtained by a student"+avg);
        if(avg>=90)
        {
            c=10;
        }
        else if(avg<90 && avg>=80) {
             c=9;
        }
        else if(avg<80 && avg>=70)
        {
             c=8;
        }
        else if(avg<70 && avg>60)
        {
            c=7;
        }
        else if(avg<60 && avg>=50)
        {
            c=6;
        }
        else if(avg<50 && avg>=40)
        {
             c=5;
        }
        else if(avg<40 && avg>=30)
        {
            c=4;
        }
        else if(avg<30 && avg>=20)
        {
            c=3;
        }
        else if(avg<20 && avg>=10)
        {
             c=2;
        }
         else if(avg<10 && avg>=0)
        {
             c=1;
        }
        else
         {
             c=0;
         }
        System.out.println("Student's Remarks is:");
        switch(c)
        {
            case 10:
                System.out.println("Excellent !");
                break;
            case 9:
                System.out.println("Very good  !");
                break;
             case 8:
                System.out.println("Very good ");
                break;
              case 7:
                System.out.println("good !");
                break;
              case 6:
                System.out.println("good  !");
                break;
              case 5:
                System.out.println("Poor !");
                break;
              case 4:
                System.out.println("Poor!");
                break;
              case 3:
                System.out.println("Poor!");
                break;
               case 2:
                System.out.println("Very poor !");
                break;
               case 1:
                System.out.println("Very poor  !");
                break;
               case 0:
                 System.out.println("Very poor  !");
                 break;
                default:
                 System.out.println("Invalid Input  !");    
              
              
              
            
        }
     
        
    }
        
        
        
        
        
        
        
    
}
