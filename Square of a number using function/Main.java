import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {  
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      System.out.println(sqaure_of_a_number(n));
     }
      public static int sqaure_of_a_number(int a)
      {
        int result=a*a;
        return result;
                         
	} 
}