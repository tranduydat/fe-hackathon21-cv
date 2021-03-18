
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
public class GSolution {

    ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
    ArrayList<ArrayList<Integer>> filter = new ArrayList<>();
    Scanner getUserInput = new Scanner(System.in);
    int m = 0; // row
    int n = 0; // col
    int p = 0;
    int q = 0;

    public void getInput() {
        String mnAndpq = this.getUserInput.nextLine();
        String[] arr = mnAndpq.split(" ");

        try {
            this.m = Integer.parseInt(arr[0]);
            this.n = Integer.parseInt(arr[1]);
            this.p = Integer.parseInt(arr[2]);
            this.q = Integer.parseInt(arr[3]);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }

        // Get image matrix
        for (int i = 0; i < this.m; i++) { // row
            String temp = this.getUserInput.nextLine();
            String[] tempArray = temp.split(" ");
            for (int j = 0; j < n; j++) { // col
                this.matrix.get(i).add(Integer.parseInt(tempArray[j]));
            }
        }
    }

    public static void main(String[] args) {
        GSolution run = new GSolution();
        run.getInput();
    }
}
