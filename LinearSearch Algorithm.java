import java.util.Scanner;
import java.lang.Exception;
 public class LinearSearch { 
    static int loop = 0;
    public static int Search(final int[] arr, final int key) {
       
        for (int i = 0; i < arr.length; i++) {
            loop++;

            if (arr[i] == key) {
                return i;
            }
        }
        return 0;
    }

    public static void main(final String[] args) {
        final int[] arr = { 10, 20, 30,40, 50,60, 70,80, 90 };
       try {
            final Scanner input = new Scanner(System.in);
            final int key = input.nextInt();
            input.close();   
            
           final int temp = Search(arr, key);
           if(temp == 0){
              System.out.print(key+ " Not Found in Array. And No Of Iteration Is : "+(loop+1));
            }
           else{
              System.out.print(key+" is found at index: "+temp +" Position: "+(temp+1) +", And No Of Iteration Is: "+loop);

            }    
           
        } catch (Exception e) {
            System.out.print("Exception : "+e.getMessage()); 
        }
           

    }
}