
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dattran
 */
public class HSolution {

    public static void main(String[] args) {
        Scanner getUserInput = new Scanner(System.in);
        int[] arrayOfNumbers;
        int sum = 0;
        ArrayList<Integer> tempAList = new ArrayList<>();

        String strRanges = getUserInput.nextLine();
        String[] arrRanges = strRanges.split(" ");
        ArrayList<Integer> ranges = new ArrayList<>();

        // Get ranges
        try {
            for (String arrRange : arrRanges) {
                int x = Integer.parseInt(arrRange);
                if (x >= -1000000000 && x <= 1000000000) {
                    ranges.add(x);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println(e);
        }

        int l = ranges.get(0);
        int r = ranges.get(1);

        if (l > r) {
            int tz = r;
            r = l;
            l = tz;
        }

        for (int i = l; i <= r; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
