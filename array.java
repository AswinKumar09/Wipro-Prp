import java.util.*;
class Main
{
public static void main(String args[])
{
  int[] n=new int[100];
  int c,e,f,sum=0;
  Scanner sc=new Scanner(System.in);
  c=sc.nextInt();
  for(int i=0;i<c;i++)
  {
    n[i]=sc.nextInt();
  }
  e=sc.nextInt();
  f=sc.nextInt();
  for(int i=0;i<c;i++)
  {
    if(n[i]==e)
    {
      for(int j=i+1;j<c;j++)
      {
        if(n[j]!=f)
        sum=sum+n[j];
      }

    }
  }
  System.out.println(sum);

}
}
