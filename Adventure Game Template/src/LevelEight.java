class LevelEight extends TheCode {
    TheCode game;
    LevelEight(TheCode game) {
        this.game = game;
    }
    public void play() {
        Println();
        System.out.println("Level 8: The Vault");
       Println();
       Println("As you examine the vault from the outside, you notices its run down state.");
       halt(2);
       Println("However its old and rusty its doors reamain sealed tightly.");
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
                System.out.println("The vault shakes violently, and you lose a life.");
                lives--;

                if (lives > 0) {
                    System.out.println("Try again. Lives remaining: " + lives);
                } else {
                    System.out.println("Game over! You have no lives left.");
                }
            }
        }
        halt(2);
        Println("The room is filled with various riches and a vast amount of old currency used far in the past.");
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    }
