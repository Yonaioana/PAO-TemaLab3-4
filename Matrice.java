import java.util.Scanner;
import java.util.Random;
public class Matrice{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int[][] mat = new int[m][n];
        Random rand = new Random();
        int sum = 0;
        int i, j;
        for (i=0; i<m; i++)
            for(j=0; j<n; j++)
            {mat[i][j] = rand.nextInt(1000);
                sum += mat[i][j];}
        System.out.println(sum);

    }
}
