import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args)
    {
            int temp;
            boolean isPrime = true;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter any number:");

            int num = scan.nextInt();

            for (int i = 2; i < num; i++) {
                temp = num % i;
                if (temp == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.println(num + " is a Prime Number");
            else
                System.out.println(num + " is not a Prime Number");
            scan.close();
        }
    }

