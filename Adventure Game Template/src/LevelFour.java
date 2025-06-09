class LevelFour extends CastleofMysteries {
    CastleofMysteries game;
    LevelFour(CastleofMysteries game) {
        this.game = game;
    }
    public void play() {
       Println("do you: |Hurry past the mirror|, or |Smash it| to prevent its use.");
          
        String input2="";        
        
        boolean success = false;
       while (!success && lives > 0) {
            System.out.print("Enter your answer: ");
            String input = scan.nextLine();

            input2=input;
            if (input.equalsIgnoreCase("smash it") || input.equalsIgnoreCase("Hurry past the mirror")) {
                
                success = true;
            } 
        }
        
        Println("");
        
        
        
        
            if(input2.equalsIgnoreCase("Smash it")){
      
        }
        if(input2.equalsIgnoreCase("Smash it")){

            Println("You slam your fist into the mirror shattering it into pieces, the glass cutting your hands.");
            halt(2);
            Println("as the shards clatter to the ground you notice a small scrap of paper taped to the back of one of the large pieces that reads,");
            halt(3);
            Println("\"I tended her lessons. Sweet girl, strange girl. She drew maps of places no man had seen. Sometimes she\'d stop, tilt her head, and say, \"He/'s watching again.\" I asked who. She smiled. \"The one in the mirror. \"");

 halt(3);
 System.out.println("looking back at the shattered mirror you notice the sense of dread has dissapated +1 life");
halt(2);
Println("You move forward and head into the next room.");
 game.lives++;
game.inventory.add("note2");
}
      
      
      
      
      
        Println();
        Println("Level 4: The Creeky stairwell");
        Println();
        halt(1);
       
        Println("As you ascend the stairwell the steps groan beneath your feet.");
        halt(2);
        stairs();
        halt(2);
        Println("At the top, you find an inscription carved into the stone wall");
        halt(2);
        Println("\"What is full of holes but still holds water?\"");
        
        boolean success2 = false;
       while (!success2 && lives > 0) {
            Print("Enter your answer: ");
            String input3 = scan.nextLine();

            if (input3.equalsIgnoreCase("a sponge") || input3.equalsIgnoreCase("sponge")) {
                Println();
                Println("More steps slide out of the wall allowing you to continue upwards.");
                halt(2);
                Println("You keep ascending and head into the next room.");
                points+=10;
                success2 = true;
            } else {
                Println("The staircase begins to crumble, and you lose a life.");
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