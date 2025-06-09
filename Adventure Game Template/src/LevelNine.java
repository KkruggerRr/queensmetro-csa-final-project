class LevelNine extends CastleofMysteries {
    CastleofMysteries game;
    LevelNine(CastleofMysteries game) {
        this.game = game;
    }
    public void play() {
        Println("do you: |Investigate the riches|, or |Pass through quickly|.");
          
        String input2="";        
        
        boolean success = false;
       while (!success && lives > 0) {
            System.out.print("Enter your answer: ");
            String input = scan.nextLine();

            input2=input;
            if (input.equalsIgnoreCase("Investigate the riches") || input.equalsIgnoreCase("Pass through quickly")) {
                
                success = true;
            } 
        }
        
        Println("");
        
        
        
        
            if(input2.equalsIgnoreCase("Pass through quickl")){
        Println("you move through the vault looking away from the alluring riches and head into the next room.");
        }
        if(input2.equalsIgnoreCase("Investigate the riches")){

            Println("While searching you accidentally knock over some gold bars and one manages to land on your foot,");
            halt(2);
            Println("while you recover from the pain you notice a note that was beneath the bars that read");
            halt(3);
            Println("\"The Queen labored three days. No doctor could explain how the child lived. No breath at first—then a cry that cracked every lantern in the hall. The priest who baptized her went blind the next morning.\" ");

 halt(3);
 System.out.println("After inspecting more there is nothing else of interest, you take a gold bar for good luck +1 life");
halt(2);
Println("You move forward and head into the next room.");
 game.lives++;
game.inventory.add("note4");
}
      
      
      
      
      
        Println();
        Println("Level 9: The throne Room");
        Println();
        halt(1);
       
        Println("You find youself in a grand large throne room thats covered in dust, a sign of lost glory and what once was");
        halt(2);
        chair();
        halt(2);
        Println("Suddenly a voice echoes:\"I have branches, but no fruit, trunk, or leaves. What am I?\"");
        halt(2);
        
        
        boolean success2 = false;
       while (!success2 && lives > 0) {
            Print("Enter your answer: ");
            String input3 = scan.nextLine();

            if (input3.equalsIgnoreCase("a family tree") || input3.equalsIgnoreCase("family tree")) {
                Println();
                Println("The throne slides aside, revealing a hidden staircase.");
                halt(2);
                Println("There is a small passageway to the side of the staircase that goes down, it looks like it was used by servants once.");
                points+=10;
                success2 = true;
            } else {
                Println("The room begins to fill with darkness, and you lose a life.");
                lives--;
points-=pl();
                if (lives > 0) {
                    Println();
                    Println("Try again. Lives remaining: " + lives);
                } else {
                    game.endGame();
                }
            }
        }
       
        }
    }