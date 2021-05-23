import java.util.Scanner;
public class Average
{
 public static void main(String[] args) 
  {
   int a,b,c,avg;
   System.out.println("enter three numbers ");
   Scanner s = new Scanner(System.in);
   a = s.nextInt();
   b = s.nextInt();
   c = s.nextInt();
   avg = (a+b+c)/3;
   System.out.println("average of three numbers =" +avg);
  }
}