package labs.lab8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RemoveEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> number = new ArrayList<Integer>();

        System.out.println("Enter 10 Numbers: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Number: " +(i + 1));
            int input = sc.nextInt();

            number.add(input);
        }

        System.out.println("Unsorted List: " + number);

        for (int i = 0; i < number.size(); i++) {
            int even = number.get(i) % 2;
            if(even == 0){
                System.out.println("This is an even number: " + number.get(i));
                number.remove(i);
                i--;
            }
        }
        Collections.sort(number);

        System.out.println("After Removing Even Numbers List: " + number);

        sc.close();

    }
}
