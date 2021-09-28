package com.company;
import java.util.*;
public class Game {
    private Category category;
    private Graphics graphics = new Graphics();
    public Game() {

    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Graphics getGraphics() {
        return graphics;
    }

    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }

    public void mainMenu() {
        System.out.println("Please choose one of the followings by entering the number");
        System.out.println("1. Start the game");
        System.out.println("2. View the rules of the game");
        System.out.println("3. Exit the game");
        Scanner read = new Scanner(System.in);

        while (true) {
            String choice = read.next();
            if (choice.equals("1")) {
                this.chooseCategory();
                break;
            } else if (choice.equals("2")) {
                System.out.println("here is the rules");
                System.out.println("1. You will be given a list of word category and choose the one you want");
                System.out.println("2. Eacy category would contain a bank of words.");
                System.out.println("3. There are totally 5 levels for each game, and you need to guess the words");
                System.out.println("4. If you pass all 5 levels, you win the game");
                System.out.println("5. In each level, you have 10 chances to guess each word");
                System.out.println("6. If you guess wrong 10 times in each level, you lost");
                System.out.println("please type 'back' to go back to main menu");
                while (true) {
                    String input = read.next();
                    if (input.equals("back")) {
                        this.mainMenu();
                        break;
                    } else {
                        System.out.println("wrong input, please type again");

                    }
                }

            } else if (choice.equals("3")) {
                break;
            } else {
                System.out.println("wrong input, please type again");
            }
        }

    }
    public void chooseCategory() {
        Scanner read = new Scanner(System.in);
        System.out.println("Please choose one from the following word category to play");

        System.out.println("Sports");
        System.out.println("Animals");
        System.out.println("Jobs");
        System.out.println("Buildings");

        while (true) {
            String cate = read.next();
            if (cate.equals("Sports")) {
                this.category = new Sports();
                break;
            } else if (cate.equals("Animals")) {
                this.category = new Animals();
                break;
            } else if (cate.equals("Jobs")) {
                this.category = new Jobs();
                break;
            } else if (cate.equals("Buildings")) {
                this.category = new Buildings();
                break;
            } else {
                System.out.println("the category doesn't exist");

            }
        }
        System.out.println("Game starts");
        this.startGame();
    }
    public void startGame() {
        String word = this.category.nextWord();
        this.wordGuessing(word);
    }
    public void wordGuessing(String word) {
        String dashWord = "";
        String selectedChar = "";
        String incorrectChar = "";
        String lettersBank = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != ' ') {
                dashWord = dashWord + '_';
            } else {
                dashWord = dashWord + ' ';
            }
        }
        int chance = 10;
        while (chance > 0) {
            System.out.println("Incorrect characters: " + incorrectChar);
            System.out.println("Letters Bank: " + lettersBank);
            System.out.println("The chance you have: " + chance);
            graphics.printHangman(chance);
            System.out.println("Word: "+dashWord);
            Scanner read = new Scanner(System.in);
            System.out.println("Please type one character to guess");
            String choice = read.next();
            if (choice.length() != 1) {
                System.out.println("wrong input, please try again!");
                continue;
            } else if (lettersBank.indexOf(choice) == -1) {
                System.out.println("the character '"+choice+"' is not available");
                System.out.println("Please try again!");
                continue;
            } else if (word.indexOf(choice) != -1) {
                // this means we got an correct character
                // remove it from lettersbank
                for (int i = 0; i < lettersBank.length(); i++) {
                    if (lettersBank.charAt(i) == choice.charAt(0)) {
                        lettersBank = lettersBank.substring(0,i) + lettersBank.substring(i+1);
                        break;
                    }
                }
                // modify the dashword
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == choice.charAt(0)) {
                        dashWord = dashWord.substring(0,i) + choice + dashWord.substring(i+1);
                    }
                }
            } else {
                // this means we got an incorrect character
                // remove it from lettersbank
                lettersBank.replace(choice, "");

                // add it to incorrectchar
                incorrectChar = incorrectChar + choice;
                // decrease the chance by 1
                chance = chance - 1;
            }
            if (dashWord.equals(word)) {
                System.out.println("You guess correctly");
                if (this.category.curLevel == 4) {
                    this.winGame();
                } else {
                    chance = 10;
                    this.startGame();
                }
            }
        }
        this.loseGame();
    }
    public void loseGame() {
        System.out.println("You Lose");
        this.mainMenu();
    }
    public void winGame() {
        System.out.println("You Win");
        this.mainMenu();
    }
}
