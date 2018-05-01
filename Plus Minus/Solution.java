import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) throws IOException {
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
            int n = Integer.parseInt(in.readLine());
            String s[]=in.readLine().split(" ");
            int a[]=new int[n];
                a[i]=Integer.parseInt(s[i]);
                    p++;
                    ne++;
                    z++;                
            }
        out.close();
    }
}
