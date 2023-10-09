package org.ulpgc.example;
import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class SerializationExercises {
    /*
        Should define the class for the concepts Movie, Theater and Session.
        A session is a play of movie in a theater.
        Create 2 instances of each class and relate among them.
        Serialize to Json all objects and save then in different files.
     */
    public static class Exercise1 {
        public static void main(String[] args) {

            Movie movie = new Movie("Goodfellas", "Martin Escorsese");
            Theater theater = new Theater(120, "Galaxy");
            Session session = new Session(100, "4:30", movie, theater);

            Gson gson = new Gson();
            String json = gson.toJson(movie);

            System.out.println(json);


        }
    }

    /*
        Deserialize the objects created in exercise 1.
        Now serialize them using ObjectOutputStream
     */
    public static class Exercise2 {

        public static void main(String[] args) {

        }
    }

    /*
       Deserialize the objects from the binary files created in exercise 2.
    */
    public static class Exercise3 {

        public static void main(String[] args) {

        }
    }
}
