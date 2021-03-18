
import java.util.ArrayList;
import java.util.Objects;
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
public class KSolution {

    public int m;
    public int n;
    public Scanner getUserInput = new Scanner(System.in);
    public ArrayList<String> mapNameM = new ArrayList<>(); // first
    public ArrayList<String> mapNameN = new ArrayList<>(); // second
    public ArrayList<Integer> mapStepM = new ArrayList<>(); // first
    public ArrayList<Integer> mapStepN = new ArrayList<>(); // second
    public int countIdentical = 0;

    public void getInput() {
        // Get m, n
        String _mn = this.getUserInput.nextLine();
        String[] arrMN = _mn.split(" ");
        try {
            this.m = Integer.parseInt(arrMN[0]);
            this.n = Integer.parseInt(arrMN[1]);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }

        if (this.m >= 1 && this.n <= 400000 && this.m > this.n) {
            // Get m values
            for (int i = 0; i < m; i++) {
                String _ni = this.getUserInput.nextLine();
                if (_ni.length() != 1) {
                    String[] arrNi = _ni.split(" ");
                    String name = arrNi[0];
                    if ((name.equals("n") || name.equals("s") || name.equals("e") || name.equals("w"))) {
                        int step = Integer.parseInt(arrNi[1]);
                        this.mapNameM.add(name);
                        this.mapStepM.add(step);
                    } else {
                    }
                } else {
                    if (_ni.charAt(0) == '?') {
                        this.mapNameM.add("?");
                        this.mapStepM.add(0);
                    }
                }
            }

            // Get n values
            for (int i = 0; i < n; i++) {
                String _ni = this.getUserInput.nextLine();
                if (_ni.length() != 1) {
                    String[] arrNi = _ni.split(" ");
                    String name = arrNi[0];

                    if ((name.equals("n") || name.equals("s") || name.equals("e") || name.equals("w"))) {
                        int step = Integer.parseInt(arrNi[1]);
                        this.mapNameN.add(name);
                        this.mapStepN.add(step);
                    } else {
                    }
                } else {
                    if (_ni.charAt(0) == '?') {
                        this.mapNameN.add("?");
                        this.mapStepN.add(0);
                    }
                }
            }

        }
    }

    public void countIdentical() {
        int temp = this.n - 1;
        for (int i = 0; i < this.n; i++) {

        }
        int k = 0;
        for (int i = 0; i <= this.m - this.n; i++) {
            int tempCount = 0;
            for (int j = 0; j < this.n; j++) {
                k = i + j;
                if (this.mapNameN.get(k).equals("?")) {
                    tempCount++;
                    continue;
                }
                if (this.mapNameM.get(j).equals("?")) {
                    tempCount++;
                    continue;
                }
                if (this.mapNameN.get(k).equals(this.mapNameN.get(j))) {
                    if (Objects.equals(this.mapStepN.get(k), this.mapStepM.get(j))) {
                        tempCount++;
                    }
                }
            }
            if (tempCount == this.n) {
                this.countIdentical++;
            }
        }

    }

    public void showOutput() {
        System.out.println(this.countIdentical);
    }

    public static void main(String[] args) {
        KSolution run = new KSolution();
        run.getInput();
        run.countIdentical();
        run.showOutput();
    }
}
