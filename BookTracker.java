import java.util.*;  

class BookTracker {  
    public static void main(String[] args) {  
        Scanner in = new Scanner(System.in);  
        int m, n;  

        // Input matrix dimensions  
        System.out.println("Enter number of rows and columns of the matrix");  
        m = in.nextInt();  
        n = in.nextInt();  

        // Initialize matrices  
        int[][] june = new int[m][n];  
        int[][] july = new int[m][n];  
        int[][] august = new int[m][n];  
        int[][] total = new int[m][n];  

        // Read June data  
        System.out.println("Enter the books read in the month of june");  
        for (int i = 0; i < m; i++) {  
            for (int j = 0; j < n; j++) {  
                june[i][j] = in.nextInt();  
            }  
        }  

        // Read July data  
        System.out.println("Enter the books read in the month of july");  
        for (int i = 0; i < m; i++) {  
            for (int j = 0; j < n; j++) {  
                july[i][j] = in.nextInt();  
            }  
        }  

        // Read August data  
        System.out.println("Enter the books read in the month of august");  
        for (int i = 0; i < m; i++) {  
            for (int j = 0; j < n; j++) {  
                august[i][j] = in.nextInt();  
            }  
        }  

        // Calculate total reads  
        for (int i = 0; i < m; i++) {  
            for (int j = 0; j < n; j++) {  
                total[i][j] = june[i][j] + july[i][j] + august[i][j];  
            }  
        }  

        // Display total matrix  
        System.out.println("\nTotal Reads Matrix:");  
        for (int i = 0; i < m; i++) {  
            for (int j = 0; j < n; j++) {  
                System.out.print(total[i][j] + "\t");  
            }  
            System.out.println();  
        }  

        // Student details  
        System.out.println("\nStudent Name: Apu Ghanti");  
        System.out.println("Roll No: 20241CIT0114");  
        in.close();  
    }  
}  
