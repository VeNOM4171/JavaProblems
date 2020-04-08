import java.util.Scanner;
public class FlipFlop2DArray{

    public static void flipFlop(int arr[][]){
       for(int i=0;i<5;i++){
           for(int j=0;j<5;j++){
               if(arr[i][j]=='0'){
                 arr[i][j] = '1';
               }
               else{
                arr[i][j] = '0';
               }
           }
       }

       System.out.println();
        for (int i = 0; i < 5; i++) {
          
            for (int j = 0; j <5; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        try {
           String temp[] = new String[5];
            for(int i=0;i<5;i++){
               temp[i]=input.nextLine();
            }
            input.close();
            char[][] arr = new char[5][5];
            for (int i =0;i<5;i++) {
              char temp2[] = temp[i].toCharArray();
              for (int j = 0; j < 5; j++) {
                 arr[i][j]=temp2[j];
              }
            }
           flipFlop(arr);
            
        } catch (Exception e) {
            System.out.print("Exception : "+e.getMessage());
        }
        
        
    }
}