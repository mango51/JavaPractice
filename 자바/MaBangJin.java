import java.util.Scanner;
public class MaBangJin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int arr[][] = new int[n][n];

        int x = 0;
        int y = n / 2;

        arr[x][y] = 1;

        for ( int i = 0; i < n; i++ ) {
            for ( int j = 0; j < i; j++ ) {
                arr[i][j] = 0;
            }
        }

        for ( int i = 2; i <= n * n; i++ ){

            x = x - 1;
            y = y + 1;

            if ( ( y >= n ) && ( x < 0 ) ){
                x = x + 2;
                y = y - 1;
            }

            if ( x < 0 ){
                x = n - 1;
            }

            if ( y >= n ){
                y = 0;
            }

            if ( arr[x][y] != 0 ){
                x = x + 2;
                y = y - 1;
            }

            arr[x][y] = i;
        }

        for ( int i = 0; i < n; i++ ) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "   ");
            }

            System.out.println("");
        }
    }
}
