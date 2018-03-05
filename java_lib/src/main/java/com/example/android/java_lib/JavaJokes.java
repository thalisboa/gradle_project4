package com.example.android.java_lib;

import java.util.ArrayList;
import java.util.List;

public class JavaJokes {

    public static String getJokes(){

        List<String> jokes;

        jokes = new ArrayList<>();

        jokes.add("Q: What is Black and white and read (red) all over? \n" +
                  "A: A newspaper \n");
        jokes.add("Q: What begins with T, ends with T and has T in it? \n" +
                  "A: A teapot. \n");
        jokes.add("One night a man and a woman walked into the bar they left. Who remains? \n" +
                  "A: The night \n" );
        jokes.add(" Q: What's a teacher's favorite nation? \n" +
                  "A: Expla-nation. \n");
        jokes.add(" Q: What's another name for Santa's elves? \n" +
                  "A: Subordinate Clauses. \n");
        jokes.add(" ");
        return jokes.get((int) Math.floor((Math.random() * 5)));
}

}
