package Zad2;

import java.util.ArrayList;
import java.util.List;

public class Punkt {
    private int coordinateX;
    private int coordinateY;
    private int getCoordinateY;
    private int anyNumber;

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setGetCoordinateY(int coordinateY) {
        this.getCoordinateY = coordinateY;
    }

    public int getGetCoordinateY() {
        return getCoordinateY;
    }


    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    public void incrementCoordinateX() {
        coordinateX++;
    }

    public void setAnyNumber(int anyNumber) {
        this.anyNumber = anyNumber;
    }


    public int getAnyNumber() {
        return anyNumber;
    }

    public int[] XxandYy() {
        int[] XandY = {coordinateX, coordinateY};
        return XandY;
    }

    public void printTableOfXandY(int[] tableXandY) {
        for (int i = 0; i < tableXandY.length; i++) {
            System.out.println(tableXandY[i] + " ");
        }
    }


    public List<Integer> XandY() {
        List<Integer> points = new ArrayList<>();
        points.add(coordinateX);
        points.add(coordinateY);
        return points;
    }

    public void printX() {
        System.out.println(coordinateX);

    }

    public void printY() {
        System.out.println(coordinateY);
    }

    public void printXandY() {
        System.out.println("x: " + coordinateX + " y: " + coordinateY);
    }

}
