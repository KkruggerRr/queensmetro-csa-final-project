public class LevelThree extends CastleofMysteries{
CastleofMysteries game;
    LevelThree(CastleofMysteries game)
    {
        this.game = game;
    }


    /// ADDED THE PLAY
    public void play() {
        Println();
        Println("Level 3: The Grand Hall"); 
       halt(1);
       Println();
       Println("The castle doors creak open, revealing a grand hall filled with flickering chandeliers and faded tapestries.");
       halt(2); 
       grandhall();
       halt(2);
       Println("As you step forward, a question appears, etched in golden letters: \"What month of the year has 28 days?\"");
 
boolean success2 = false;
       while (!success2 && lives > 0) {
            Print("Enter your answer: "); //the same for the response
            String input3 = scan.nextLine(); // also the same


            if (input3.equalsIgnoreCase("all of them") || input3.equalsIgnoreCase("All")) { // the correct answer
                Println();
                Println("A secret door opens, leading to the next area, while passing through you see a mirror hung on the wall, discarded from the glamorous grand hall."); // the prompt that leads to the next level
                halt(2);
                Println("For some reason it fills you with dread...");
                success2 = true;
points+=10;

            } else { // for when the answer is wrong, no multiple choice
                Println("The chandeliers flicker violently, you lose a life and some points."); // LOSING LIFE, for when wrong
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
   
    
