class LevelOne extends TheCode {
    TheCode game;
    LevelOne(TheCode game) {
        this.game = game;
    }
    public void play() {
        Println("");
        Println("");
        Println("Level 1: ???");
       halt(1);
       
       Println("you walk towards the moat, its water moving in an odd way that makes you feel unease as the creaks of old wood can be heard from the wind"); 
       halt(2);
       Println("A voice echoes:\"To cross the bridge, you must answer this: What has keys but can't open locks?\"");
        
    
    
    
    
    boolean success = false;
       while (!success && lives > 0) {
            System.out.print("Enter your answer: ");
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("piano") || input.equalsIgnoreCase("a piano")) {
                System.out.println("The drawbridge lowers, and you step into the courtyard.");
                points +=10;
                success = true;
            } else {
                System.out.println("The moat's mist swirls ominously, and you lose a life.");
                lives--;

                if (lives > 0) {
                    System.out.println("Try again. Lives remaining: " + lives);
                } else {
                    System.out.println("Game over! You have no lives left.");
                }
            }
        }
        
    }
    
}
