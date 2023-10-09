package org.ulpgc.example;

import com.google.gson.Gson;
import java.io.BufferedWriter;
import java.io.FileWriter;



// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("Goodfellas", "Martin Escorsese");
        Theater theater = new Theater(120, "Galaxy");
        Session session = new Session(100, "4:30", movie, theater);

        Gson gson = new Gson();
        String json = gson.toJson(movie);

        System.out.println(json);

        Gson gson1 = new Gson();
        String json1 = gson.toJson(theater);

        System.out.println(json1);

        Gson gson2 = new Gson();
        String json2 = gson.toJson(session);

        System.out.println(json2);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\aadel\\Desktop\\Segundo\\DACD\\prueba.txt"))) {
            // Escribir JSON en el archivo
            writer.write(json);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        try (BufferedWriter writer1 = new BufferedWriter(new FileWriter("C:\\Users\\aadel\\Desktop\\Segundo\\DACD\\prueba2.txt"))) {
            // Escribir JSON en el archivo
            writer1.write(json1);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        try (BufferedWriter writer2 = new BufferedWriter(new FileWriter("C:\\Users\\aadel\\Desktop\\Segundo\\DACD\\prueba3.txt"))) {
            // Escribir JSON en el archivo
            writer2.write(json2);
        } catch (Exception exception) {
            exception.printStackTrace();
        }



    }
}