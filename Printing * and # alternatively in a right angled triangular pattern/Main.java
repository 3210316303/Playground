import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner s = new Scanner(System.in);
  	 int n,i,j;
      n=s.nextInt();
      int a=1;
      for(i=1;i<=n;i++)
      {
       // System.out.print("*");
       for(j=1;j<=i;j++)
       {
         if(a%2==0)
        {
        System.out.print("#");
        }
         else
           System.out.print("*");
       a++;
       }
      
        System.out.println();
      }
    }
}