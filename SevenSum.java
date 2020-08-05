/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seven.sum;


public class SevenSum {

    
    public static void main(String[] args) {
        
        int  sum=0;
        int j=0;
        
        
        for(int i=100;i<200;i++)
        {
              if(i%7==0)
              {
                sum=sum+i;
              }
          
        
    }
        System.out.println("The sum is:"+sum);
    }
    
}
