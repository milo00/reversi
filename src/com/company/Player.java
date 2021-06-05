package com.company;

import java.util.Scanner;

public class Player {
    private Color color;

    public Player(Color color) {
        this.color = color;
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int[] move() {
        Scanner scanner = new Scanner(System.in);
        boolean incorrect = false;
        int pos1, pos2;
        do {
            String position = scanner.nextLine();
            pos1 = switch (position.charAt(0)) {
                case 'A' -> 0;
                case 'B' -> 1;
                case 'C' -> 2;
                case 'D' -> 3;
                case 'E' -> 4;
                case 'F' -> 5;
                case 'G' -> 6;
                case 'H' -> 7;
                default -> -1;
            };
            if (pos1 == -1) {
                System.out.println("The first sign has to be a char between A and H");
                incorrect = true;
            }
            pos2 = Character.getNumericValue(position.charAt(1));
            if (pos2 < 1 || pos2 > 8) {
                System.out.println("The second sign has to be a number between 1 and 8");
                incorrect = true;
            }
        } while (incorrect);

        return new int[]{pos2 - 1, pos1};
    }
}