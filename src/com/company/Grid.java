package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Grid {
    private int gridsize;
    private char[][] contents;
    private List<Coordinate> coordinates = new ArrayList<>();
    private class Coordinate{
        int x;
        int y;
        Coordinate(int x,int y){
            this.x=x;
            this.y=y;
        }
    }

    Grid(int gridsize){
        this.gridsize=gridsize;
        contents= new char[gridsize][gridsize];

        for(int i=0;i<gridsize;i++){
            for(int j=0;j<gridsize;j++){
                coordinates.add(new Coordinate(i,j));
                contents[i][j]='_';
            }

        }
    }
    public void fillGrid(List<String> words){
        for(String word: words) {
            Collections.shuffle(coordinates);
            for (Coordinate coordinate : coordinates) {
                int x = coordinate.x;
                int y=coordinate.y;
                if (y + word.length() < gridsize) {


                    for (char c : word.toCharArray()) {
                        contents[x][y++] = c;

                    }
                    break;
                }


            }
        }
    }
    public void displayGrid(){
        for(int i=0;i<gridsize;i++){
            for(int j=0;j<gridsize;j++){
                System.out.print(contents[i][j]+" ");
            }
            System.out.println("");
        }
    }


}
