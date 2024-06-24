
import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        s.close();

        System.out.println("The GCD of these two numbers is " + gcd(n1, n2));
    }

    private static int gcd(int n1, int n2) {
      while(n1 > 0 && n2 > 0){
        if(n1 > n2){
            n1 = n1 - n2;
        }
        else{
            n2 = n2-n1;
        }
      }

      if(n1 == 0)
      return n2;

      else return n1;
    }
}
