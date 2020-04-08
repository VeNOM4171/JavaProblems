public class InsertionSort { 
    static int loop = 0;
    public static void insertionSort(final int[] arr) {
        
        for(int i=1;i<arr.length;i++){
            loop++;
            int temp = arr[i];
            int j=i-1;
            while((j>-1) && (arr[j]>temp)){
                loop++;
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
    public static void main(final String args[]) {
      int[] arr = { 5, 9, 3, 1, 2, 8, 4, 7, 6 };
       System.out.print("Before Sorting Array: ");
       for(int i=0; i<arr.length;i++){
           System.out.print( arr[i] + " ");
       }    
       System.out.println();  
       insertionSort(arr);
       System.out.print("After Sorting Is Done. Array: ");
       for(int i=0; i<arr.length;i++){
           System.out.print( arr[i] + " ");
       }   
       System.out.println();
       System.out.print("Iteration: "+loop); 
    }
}