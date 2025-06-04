class LevelSeven extends TheCode {
    TheCode game;
    LevelSeven(TheCode game) {
        this.game = game;
    }
    public void play() {
            
            Println("do you: |insert the Gold key| from the observatory, or |insert the silver key| from the library");
          
        String input2="";        
        
        boolean success = false;
       while (!success && lives > 0) {
            System.out.print("Enter your answer: ");
            String input = scan.nextLine();

            input2=input;
            if (input.equalsIgnoreCase("insert the Gold key") || input.equalsIgnoreCase("insert the silver key")) {
                
                success = true;
            } 
        }
        
        Println("");
        
        
        
        
            if(input2.equalsIgnoreCase("insert the gold key")){
        Println("A wall moves from its place and reveals a pathway to the next floor.");
        }
        if(input2.equalsIgnoreCase("insert the silver key")){

            Println("A shelf spins from the other side of the wall just above the keyhole");
            halt(2);
            Println("ontop of the shelf is a small diary with a faded name on the front, in it on the last page is an entry");
            halt(3);
            Println("hastily scribbled in that reads: \"Servants vanish. Walls shift. Music plays in empty corridors. The west wing is colder now, even in summer. She walks there often. Alone. Laughing\"");

 halt(3);
 System.out.println("The diary is filled with useful info on the castles paths,+1 life.");
halt(3);
 game.lives++;
game.inventory.add("note3");
}
      
      
      
      
      
        Println();
        Println("Level 7: The Yellow Room");
        halt(1);
       
        Println("Through the passageway and up some stairs you find yourself in a weird room where everything inside painted yellow.");
        halt(2);
        Println("The walls whisper:\"There’s a one-story house in which everything is yellow. What color are the stairs?\"");
        halt(2);
        
        
        boolean success2 = false;
       while (!success2 && lives > 0) {
            Print("Enter your answer: ");
            String input3 = scan.nextLine();

            if (input3.equalsIgnoreCase("there are no stairs") || input3.equalsIgnoreCase("no stairs")) {
                Println();
                Println("The walls recede, revealing a vault that was hidden by the walls illusion");
                halt(2);
                
                
                success2 = true;
            } else {
                Println("The room begins to spin, and you lose a life.");
                lives--;

                if (lives > 0) {
                    Println();
                    Println("Try again. Lives remaining: " + lives);
                } else {
                    Println("Game over! You have no lives left.");
                }
            }
        }
        }
    }