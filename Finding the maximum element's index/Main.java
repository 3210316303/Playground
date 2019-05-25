import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt(),i;
    int a[]=new int[n];
    for(i=0;i<=n-1;i++)
    {
     a[i]=s.nextInt();
    }
    int max=0,ind=0;
    for(i=0;i<=n-1;i++)
    {
     if(max<a[i])
     {
      max=a[i];
      ind=i;
     }      
     
    }
     System.out.println(ind);
  }
}