import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int ar[]=new int[n];
      int i,c=-1,d=-1;
      for(i=0;i<n;i++)
        ar[i]=s.nextInt();
      int key1=s.nextInt();  
      int key2=s.nextInt();
      for(i=0;i<n;i++)
      {
        if(key1==ar[i])
        {
         c=i;
        }
        if(key2==ar[i])
        {
         d=i;
        } 
      }
      System.out.println(c);
      System.out.println(d);
      }
    }