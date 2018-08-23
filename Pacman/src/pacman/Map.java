/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
/**
 *
 * @author Nurlybek
 */
public class Map extends Pane{

    private int unit;
    private int size;
    private int[][] map;
    private Scanner input;
    private Position start;
    private Position botstart;
    private ArrayList<Position> empty;

    public Map(String file) {
        try {
            input = new Scanner(new File(file));
            empty = new ArrayList<>();
            size = input.nextInt();
            unit = 20;
            map = new int[size][size];
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++){
                    int n = input.nextInt();
                    map[j][i] = n;
                    Rectangle rectangle = new Rectangle(j*unit, i*unit, unit, unit); // (x, y, w, h)
                    rectangle.setStroke(Color.BLACK);
                    rectangle.setFill(Color.WHITE);
                    switch(n){
                      case 0:
                        empty.add(new Position(j, i));
                        getChildren().add(rectangle);
                        break;
                      case 1:
                        rectangle.setFill(Color.DIMGRAY);
                        getChildren().add(rectangle);
                        break;
                      case 2:
                        start = new Position(j, i); empty.add(start);
                        break;
                      case 3:
                        botstart = new Position(j, i); empty.add(botstart);
                        break;
                    }
                  }
            }
        }
        catch(Exception ex) {
            System.out.println("LOLKEKCHEBUREK\nABALOWPEK");
            ex.printStackTrace();
        }
    }

    public boolean isEmpty(Position position) {
      for (Position p: empty){
            if (position.equals(p)){
                return true;
            }
        }
        return false;
    }

    public int getUnit() {
        return unit;
    }

    public int getSize() {
        return size;
    }

    public int[][] getMap() {
        return map;
    }

    public Position getPosition() {
        return start;
    }

    public Position getBotPosition() {
        return botstart;
    }
}
