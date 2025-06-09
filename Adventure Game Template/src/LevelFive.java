class LevelFive extends CastleofMysteries {
    CastleofMysteries game;
    LevelFive(CastleofMysteries game) {
        this.game = game;
    }
    public void play() {
        Println();
     
        System.out.println("Level 5: The library");
       Println();
        
    halt(1);
       
        Println("You enter a vast library, the air thick with the smell of aged parchment.");
        halt(2);
        library();
        halt(2);
        Println("From a shadowy corner, a whisper emerges:\"What question can you never answer yes to?\"");
        
    
    
    
    
    boolean success = false;
       while (!success && lives > 0) {
            System.out.print("Enter your answer: ");
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("are you asleep") || input.equalsIgnoreCase("are you asleep?")) {
                Println();
                Println("A hidden bookcase swings open, revealing a passage forward.");
                halt(2);
                Println("A golden key gets disloged from the mechanism falling to your feet.");
                halt(2);
                Println("You pick it up.");
                success = true;
                points+=10;
            } else {
                System.out.println("The shelves rumble and fall over, landing on top of you taking one of your lives.");
                lives--;
                points-=pl();
                if (lives > 0) {
                    System.out.println("Try again. Lives remaining: " + lives);
                } else {
                    game.endGame();
                }
            }
        }
      
    }
    
    
    
    
    
    
    
    
    
    
    }
    