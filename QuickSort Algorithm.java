//QuickSort Version 1.0
//It Is Done Using Divide And Conquer using pivot as key.

public class QuickSort {
    public static void printArray(int[] arr){
       
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" "); 
        } 
        System.out.println(); 
    }

    public static void swap(int[] arr,int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    
    public static void quickSort(int[] arr,int first,int last){
        if(first<last){
            int location = divide(arr,first,last);
            quickSort(arr,first,location-1);
            quickSort(arr,location+1,last);
        }
    }
    public static int divide(int[] arr,int first,int last){
        
        int pivot = arr[first];
        int i = first,j=last;
        while(i<j){
            while(arr[i]<=pivot){
                i++;  
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<j){
               swap(arr,i,j);

            }
             
        }
        swap(arr,first,j);
        return j;

    }

    public static void main(final String args[]) {
        int[] arr = {5,2,7,3,6,1,4,10,9,30,40,22,19,15};
         System.out.print("Before Sorting Array: ");
         printArray(arr);
         int first = 0, last = arr.length-1;

         quickSort(arr,first,last);
         System.out.print("After Sorting Is Done.\nArray: ");
         printArray(arr);
        
    }

}