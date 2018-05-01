import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args)throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);      
        int n = Integer.parseInt(in.readLine());
        String s[]=in.readLine().split(" ");
             bigsum+=Long.parseLong(s[i]);              
        out.println(bigsum);
        out.close();
    }
}
