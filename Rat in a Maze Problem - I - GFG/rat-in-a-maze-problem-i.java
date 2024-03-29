//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String>list=new ArrayList<String>();
        path(0,0,"",list,m,n);
        return list;
    }
    public static void path(int i,int j,String s,ArrayList<String> list,int[][] arr,int n){
        if(i<0 || j<0 ||i>=n  || j>=n ||arr[i][j]==0) return;
        if(i==n-1 && j==n-1){
            list.add(s);
            return;
        }
            arr[i][j]=0;
            path(i-1,j,s+"U",list,arr,n);
            path(i,j-1,s+"L",list,arr,n);
            path(i+1,j,s+"D",list,arr,n);
            path(i,j+1,s+"R",list,arr,n);
            arr[i][j]=1;
            return ;
    }
}