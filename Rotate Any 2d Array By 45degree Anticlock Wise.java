import java.util.Scanner;

public class TwoDArray { 


    public static void rotateArray(char arr[][]){
        char temp1[][] = new char[5][5];
       
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){ 
  
               if(i==0 && j<3){
                   temp1[i][j+2] = arr[i][j];
               }
               else if(i==0 && j==3){
                   temp1[i+1][j+1] = arr[i][j];
               }
               else if(i<3 && j==4){
                 temp1[i+2][j] = arr[i][j];
               }
               else if(i==3 && j==4){
                 temp1[i+1][j-1] = arr[i][j];
               }
               else if(i==4 && j>1){
                 temp1[i][j-2] = arr[i][j];
               }else if(i==4 && j==1){
                 temp1[i-1][j-1] = arr[i][j];
               }else if(i>1 && j==0){
                  temp1[i-2][j] = arr[i][j];
               }else if(i==1 && j==0){
                 temp1[i-1][j+1] = arr[i][j];
               }
               else if(i==1 && j>0 && j<4){
                   if(j==3){
                       temp1[i+1][j] = arr[i][j];

                   }
                   else{
                    temp1[i][j+1] = arr[i][j];
                   }
               }
               else if(i==2 && j>0 && j<4){
                    if(j==2){
                        temp1[i][j] = arr[i][j];

                    }
                    else if(j==3){
                    temp1[i+1][j] = arr[i][j];
                    }
                    else{
                        temp1[i-1][j] = arr[i][j];
                    }
                }
                else{
                    if(j==1){
                            temp1[i-1][j] = arr[i][j];
                    }
                    else{
                        temp1[i][j-1] = arr[i][j];
                    }
                }
               
            }
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
          
            for (int j = 4; j >=0; j--) {
                System.out.print(temp1[i][j]);
            }
            System.out.println();
        }

    } 
    public static void main(final String args[]) {
        Scanner input = new Scanner(System.in);
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
        
        rotateArray(arr);
      
       

    }
}