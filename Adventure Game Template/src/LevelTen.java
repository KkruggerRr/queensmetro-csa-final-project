class LevelTen extends CastleofMysteries {
    CastleofMysteries game;
    LevelTen(CastleofMysteries game) {
        this.game = game;
    }
    public void play() {
        Println("do you: |Descend| into the shadowy servants' passage beneath the stairs, or |Ascend| the grand staircase directly to the peak of the castle.");
          
        String input2="";        
        
        boolean success = false;
       while (!success && lives > 0) {
            System.out.print("Enter your answer: ");
            String input = scan.nextLine();

            input2=input;
            if (input.equalsIgnoreCase("descend") || input.equalsIgnoreCase("ascend")) {
                
                success = true;
            } 
        }
        
        Println("");
        
        
        
        
            if(input2.equalsIgnoreCase("ascend")){
        Println("");
        }
        if(input2.equalsIgnoreCase("descend")){

            Println("You go down the small passageway beneath the stairs and find a small room that has cleaning equipment ans supplies.");
            halt(2);
            Println("you find a small room with a lit candle and a note left on a desk, crinkled and slightly charred that read,");
            halt(3);
            Println("\"I hear her laugh when I sleep. Not the haunting kind. The real one. I remember it. I cling to it. And still, I sent them all away—those who questioned the west wing. I let her grow up in that cursed place. The castle is mine. The guilt is mine. Let it rot with me." + "-King Alden");

 halt(3);
 System.out.println("After inspecting more there is nothing else of interest, you take a gold bar for good luck +1 life");
halt(2);
Println("You move forward and head into the next room.");
 game.lives++;
game.inventory.add("note5");
}
      
      
      
      
      
        Println();
        Println("Level 10: The Spire");
        Println();
        halt(1);
       
        Println("Finally, you reach the top of the tower.");
        halt(2);
        peak();
        halt(2);
        Println("The wind howls, and the final question emerges from the void");
        halt(2);
        Println("\"What can’t talk but will reply when spoken to?\"");
        
        boolean success2 = false;
       while (!success2 && lives > 0) {
            Print("Enter your answer: ");
            String input3 = scan.nextLine();

            if (input3.equalsIgnoreCase("an echo") || input3.equalsIgnoreCase("echo")|| input3.equalsIgnoreCase("a echo")) {
                Println();
                Println("The window opens revealing the courtyard below");
                
                points+=10;
                success2 = true;
            } else {
                Println("The floors tilt steeply and slide back down the stairs and lose a life.");
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
        
    
