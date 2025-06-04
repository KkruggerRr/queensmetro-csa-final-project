

public class Pregame extends TheCode {

        private TheCode game;

        public Pregame(TheCode game) {
        this.game = game;
    }

        public void play() {
        
        
        String input2 ="";
        
            Println("do you: .Head towards the moat., or .investigate. a statue of a carrige off to the side");
            
        
        
        
         boolean success = false;
       while (!success && lives > 0) {
            System.out.print("Enter your answer: ");
            String input = scan.nextLine();
input2=input;
            if (input.equalsIgnoreCase("Head towards the moat") || input.equalsIgnoreCase("investigate")) {
                
                success = true;
            } 
        }
        
        
        
        
        
        
        
            
        if(input2.equalsIgnoreCase("Head towards the moat")){
        }
        if(input2.equalsIgnoreCase("investigate")){

            Println("you walk towards a statue of a Carrige....");

 halt(3);

System.out.println("Upon closer inspection, you notice theres a small message crudely carved into one of the wheels of the stone carrige that reads,");
halt(2);
System.out.println("\"They say the castle was built atop a graveyard of forgotten kings. Not ours—older, deeper.");
halt(2);
System.out.print("Stone coffins sealed with symbols no scholar could name. The foundation cursed before the first stone was laid.\"");
 System.out.println(" The message makes you a bit more cautious of your surroundings,+1 life. You move forward towards the moat.");
halt(3);
 game.lives++;
game.inventory.add("note1");
}
}
}
