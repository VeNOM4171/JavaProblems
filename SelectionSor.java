public class SelectionSort { 
    static int loop = 1;
    public static void selectionSort(int[] arr){
        int temp;
        for(int i=0;i<arr.length;i++){
            loop++;
            for(int j=i+1;j<arr.length;j++){
                loop++;
                if(arr[i]>arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;

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
         selectionSort(arr);
         System.out.print("After Sorting Is Done. Array: ");
         for(int i=0; i<arr.length;i++){
             System.out.print( arr[i] + " ");
         }   
         System.out.println();
         System.out.print("Iteration: "+loop); 
      }
  }