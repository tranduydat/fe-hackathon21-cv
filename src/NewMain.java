
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class NewMain {
// 
// Function to reverse rows of the matrix
    public static void reverse_rows(char mat[][]) {
        int k;
        for (int i = 0; i < mat.length; i++) {
            k = mat.length - 1;
            for (int j = 0; j < k; j++) {
                char temp = mat[i][j];
                mat[i][j] = mat[i][k];
                mat[i][k] = temp;
                k--;
            }
        }
    }

// Function to print the matrix
    public static void print_matrix(char mat[][]) {
        int i, j;
        for (i = 0; i < mat.length; i++) {
            //System.out.println(i);
            for (j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + "");
            }
            System.out.print("\n");
        }
    }

// Function to transpose the matrix
    public static void transpose_matrix(char mat[][]) {
        int i, j;
        for (i = 0; i < 8; i++) {
            for (j = i; j < 8; j++) {
                char temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }

// NewMain function
    public static void main(String[] args) throws IOException {
        char[][] arr = new char[8][8];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 8; i++) {
            String str = br.readLine();
            int length = str.length();
            for (int j = 0; j < length; j++) {
                if(str.charAt(j)!='*') arr[i][j]=' ';
                else arr[i][j] = str.charAt(j);
            }
        }
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                System.out.print(arr[i][j] + "");
//            }
//            System.out.println("");
//        }
        transpose_matrix(arr);
        reverse_rows(arr);
        print_matrix(arr);
    }
}
