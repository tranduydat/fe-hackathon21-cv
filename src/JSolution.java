
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
public class JSolution {

    int k;
    Scanner getUserInput = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();
    int sum = 0;
    int vcl;

    public void getInput() {
        try {
            this.k = Integer.parseInt(this.getUserInput.nextLine());
            if (this.k >= 0 && this.k < 1000) {
                String temp = this.getUserInput.nextLine();
                String[] arrTemp = temp.split(" ");
                this.vcl = Integer.parseInt(arrTemp[k - 1]);
                for (int i = 0; i < arrTemp.length - 1; i++) {
                    int az = Integer.parseInt(arrTemp[i]);
                    if (az >= 0) {
                        int xx = az % vcl;
                        if (xx % 2 != 0) {
                            sum += xx;
                        }
                    }
                }
            }

        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        JSolution run = new JSolution();
        run.getInput();
        System.out.println(run.sum);
    }
}
