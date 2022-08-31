
import java.util.Scanner;

public class main {

    // Function for generating Lucas number
    public static int generationLucas(int n) {

        // declaring base values
        // for positions 0 and 1
        int first = 2, second = 1, sum;

        if (n == 0)
            return first;

        // generating next number of Lucas sequence
        for (int i = 2; i <= n; i++) {

            sum = first + second;
            first = second;
            second = sum;
        }

        return second;
    }

  private static void fillPrintArr(program[] arr, int amount)
    {
        for (int i = 0; i < amount; i++) {

            arr[i] = new program();
            arr[i].setNumber(generationLucas(i));
            System.out.print(arr[i].getNumber() + " ");

        }

    }

// Checks if there are numbers that could be represented by formula
// w^3 - 1

    private static void findByFormula(program[] arr) {

        System.out.print("\n\n Numbers that could be represented as w^3 - 1");

        for (int k = 0; k < arr.length; k++) {

            int formula = arr[k].getNumber() - 1;
            if (formula == (int) Math.cbrt(formula)) {
                System.out.print("\n" + arr[k].getNumber());
            }
        }
    }


    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print(" Enter the number of elements in the Lucas sequence: ");
        int amount = in.nextInt();
        System.out.print(" Lucas sequence: ");

        program[] arr = new program[amount];
       fillPrintArr(arr,amount);
        findByFormula(arr);
    }

}
