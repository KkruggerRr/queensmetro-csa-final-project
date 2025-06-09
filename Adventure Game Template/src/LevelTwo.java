public class LevelTwo extends CastleofMysteries{
    CastleofMysteries game;
    LevelTwo(CastleofMysteries game)
    {
        this.game = game;
    }

   

    /// ADDED THE PLAY 
    public void play() {
       Println();
        Println("Level 2: The Courtyard");
       halt(1);
       Println();
       Println("Having answered correctly, the drawbridge lowers, and you step into the castle's courtyard. The air is heavy, filled with the scent of damp earth and old stone.");
      halt(2);
       courtyard();
       halt(2);
       Println("A second voice rises from the shadows:\"I'm tall when I'm young, and I'm short when I'm old. What am I?\"");
  
boolean success2 = false;
       while (!success2 && lives > 0) {
            Print("Enter your answer: "); //the same for the response
            String input3 = scan.nextLine(); // also the same 

            if (input3.equalsIgnoreCase("a candle") || input3.equalsIgnoreCase("candle")) { // the correct answer
                Println();
                Println("A path foward opens, leading into the castle"); // the prompt that leads to the next level 
                halt(2);
    points+=10;
                success2 = true;
points+=10;
            } else { // for when the answer is wrong, no multiple choice 
                Println("Shadows in the courtyard seem to grow closer, you lose a life and some points."); // LOSING LIFE, for when wrong 
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