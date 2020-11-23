import java.util.Scanner;
public class Exp_11_LargestNo {
    public static void main(String[] args) {
        int a ,b ,c ;
        Scanner num = new Scanner(System.in);
        System.out.println(" Enter three integer numbers "); 
        a = num.nextInt();
        b = num.nextInt();
        c = num.nextInt();
        if(a > b)
          {
            if(a>c)
            {
            System.out.println("a is greatest "+a);
            }
            else
            {
            System.out.println("c is greatest "+c);
            }
          }
        else if(b>c)
        {
            System.out.println("b is greatest "+b);
        }
        else
        {
            System.out.println("c is greatest "+c);
        }
    }
}