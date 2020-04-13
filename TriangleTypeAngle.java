import java.util.Scanner;
public class TriangleTypeAngle {
    public static void main(String args[]){
        int count=0;
        System.out.println("Enter three Sides Of Triangle: ");
       Scanner input = new Scanner(System.in);
       double a = input.nextDouble();
       double b = input.nextDouble();
       double c = input.nextDouble();
       input.close();
       
       double A = Math.acos(((b*b) + (c*c) - (a*a))/(2*b*c))*(180/Math.PI); 
       double B = Math.acos(((c*c) + (a*a) - (b*b))/(2*c*a))*(180/Math.PI);
       double C = Math.acos(((a*a) + (b*b) - (c*c))/(2*a*b))*(180/Math.PI);
       if(A==90 || B==90 || C==90){
           count=1;
       }
       if(A==B){
           if(A==C){
                System.out.println("Triangle is Equivalent Triangle.");
                     
            }
           else{
               if(count==1){
                System.out.println("Triangle is Isosceles Triangle And Right-Angled Triangle.");
               }
               else{
                System.out.println("Triangle is Isosceles Triangle.");
               }
            
           }
       }
       else if(B==C){
        if(count==1){
            System.out.println("Triangle is Isosceles Triangle And Right-Angled Triangle.");
           }
           else{
            System.out.println("Triangle is Isosceles Triangle.");
           }
       }
       else{
            if(count==1){
                System.out.println("Triangle is Scalene Triangle And Right-Angled Triangle.");
            }
            else{
                System.out.println("Triangle is Scalene Triangle.");
            }
        }

    }
}