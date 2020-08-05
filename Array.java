/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;


public class Array {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] a   ={1,2,3,4,5};
        int min,max;
        int i=0,j=0;
        min=a[0];max=a[0];
        while(i<5)
        {
            
            if(min<a[i])
            {
               i++;
            }
           else
            {
                 min=a[i];
                 i++;
            }
          
        
    }
       System.out.println("the minimum number is "+min);
        
        while(j<5)
        {
            
            if(max>a[j])
            {
            
                j++;
            }
            else
            {
                       max=a[j];
                       j++;
            }
                      
          
        
    }
    System.out.println("the maximum number is "+max);
        
       
    
}
}
