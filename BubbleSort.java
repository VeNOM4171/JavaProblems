public class BubbleSort { 
    static int loop = 0;
    public static void bubbleSort(final int[] arr) {
        int n = arr.length,temp;
        for(int i=0;i<n;i++){
            loop++;
            for(int j=1;j<n-i;j++){
                loop++;
                if(arr[j-1]>arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
    }
    public static void main(final String args[]) {
      int[] arr = { 5, 9, 3, 1, 2, 8, 4, 7, 6 };
       System.out.print("Before Sorting Array: ");
       for(int i=0; i<arr.length;i++){
           System.out.print( arr[i] + " ");
       }    
       System.out.println();  
       bubbleSort(arr);
       System.out.print("After Sorting Is Done. Array: ");
       for(int i=0; i<arr.length;i++){
           System.out.print( arr[i] + " ");
       }   
       System.out.println();
       System.out.print("Iteration: "+loop); 
    }
}