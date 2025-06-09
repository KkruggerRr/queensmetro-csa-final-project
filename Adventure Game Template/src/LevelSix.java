class LevelSix extends CastleofMysteries {
    CastleofMysteries game;
    LevelSix(CastleofMysteries game) {
        this.game = game;
    }
    public void play() {
       Println();
        
        System.out.println("Level 6: The Observatory");
       
        
    halt(1);
        Println("");
        Println("As you step into what seems to be some sort of observatory, where there is a slanted glass roof.");
        halt(2);
        observe();
        halt(2);
        Println("Stars twinkle and their light gets amplified into small words that shine onto a table that reads");
        halt(2);
        Println("\"What is always in front of you but can’t be seen?\"");
        
    
    
    
    
    boolean success = false;
       while (!success && lives > 0) {
            Print("Enter your answer: ");
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("the future") || input.equalsIgnoreCase("future")) {
                Println("");
                Println("The stars align, revealing the next path before a small hatch unlocks from a relic telescope and reveals a silver key.");
                halt(2);
                Println("You pick it up.");
                halt(2);
                Println("Following the path ahead of you is a single keyhole on an otherwise deadend wall");
                halt(2);
                points+=10;
                success = true;
            } else {
                Println("The room fills with disorienting starlight, and you lose a life.");
                lives--;
                points-=pl();
                if (lives > 0) {
                    Println("Try again. Lives remaining: " + lives);
                } else {
                   game.endGame();
                }
            }
        }
      
    }
        }
    