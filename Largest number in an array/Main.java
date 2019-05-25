import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     Scanner s=new Scanner(System.in);
      int n=s.nextInt();
        int ar[]=new int[n];
      for(int i=0;i<n;i++)
        ar[i]=s.nextInt();
      int largest=ar[0];
      for(int i=0;i<n;i++)
      {
        if(largest<ar[i])
        {
         largest=ar[i];
        }
      }
      System.out.println(largest);
    }
}