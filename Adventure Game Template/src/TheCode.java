import java.util.ArrayList;
import java.util.Scanner;

public class TheCode {
    int lives = 3;
    int points = 0;
    ArrayList<String> inventory = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
public static void halt(int seconds){
    try {
                Thread.sleep(seconds*1000);  // the second input gets timed by 1000 becayse the sleep reads in miliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();  // Handle the exception if the thread is interrupted
            }
}

public void Println(){
    System.out.println("");
}


public void Println(String x){
System.out.println(x);
}
public void Print(String x){
System.out.print(x);
}
    public static void main(String[] args) {
        TheCode game = new TheCode();
        game.intro();
        new Pregame(game).play();
        halt(2);
       new LevelOne(game).play();
        new LevelFive(game).play();
          new LevelSix(game).play();
          new LevelSeven(game).play();
        new LevelEight(game).play();
          new LevelNine(game).play();
          /*new LevelTwo(game).play();
        
        new LevelThree(game).play();
        
        new LevelFour(game).play();
        
        
        
      
        
        
        
        
        
      
        
        new LevelTen(game).play();
        
        game.endGame();*/
    }
  public void intro() {
        System.out.println("Welcome to Code Quest!\n");
        System.out.println("You have 3 lives. Make good decisions to survive and earn points.\n");
        asciiWelcome();
        printStats();
        System.out.println("You wake up on a cold, damp ground. Before you stands a grand, ancient"+
         "castle shrouded in mist. The only way forward is a drawbridge raised high above a swirling moat");
    
}








    public void endGame() {
        System.out.println("\nGame Over!");
        printStats();
        System.out.println("Inventory Collected: " + inventory);
        if (lives > 0) {
            System.out.println("Well done, adventurer!");
        } else {
            System.out.println("You have perished on your quest.");
        }
    }

    public void loadingAnimation(String message) {
        System.out.print(message);
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(500);
                System.out.print(".");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }

    public void printStats() {
        System.out.println("Lives: " + lives + " | Points: " + points);
    }


    // ASCII Art Methods
public void asciiWelcome() {
    System.out.println(
            "************************************************************\n" +
            "*                                                          *\n" +
            "*   █████╗ ██████╗ ██╗   ██╗███████╗███╗   ██╗████████╗██╗   ██╗██████╗ ███████╗    *\n" +
            "*  ██╔══██╗██╔══██╗██║   ██║██╔════╝████╗  ██║╚══██╔══╝██║   ██║██╔══██╗██╔════╝    *\n" +
            "*  ███████║██║  ██║██║   ██║█████╗  ██╔██╗ ██║   ██║   ██║   ██║██████╔╝█████╗      *\n" +
            "*  ██╔══██║██║  ██║╚██╗ ██╔╝██╔══╝  ██║╚██╗██║   ██║   ██║   ██║██╔══██╗██╔══╝      *\n" +
            "*  ██║  ██║██████╔╝ ╚████╔╝ ███████╗██║ ╚████║   ██║   ╚██████╔╝██║  ██║███████╗    *\n" +
            "*  ╚═╝  ╚═╝╚═════╝   ╚═══╝  ╚══════╝╚═╝  ╚═══╝   ╚═╝    ╚═════╝ ╚═╝  ╚═╝╚══════╝    *\n" +
            "*                                                                                    *\n" +
            "****************************************************************************"
    );
}
 public void Entrance() {
    System.out.println("******************************************************************************\n" + 
                       "*                                                                    ████    *\n" +
                       "*                             ________                               ████    *\n" +
                       "*                            |   __   |                                      *\n" +
                       "*                            |__|__|__|                                      *\n" +
                       "*                     _______|________|_______                               *\n" +
                       "*                    |                    __   |                             *\n" +
                       "*                    |      []     []    |  |  |                             *\n" +
                       "*                    |                    --   |                             *\n" +
                       "*         ______     |                          |     ______                 *\n" +
                       "*        |      |____|     ______  ______       |____|      |                *\n" +
                       "*        |  []  |           |  |    |  |               []   |                *\n" +
                       "*        |______|           |__|____|__|              ______|                *\n" +
                       "*        |      |___________|          |_____________|      |                *\n" +
                       "*        |    []                ~~~~                  []    |                *\n" +
                       "*        |__________|_____________________|_________________|                *\n" +
                       "*                  ~~~~~~~~~~         ~~~~~~~~~~                             *\n" +
                       "******************************************************************************");
            
}
}   

    






