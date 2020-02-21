package matrixinversion;
import java.util.*;
public class MatrixInversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Matrix m and n");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n] ;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
            for(int j=0;j<m;j++){
            int temp = arr[0][j];
                arr[0][j] = arr[(n-1)][j];
                arr[(n-1)][j] = temp;
        }
        System.out.println("Output Matrix is");
        for(int j=0;j<n;j++){
            for(int i=0;i<m;i++){
         System.out.printf("%10s",arr[j][i]); 
         System.out.println();
            }
            }
        }       
}
        
   

