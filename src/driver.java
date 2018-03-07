import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class driver {

    public static void main(String[] args) {

//        Given an array of numbers, return whether any two sums to K.
//        For example, given [10, 15, 3, 7] and K of 17, return true since 10 + 7 is 17.

        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();
        System.out.println("Creating random array:");

        for (int i = 0; i < 10; i++) {
            int randInt;
            randInt = (rand.nextInt((10 - 1) + 1) + 1);
            list.add(i, randInt);
            System.out.print(randInt + ", ");
        }

        int k;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\n\nK? ");
        k = keyboard.nextInt();

        boolean result = addToK(list, k);

    }


    private static boolean addToK(ArrayList<Integer> list, int k) {

        int solutionsFound = 0;
        //starting out, make the leftIndex 0
        for (int leftIndex = 0; leftIndex < list.size(); leftIndex++) {

            //make the rightIndex 0
            for (int rightIndex = leftIndex + 1; rightIndex < list.size(); rightIndex++) {

                if ((list.get(leftIndex) + list.get(rightIndex)) == k) {

                    System.out.println("Solution found: " + list.get(leftIndex) + "[" + leftIndex + "]" +
                            " + " + list.get(rightIndex) + "[" + rightIndex + "]");
                    solutionsFound++;
                }

            }


        }

        System.out.println("\nSolutions found: " + solutionsFound);
        return solutionsFound != 0;

    }


}
