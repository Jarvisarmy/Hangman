package com.company;

public class Graphics {

    public Graphics() {}

    public void printHangman(int chance) {
        System.out.println("--------");
        switch(chance) {
            case 10:
                System.out.println("        ");
                System.out.println("        ");
                System.out.println("        ");
                System.out.println("        ");
                System.out.println("        ");
                System.out.println("        ");
                System.out.println("        ");
                break;
            case 9:
                System.out.println("        ");
                System.out.println("        ");
                System.out.println("        ");
                System.out.println("        ");
                System.out.println("        ");
                System.out.println("        ");
                System.out.println("========");
                break;
            case 8:
                System.out.println("     +  ");
                System.out.println("     |  ");
                System.out.println("     |  ");
                System.out.println("     |  ");
                System.out.println("     |  ");
                System.out.println("     |  ");
                System.out.println("========");
                break;
            case 7:
                System.out.println(" +---+  ");
                System.out.println("     |  ");
                System.out.println("     |  ");
                System.out.println("     |  ");
                System.out.println("     |  ");
                System.out.println("     |  ");
                System.out.println("========");
                break;
            case 6:
                System.out.println(" +---+  ");
                System.out.println(" |   |  ");
                System.out.println("     |  ");
                System.out.println("     |  ");
                System.out.println("     |  ");
                System.out.println("     |  ");
                System.out.println("========");
                break;
            case 5:
                System.out.println(" +---+  ");
                System.out.println(" |   |  ");
                System.out.println(" O   |  ");
                System.out.println("     |  ");
                System.out.println("     |  ");
                System.out.println("     |  ");
                System.out.println("========");
                break;
            case 4:
                System.out.println(" +---+  ");
                System.out.println(" |   |  ");
                System.out.println(" O   |  ");
                System.out.println(" |   |  ");
                System.out.println("     |  ");
                System.out.println("     |  ");
                System.out.println("========");
                break;
            case 3:
                System.out.println(" +---+  ");
                System.out.println(" |   |  ");
                System.out.println(" O   |  ");
                System.out.println("/|   |  ");
                System.out.println("     |  ");
                System.out.println("     |  ");
                System.out.println("========");
                break;
            case 2:
                System.out.println(" +---+  ");
                System.out.println(" |   |  ");
                System.out.println(" O   |  ");
                System.out.println("/|\\  |  ");
                System.out.println("     |  ");
                System.out.println("     |  ");
                System.out.println("========");
                break;
            case 1:
                System.out.println(" +---+  ");
                System.out.println(" |   |  ");
                System.out.println(" O   |  ");
                System.out.println("/|\\  |  ");
                System.out.println("/    |  ");
                System.out.println("     |  ");
                System.out.println("========");
                break;
            case 0:
                System.out.println(" +---+  ");
                System.out.println(" |   |  ");
                System.out.println(" O   |  ");
                System.out.println("/|\\  |  ");
                System.out.println("/ \\  |  ");
                System.out.println("     |  ");
                System.out.println("========");
                break;
            default:
                


        }
        System.out.println("--------");
    }
}
