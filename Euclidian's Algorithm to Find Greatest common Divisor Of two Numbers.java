import java.util.Scanner;
import java.lang.Exception;
 public class GCD { 
 
    public static void main(String[] args) { 
 
        int num1, num2, result=1,temp;   
        Scanner input = new Scanner(System.in);  

        System.out.print("Enter first number:");     
        try{
            num1 = input.nextInt();          
            System.out.print("Enter second number:");    
            num2 = input.nextInt();           
            input.close();         
        
           //closing the scanner to avoid memory leaks     
        
           if(num1 < num2){
             temp = num1;
             num1 = num2;
             num2 = temp;
            
           }
           while ((result) != 0) {
                result = num1 % num2;
                num1 = num2;
                num2 = result;

           }            
           System.out.printf("GCD of given numbers is: %d", num1);

        } catch (Exception e) {
            System.out.print("Exception : "+e.getMessage()); 
          }
    
    } 
 
} 