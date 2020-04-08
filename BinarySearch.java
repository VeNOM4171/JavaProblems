import java.util.Scanner;
import java.lang.Exception;
 public class BinarySearch { 
    static int loop = 1;
    public static int binarySearch(final int[] array, final int key) {
        int first = 0, last = (array.length)-1;
        int mid = (first + last) / 2;
        while(first<=last){
            loop++;
            if(array[mid] < key){
                first = mid+1; 
            }
            else if(array[mid] > key){
                last = mid-1;
            }
            else{
                return mid;
            }
            mid = (first + last) / 2;
        }
       
        return 0;
    }

    public static void main(final String arr[]){
        //Array should be Sorted To Perform Binary Search Operation.
        final int[] array = {10, 20, 30,40, 50,60, 70,80, 90};
        try {
            final Scanner input = new Scanner(System.in);
            final int key = input.nextInt();
            input.close();
            final int temp = binarySearch(array, key);
            if(temp==0)
                System.out.print(key+" Not Found in Array. No Of iteration: "+(loop+1));
            else
                System.out.println(key+" Found in Array at Index: "+temp+" & At Position: "+(temp+1)+", No Of iteration: "+(loop+1));


        } catch (final Exception e) {
            System.out.print("Exception : "+e.getMessage());
        }
    }
}