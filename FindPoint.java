import java.util.Scanner;
public class FindPoint {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x & y Coordinate of Point A of Triangle");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.println("Enter x & y Coordinate of Point B of Triangle");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.println("Enter x & y Coordinate of Point C of Triangle");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        System.out.println("Enter x & y Coordinate of Point to Find Whether it is Inside Or Outside of Triangle");
        double x = input.nextDouble();
        double y = input.nextDouble();
        
        double A =  (x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1-y2))/2;
        double A1 =  (x*(y1 - y2) + x1*(y2 - y) + x2*(y-y1))/2;
        double A2 =  (x*(y1 - y3) + x1*(y3 - y) + x3*(y-y1))/2;
        double A3 =  (x*(y2 - y3) + x2*(y3 - y) + x3*(y-y2))/2;
        if(A1+A2+A3 == A){
            System.out.println("The Point with Coordinate ("+x+","+y+") is INSIDE The Triangle \nwith Points A("+x1+","+y1+") B("+x2+","+y2+") C("+x3+","+y3+")");
        }
        else{
            System.out.println("The Point with Coordinate ("+x+","+y+") is OUTSIDE The Triangle \nwith Points A("+x1+","+y1+") B("+x2+","+y2+") C("+x3+","+y3+")");
    
        }

    }
    

}