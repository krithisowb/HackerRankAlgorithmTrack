import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int n = Integer.parseInt(in.readLine());
        int[][] a = new int[n][n];
            String s[] = in.readLine().split(" ");
                a[i][j] = Integer.parseInt(s[j]);
        }
        sumleft+=a[i][i];
        }           
        int ans=Math.abs(sumleft-sumright);
        out.println(Math.abs(ans));
        out.close();
    }
}
