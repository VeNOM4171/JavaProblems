import java.util.Scanner;
public class MirrorOfArray{

    public static void mirror(char arr[][]){
        char[][] temp = new char[5][5];
        
        for(int i=0;i<5;i++){
            int k=0;
            for(int j=4;j>=0;j--){ 
                temp[i][j] = arr[i][k];
                k++;

            }
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
          
            for (int j = 0; j <5; j++) {
                System.out.print(temp[i][j]);
            }
            System.out.println();
        }
    }
	public static void main(String args[]){
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

        mirror(arr);
    }
}