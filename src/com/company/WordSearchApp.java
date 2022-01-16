package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class WordSearchApp {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("ONE","TWO","THREE");
        for(String word: words){
            int x = ThreadLocalRandom.current().nextInt(0,GridSize);
            int y = ThreadLocalRandom.current().nextInt(0,GridSize);
            grid[x][y] = word.charAt(0);
        }



    }
}
