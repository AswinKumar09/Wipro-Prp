import java.util.*;
class Main
{
public static void main(String args[])
{
 int[][] a=new int[1000][1000];
 int[][] b=new int[1000][1000];
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int k=0;
 for(int i=0;i<n;i++)
 {
   for(int j=0;j<n;j++)
   {
     a[i][j]=sc.nextInt();
   }
 }
 
 for(int i=n-1;i>=0;i--)
 {
  int l=0;
   for(int j=n-1;j>=0;j--)
   {
     b[k][l]=a[i][j];
     l++;
   }
   k++;
 }
 for(int i=0;i<n;i++)
 {
   for(int j=0;j<n;j++)
   {
     System.out.print(b[i][j] + " ");
   }
   System.out.println();
 }
}
}
