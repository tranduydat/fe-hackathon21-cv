
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dattran
 */
public class CSolution {

    public Scanner getUserInput = new Scanner(System.in);
    public ArrayList<Integer> matrix = new ArrayList<>();
    public HashSet<Integer> mapNumberFreq = new HashSet<>();
    public HashMap<Integer, Integer> mapNumberFreqVal = new HashMap<>();

    public void getInput() {
        String _nm = this.getUserInput.nextLine();
        String[] arrNM = _nm.split(" ");
        int n, m; // n = row, m = col

        try {
            n = Integer.parseInt(arrNM[0]);
            m = Integer.parseInt(arrNM[1]);
            if (n > 0 && m > 0 && n <= 1024 && m <= 1024) {
                for (int i = 0; i < n; i++) {
                    String an = this.getUserInput.nextLine();
                    String[] aij = an.split(" "); // get values in each line
                    for (String aij1 : aij) {
                        int tempz = Integer.parseInt(aij1);
                        if (tempz >= 0 && tempz <= 255) {
                            matrix.add(tempz);
                        } else {
                            System.exit(0);
                        }
                    }
                }
            }
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }

    public void calculateGreyScale() {
        // Build dict of numbers
        for (Integer aij : this.matrix) {
            this.mapNumberFreq.add(aij);
        }

        // Count the frequency
        for (Integer aij : this.mapNumberFreq) {
            int aijFreq = 0;
            for (Integer ahihi : this.matrix) {
                if (Objects.equals(aij, ahihi)) {
                    aijFreq++;
                }
            }
            this.mapNumberFreqVal.put(aij, aijFreq);
        }
    }

    public void printResult() {
        for (int i = 0; i < 256; i++) {
            if (this.mapNumberFreqVal.containsKey(i)) {
                System.out.print(this.mapNumberFreqVal.get(i));
            } else {
                System.out.print("0");
            }
            System.out.print((i == 255 ? "" : " "));
        }
    }

    public static void main(String[] args) {
        CSolution run = new CSolution();
        run.getInput();
        run.calculateGreyScale();
        run.printResult();
    }
}
