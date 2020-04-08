//MergeSort Version: 1.1
//It Is Done Using Divide And Merge Method.

public class MergeSort {
   
    public static void printArray(int[] arr){
        int n = arr.length;
        for (int i=0; i<n; i++) 
            System.out.print(arr[i]+" "); 
         
        System.out.println(); 
    }
   
    public static void merge(int[] arr,int first,int mid,int last){

        int n1 = mid - first + 1; 
        int n2 = last - mid; 
        int Left[] = new int [n1]; 
        int Rigth[] = new int [n2]; 

        for (int i=0; i<n1; i++) 
            Left[i] = arr[first + i]; 
        for (int j=0; j<n2; ++j) 
            Rigth[j] = arr[mid + 1+ j]; 


        int i = 0 ,j = 0 ,k = first; 
        while (i < n1 && j < n2) 
        { 
            if (Left[i] <= Rigth[j]) 
            { 
                arr[k] = Left[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = Rigth[j]; 
                j++; 
            } 
            k++; 
        } 

        while (i < n1) 
        { 
            arr[k] = Left[i]; 
            i++; 
            k++; 
        } 

        while (j < n2) 
        { 
            arr[k] = Rigth[j]; 
            j++; 
            k++; 
        } 
      
       

    }
    public static void divide(int[] arr,int first,int last){
        
        if(first < last) {
            int mid = (first + last) / 2;
            divide(arr, first, mid);
           
            divide(arr, mid + 1, last);
            
            merge(arr, first, mid, last);
           
        }

    }
    public static void main(String args[]){
       int[] arr = {5,2,7,3,6,1,4};
       int n = arr.length;
      
       System.out.print("Before Sorting Array: ");
       printArray(arr);
      
       int first = 0,last = n-1;
       divide(arr,first,last);
       System.out.print("After Sorting Is Done.\nArray: ");
       printArray(arr);
      
    }
    

}