package com.homework.daniel.OutPut;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class OutputExercise {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        String[] titles = {"Harry Potter","Effective Java","Pirate of the Caribbeans","Matrix"};
        float[] prices = {40.0f,70.0f,100.0f,48.5f};
        int[] amount = {5,10,2,6};

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("titles_to_prices.txt"));
            for (int i = 0; i < titles.length; i++) {
                writer.write(titles[i] +"-"+ prices[i] + "-" +amount[i] +"\n");
            }
            writer.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

}
