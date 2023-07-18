import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class DaigonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("row size ");
        int n = sc.nextInt();
        System.out.println("coloum size ");
        int m = sc.nextInt();
        int A[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("enter " + i + "," + j);
                A[i][j] = sc.nextInt();
            }
        }
        int sum=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                   if(i==j){
                       sum+=A[i][j];
                   }
            }
        }
        System.out.println(sum);
    }
}