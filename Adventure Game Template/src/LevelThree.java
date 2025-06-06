class LevelThree extends TheCode {
     TheCode game;
    LevelTwo(TheCode game)
    {
        this.game = game;
    }

    /// ADDED THE PLAY 
    public void play() {
        Println("Level 3:  The Grand Hall The castle doors creak open, revealing a grand hall filled with flickering chandeliers and faded tapestries. ");
       halt(1);
       Println();
        Println("As you step forward, a question appears, etched in golden letters: \"What month of the year has 28 days?\"");
  
boolean success2 = false;
       while (!success2 && lives > 0) {
            Print("Enter your answer: "); //the same for the response
            String input3 = scan.nextLine(); // also the same 

            if (input3.equalsIgnoreCase("all of them") || input3.equalsIgnoreCase("All of them")) { // the correct answer
                Println();
                Println("A secret door opens, leading to the next area, while passing through you see a mirror hung on the wall, discarded from the glamorous grand hall, for some reason it fills you with dread. "); // the prompt that leads to the next level 
                halt(2);
    
                success2 = true;

            } else { // for when the answer is wrong, no multiple choice 
                Println("The chandeliers flicker violently, and you lose a life."); // LOSING LIFE, for when wrong 
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
