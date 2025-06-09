import java.util.ArrayList;
import java.util.Scanner;

public class CastleofMysteries {
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
        CastleofMysteries game = new CastleofMysteries();
        game.intro();
        new Pregame(game).play();
        halt(2);
       new LevelOne(game).play();
        halt(2);
       new LevelTwo(game).play();
        halt(2);
       new LevelThree(game).play();
        halt(2);
       new LevelFour(game).play();
        halt(2);
       new LevelFive(game).play();
        halt(2);
       new LevelSix(game).play();
        halt(2);
       new LevelSeven(game).play();
        halt(2);
       new LevelEight(game).play();
        halt(2);
       new LevelNine(game).play();
        halt(2);
       new LevelTen(game).play();   
        halt(2);
       new Ending(game).play(); 
       
        
        
        
        
        
      
        
        
        
        
        
      
        
        
        
        
    }
  public int pl()
        {
           return (int)(Math.random()+6);
        }
        public void intro() {
        System.out.println("Welcome to Code Quest!\n");
        System.out.println("You have 3 lives. Make good decisions to survive and earn points.\n");
        asciiWelcome();
        printStats();
        Println("You wake up on a cold, damp ground."); 
        halt(2);
        Println("Before you stands a grand, ancient castle shrouded in mist. The only way forward is a drawbridge raised high above a swirling moat.");
        Entrance();
    }








    public void endGame() {
        System.out.println("\nGame Over!");
        printStats();
        System.out.println("Inventory Collected: " + inventory);
        
        
            System.out.println("You have perished on your quest.");
        
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
        Println("Lives: " + lives + " | Points: " + points);
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
public void Drawbridge(){
 Println("             ~~~~~~~~~~~~~~~~       \n" +
  "           ======================== \n" +
  "          ||                     || \n" +
  "          ||                     || \n" +
  "           ======================== \n" +
  "                ~~~~~~~~~~~~~~~~    \n" +
  "           ~~~~~~~~~~~~~~~~~~~~~~~  \n" +
  "               ~~~~~~~~~~~~~~~~     \n" +
  "           ~~~~~~~~~~~~~~~~~~~~~~~  \n");

}



public void courtyard(){
    System.out.println("                    _________                ");
System.out.println("                   |         |               ");
System.out.println("                   |         |               ");
System.out.println("    ~~~~~~~~      _|_________|_      ~~~~~~~~");
System.out.println("~~~~~~~~~~~~~~~  |             |  ~~~~~~~~~~~~~~~");
System.out.println(" ~~~~~~~~~~~~~~  |             |   ~~~~~~~~~~~~~~");
System.out.println("  ~~~~~~~~~~~~~  |             |    ~~~~~~~~~~~~~");
System.out.println("       _____     |   _______   |     _____        ");
System.out.println("      |     |    |  |       |  |    |     |       ");
System.out.println("      |     |    |  |       |  |    |     |       ");
System.out.println("      |_____|____|__|_______|__|____|_____|       ");
System.out.println("     /                             _        \\    ");
System.out.println("    /                             (_)        \\   ");
System.out.println("   /                                          \\  ");
System.out.println("  ---------------------------------------------  ");
}


public void grandhall(){
System.out.println("                ||                    ||");
System.out.println("                ||                    ||");
System.out.println("                ||____________________||");
System.out.println("                ||                    ||");
System.out.println("         _______||____________________||_______");
System.out.println("        |                                       |");
System.out.println("        |                                       |");
System.out.println("        |                                       |");
System.out.println("        |                                       |");
System.out.println("        |                                       |");
System.out.println("        |                                       |");
System.out.println("        |       *       *       *       *       |");
System.out.println("        |      / \\     / \\     / \\     / \\      |");
System.out.println("        |     /   \\   /   \\   /   \\   /   \\     |");
System.out.println("        |    /_____/\\_____/\\_____/\\_____/\\    |");
System.out.println("        |                                       |");
System.out.println("        |                                       |");
System.out.println("        |                                       |");
System.out.println("        |_______________________________________|");
}

public void stairs(){
System.out.println("            ____________");
System.out.println("           |            |");
System.out.println("           |            |");
System.out.println("           |    []      |");
System.out.println("           |            |");
System.out.println("           |____________|");
System.out.println("          /             /|");
System.out.println("         /             / |");
System.out.println("        /             /  |");
System.out.println("       /_____________/   |");
System.out.println("       |             |   |");
System.out.println("       |             |   |");
System.out.println("       |    []       |   |");
System.out.println("       |_____________|   |");
System.out.println("      /              |   |");
System.out.println("     /              /|   |");
System.out.println("    /              / |   |");
System.out.println("   /              /  |   |");
System.out.println("  /______________/   |  /");
System.out.println("  |                  | /");
System.out.println("  |__________________|/");
}

public void library(){
    System.out.println("   ___________________________________________");
System.out.println("  /                                           \\");
System.out.println(" /                                             \\");
System.out.println("|   ||||||||||||         ||||||||||||          |");
System.out.println("|   ||||||||||||         ||||||||||||          |");
System.out.println("|   ||||||||||||         ||||||||||||          |");
System.out.println("|   ||||||||||||         ||||||||||||          |");
System.out.println("|                                               |");
System.out.println("|   ||||||||||||         ||||||||||||          |");
System.out.println("|   ||||||||||||         ||||||||||||          |");
System.out.println("|   ||||||||||||         ||||||||||||          |");
System.out.println("|   ||||||||||||         ||||||||||||          |");
System.out.println("|                                               |");
System.out.println("|          --------------------------           |");
System.out.println("|          |                        |           |");
System.out.println("|          |                        |           |");
System.out.println("|          --------------------------           |");
System.out.println("\\_______________________________________________/");
}


public void observe(){
System.out.println("        /\\          /\\          /\\          /\\");
System.out.println("       /  \\        /  \\        /  \\        /  \\");
System.out.println("      /    \\      /    \\      /    \\      /    \\");
System.out.println("     /______\\____/______\\____/______\\____/______\\");
System.out.println("    /        \\  /        \\  /        \\  /        \\");
System.out.println("   /          \\/          \\/          \\/          \\");
System.out.println("  |                                                   |");
System.out.println("  |         ___________      ___________              |");
System.out.println("  |        |           |    |           |             |");
System.out.println("  |        |           |    |           |             |");
System.out.println("  |        |___________|    |___________|             |");
System.out.println("  |                                                   |");
System.out.println("  |                                                   |");
System.out.println("  |___________________________________________________|");
}



public void yroom(){
System.out.println("  ________________________________");
System.out.println(" |                                |");
System.out.println(" |  ____________________________  |");
System.out.println(" | |                            | |");
System.out.println(" | |                            | |");
System.out.println(" | |                            | |");
System.out.println(" | |                            | |");
System.out.println(" | |                            | |");
System.out.println(" | |____________________________| |");
System.out.println(" |                                |");
System.out.println(" |  /\\                      /\\    |");
System.out.println(" | /  \\                    /  \\   |");
System.out.println(" |/    \\__________________/    \\  |");
System.out.println(" |                                |");
System.out.println(" |________________________________|");
}

public void vault(){
    System.out.println("       ___________________________");
System.out.println("     .\"                           \".");
System.out.println("    /    _______________________    \\");
System.out.println("   /    /                       \\    \\");
System.out.println("  |    |   .--------------.      |    |");
System.out.println("  |    |  /                \\     |    |");
System.out.println("  |    | |   ___      ___   |    |    |");
System.out.println("  |    | |  |   |    |   |  |    |    |");
System.out.println("  |    | |  | O |    | O |  |    |    |");
System.out.println("  |    | |  |___|    |___|  |    |    |");
System.out.println("  |    |  \\                /     |    |");
System.out.println("  |    |   '--------------'      |    |");
System.out.println("  |    |                         |    |");
System.out.println("  |    |       \\    |    /        |    |");
System.out.println("  |    |        \\   |   /         |    |");
System.out.println("  |    |         \\  |  /          |    |");
System.out.println("  |    |          \\ | /           |    |");
System.out.println("  |    |           \\|/            |    |");
System.out.println("  |    |        ----+----          |    |");
System.out.println("  |    |           /|\\            |    |");
System.out.println("  |    |          / | \\           |    |");
System.out.println("  |    |         /  |  \\          |    |");
System.out.println("  |    |        /   |   \\         |    |");
System.out.println("  |    |                         |    |");
System.out.println("   \\    \\_______________________/    /");
System.out.println("    \\                             _ /");
System.out.println("     '---------------------------' ");
}
public void chair(){
    System.out.println("             ___________");
System.out.println("            |           |");
System.out.println("            |   _____   |");
System.out.println("            |  |     |  |");
System.out.println("            |  |     |  |");
System.out.println("            |  |_____|  |");
System.out.println("            |___________|");
System.out.println("         ____||       ||____");
System.out.println("        |    ||       ||    |");
System.out.println("        |    ||       ||    |");
System.out.println("        |    ||_______||    |");
System.out.println("        |    |_________|    |");
System.out.println("        |                   |");
System.out.println("        |                   |");
System.out.println("        |___________________|");
}
public void peak(){
System.out.println("           _____________");
System.out.println("          /             \\");
System.out.println("         /               \\");
System.out.println("        /                 \\");
System.out.println("       /___________________\\");
System.out.println("       |                   |");
System.out.println("       |     _________     |");
System.out.println("       |    |         |    |");
System.out.println("       |    |  _   _  |    |");
System.out.println("       |    | |_| |_| |    |");
System.out.println("       |    |_________|    |");
System.out.println("       |                   |");
System.out.println("       |                   |");
System.out.println("       |                   |");
System.out.println("       |___________________|");
}

}   

    






