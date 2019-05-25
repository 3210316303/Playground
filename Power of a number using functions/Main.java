import java.util.*;
class Main
{
  public static int result(int b,int e)
  {
   int res=1,i;
    for(i=1;i<=e;i++)
        {
         res=res*b;
       }
 return res;
  }
 public static void main(String args[])
 {
   Scanner s=new Scanner(System.in);
   int m,n,a;
  m=s.nextInt();
  n=s.nextInt();
   a=result(m,n);
   System.out.println(a);
 }
}