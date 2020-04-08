//HeapSort Version: 1.1
//Needed Knowledge : Array Representation of Binary Tree,
//Complete Binary Tree, Heap, Insertion & Deletion in/from Heap, Priority Queue,
//Heapify, HeapSort.

public class HeapSort { 
   
    public static void printArray(int[] arr){
        int n = arr.length; 
        for (int i=0; i<n; i++) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 

    }
    public static void swap(int[] arr,int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static void maxHeapify(int[] arr,int n,int i){
        int largest = i;
        int leftChild = (2 * i) + 1;
        int rigthChild = (2*i) + 2;
        if((leftChild<n) && (arr[leftChild]>arr[largest])){
            largest = leftChild;    
        } 
        if((rigthChild<n) && (arr[rigthChild]>arr[largest])){
            largest = rigthChild;    
        }
        if(largest!=i){
            swap(arr,largest,i);
            maxHeapify(arr, n, largest);
        }

    }
    public static void heapSort(int[] arr) {
        int n = arr.length;
        //Starting from n/2 because Leaf nodes are already Considered as Max_heap as they have no child node.
        for(int i= (n / 2 - 1); i >= 0; i--) {
           
           maxHeapify(arr,n,i);
        }
        //it will be in complete binary tree form.
        System.out.print("Max Heap Array is: ");
        printArray(arr);
        System.out.println();
        for(int i=n-1;i>0;i--){
            swap(arr,0,i);
            maxHeapify(arr, i, 0);
        }
        
    }
    public static void main(final String args[]) {
      int[] arr = {5,2,7,3,6,1,4,10,9,30,40,22,19,15};
       System.out.print("Before Sorting Array: ");
       printArray(arr);
       
       heapSort(arr);
       System.out.print("After Sorting Is Done.\nArray: ");
       printArray(arr);
      
    }
}