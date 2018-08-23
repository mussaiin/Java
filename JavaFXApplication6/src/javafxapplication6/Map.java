/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication6;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Admin
 */
public class Map extends Pane {
    
    private static final int CELL_SIZE = 50;
    private static final int BALL_SIGN = 2;
    private static final int WALL = 1;
    private static final int EMPTY = 0;

    private int unit;
    private int size;
    private int[][] map;
    private Position start;
    private Rectangle square = null;
    public Map(String s) {
        
    }

    public int getUnit() {
        return CELL_SIZE;
    }

    public int getSize() {
        size = map.length;
        return size;
    }

    public int[][] getMap() {
        try {
            Scanner in = new Scanner(new File("map.txt"));
            size = in.nextInt();
            map = new int[size][size];
            while (in.hasNext()) {
                for (int row = 0; row < size; row++) {
                    for (int column = 0; column < size; column++) {
                        map[row][column] = in.nextInt();
                    }
                }
            }
            in.close();
        } catch (FileNotFoundException e) {
            
        }
        return map;
    }

    public Position getStartPosition() {
        int x = 0;
        int y = 0;
        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map[row].length; col++) {
                if (map[row][col] == BALL_SIGN) {
                    x = col;
                    y = row;
                    start = new Position(x, y);
                    break;
                }
            }
        }
        return start;
    }
    public GridPane drawTable(){
        GridPane gridPane = new GridPane();
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                square = new Rectangle();
                square.setStroke(Color.BLACK);
                if (map[row][col] == EMPTY || map[row][col] == BALL_SIGN) {
                    square.setFill(Color.WHITE);
                } else if (map[row][col] == WALL) {
                    square.setFill(Color.BLACK);
                }
                gridPane.add(square, col, row);
                square.setWidth(getUnit());
                square.setHeight(getUnit());
            }
        }
        return gridPane;
    }
}

