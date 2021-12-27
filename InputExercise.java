package com.homework.daniel.InPut;

import com.homework.daniel.Model.Book;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InputExercise {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("titles_to_prices.txt"));
            String currentLine;
            while ((currentLine = reader.readLine()) != null){
                int indexHlper = 0;
                String title = "";
                char charAt = currentLine.charAt(indexHlper);
                while (charAt != '-'){
                    title += charAt;
                    indexHlper++;
                    charAt = currentLine.charAt(indexHlper);
                }
                indexHlper++;
                charAt = currentLine.charAt(indexHlper);
                String price = "";
                while (charAt != '-'){
                    price += charAt;
                    indexHlper++;
                    charAt = currentLine.charAt(indexHlper);
                }
                indexHlper++;
                String amount = "";
                charAt = currentLine.charAt(indexHlper);
                while (indexHlper != currentLine.length()){
                    amount += charAt;
                    indexHlper++;
                }
                books.add(new Book(title,Float.parseFloat(price),Integer.parseInt(amount)));
            }
            for (Book book : books) {
                System.out.println(book);
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
