import java.util.*;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
	  int l = inr.nextInt();
        
      int i,j,space,c=l/2;
      if(l%2==0)
        System.out.print("Invalid line number");
      else{
        space=c;
        for(i=0;i<c+1;i++)
        {
          for(j=0;j<space;j++){
            System.out.print(" ");
          }
          for(j=0;j<=i;j++){
            System.out.print("* ");
          }
          System.out.println();
          space--;
        }
        space=0;
        for(i=c;i>0;i--){
          for(j=0;j<=space;j++){
            System.out.print(" ");
            
          }
          for(j=i;j>0;j--){
            System.out.print("*");
            if(j!=1){
              System.out.print(" ");
            }
          }
          if(i!=1){
            System.out.println();
          }
          space++;
        }
      }
    }
}