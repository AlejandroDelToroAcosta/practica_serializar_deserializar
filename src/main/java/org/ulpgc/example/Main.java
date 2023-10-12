package org.ulpgc.example;

import com.google.gson.Gson;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;


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
            writer.write(json);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        try (BufferedWriter writer1 = new BufferedWriter(new FileWriter("C:\\Users\\aadel\\Desktop\\Segundo\\DACD\\prueba2.txt"))) {
            writer1.write(json1);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        try (BufferedWriter writer2 = new BufferedWriter(new FileWriter("C:\\Users\\aadel\\Desktop\\Segundo\\DACD\\prueba3.txt"))) {
            writer2.write(json2);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        ////Ejercicio2///////////////////////
        try {////Deserializar//////////
            Gson newGson = new Gson();
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\aadel\\Desktop\\Segundo\\DACD\\prueba3.txt"));
            String sesionFile = reader.readLine();
            System.out.println(sesionFile);
            reader.close();

        } catch (Exception exception) {
            exception.printStackTrace();

        }
        /////Serializar con OutputStream////////////
        try{
            ObjectOutputStream serialized_session = new ObjectOutputStream(new FileOutputStream("C:\\Users\\aadel\\Desktop\\Segundo\\DACD\\prueba4.txt"));
            serialized_session.writeObject(session);
            serialized_session.close();

        }catch (Exception ex){
            ex.printStackTrace();
        }
        ////EJERCICIO 3/////
        try {
            ObjectInputStream deserializedSession = new ObjectInputStream(new FileInputStream("C:\\Users\\aadel\\Desktop\\Segundo\\DACD\\prueba4.txt"));
            Session sessionDeserialized = (Session) deserializedSession.readObject();
            System.out.println(sessionDeserialized);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}