import java.util.Scanner;

public class arraytype {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][][] a = new int[2][3][4];

        for(int i = 0; i < a.length; i++) {              // blocks
            for(int j = 0; j < a[i].length; j++) {       // rows
                for(int k = 0; k < a[i][j].length; k++) { // columns
                    a[i][j][k] = sc.nextInt();
                }
            }
        }

        // Printing
        for(int i = 0; i < a.length; i++) {
            System.out.println("Block " + i);
            for(int j = 0; j < a[i].length; j++) {
                for(int k = 0; k < a[i][j].length; k++) {
                    System.out.print(a[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
