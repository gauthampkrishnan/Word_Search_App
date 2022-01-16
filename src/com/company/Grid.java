package com.company;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Grid {
    private int gridsize;
    private char[][] contents = new char[gridsize][gridsize];
    Grid(int gridsize){
        this.gridsize=gridsize;
        for(int i=0;i<gridsize;i++){
            for(int j=0;j<gridsize;j++){
                contents[i][j]='_';
            }

        }
    }
    public void fillGrid(List<String> words){
        for(String word: words){
            int x= ThreadLocalRandom.current().nextInt(0,gridsize);
            int y= ThreadLocalRandom.current().nextInt(0,gridsize);
            contents[x][y]=word.charAt(0);
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