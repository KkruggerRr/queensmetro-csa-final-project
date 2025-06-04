public class LevelTwo extends TheCode{
    TheCode game;
    LevelTwo(TheCode game)
    {
        this.game = game;
    }

    /// ADDED THE PLAY 
    public void play() {
        Println("Level 2: Having answered correctly, the drawbridge lowers, and you step into the castle's courtyard. The air is heavy, filled with the scent of damp earth and old stone.");
       halt(1);
       Println();
        Println("A second voice rises from the shadows: \"I'm tall when I'm young, and I'm short when I'm old. What am I?\"");
  
boolean success2 = false;
       while (!success2 && lives > 0) {
            Print("Enter your answer: "); //the same for the response
            String input3 = scan.nextLine(); // also the same 

            if (input3.equalsIgnoreCase("a candle") || input3.equalsIgnoreCase("A candle")) { // the correct answer
                Println();
                Println("A path foward opens, leading into the castle"); // the prompt that leads to the next level 
                halt(2);
    
                success2 = true;

            } else { // for when the answer is wrong, no multiple choice 
                Println("Shadows in the courtyard seem to grow closer, and you lose a life."); // LOSING LIFE, for when wrong 
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