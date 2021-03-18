/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dattran
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author os
 */
public class KSolutionArchived {

    public Scanner in = new Scanner(System.in);
    public int x;
    public int y;

    public void checkInputIntLimit() {
        String userInput = this.in.nextLine();
        String[] arrXY = userInput.split(" ");
        this.x = Integer.parseInt(arrXY[0]);
        this.y = Integer.parseInt(arrXY[1]);
    }

    public void calculate() {
        int count = 0;
        ArrayList<String> map1 = new ArrayList<>();
        ArrayList<String> map2 = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            map1.add(in.nextLine());
        }

        for (int i = 0; i < y; i++) {
            map2.add(in.nextLine());
        }

        for (int i = 0; i < x - y; i++) {
            for (int j = 0; j < y; j++) {
                int k = i + j;
                if (map2.get(j).equals(map1.get(k)) || map2.get(j).equals('?') || map1.get(k).equals('?')) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        KSolutionArchived run = new KSolutionArchived();
        run.checkInputIntLimit();
        run.calculate();
        // TODO code application logic here
    }

}
