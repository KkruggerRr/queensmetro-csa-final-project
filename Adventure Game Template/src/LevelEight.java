class LevelEight extends CastleofMysteries {
    CastleofMysteries game;
    LevelEight(CastleofMysteries game) {
        this.game = game;
    }
    public void play() {
        Println();
        System.out.println("Level 8: The Vault");
       Println();
       Println("As you examine the vault from the outside, you notices its run down state.");
       halt(2);
       vault();
       halt(2);
       Println("However old and rusty, its doors reamain sealed tightly.");
       halt(2);
       Println("A deep voice challenges you:\"What can you break, even if you never pick it up or touch it?\"");
       halt(2);
    
    
    
       boolean success = false;
       while (!success && lives > 0) {
            System.out.print("Enter your answer: ");
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("promise") || input.equalsIgnoreCase("a promise")) {
                System.out.println("The vault creaks open, and you step through.");
                points +=10;
                success = true;
            } else {
                System.out.println("The vault shakes violently, you lose a life and some points.");
                lives--;
points-=pl();
                if (lives > 0) {
                    System.out.println("Try again. Lives remaining: " + lives);
                } else {
                    game.endGame();
                }
            }
        }
        halt(2);
        Println("The room is filled with various riches and a vast amount of old currency used far in the past.");
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    }
