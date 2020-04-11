import java.util.Scanner;

public class AutomorphicNumber { 


    public static boolean isAutomorphicNumber(int n){
        int sq = n*n;
        while(n>0){
            if(n%10 != sq%10){
                return false;
            }
            n/=10;
            sq/=10;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in); 
        int num = input.nextInt();
        if(isAutomorphicNumber(num)){
            System.out.print(num+" is Automorphic Number.");
        }
        else{
            System.out.print(num+" is not Automorphic Number.");
        }
    }
}