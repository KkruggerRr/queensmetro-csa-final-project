public class Ending extends CastleofMysteries{
   private CastleofMysteries game;

        public Ending(CastleofMysteries game) {
        this.game = game;
    }   
public void play(){
    boolean hasnote1 = false;
    boolean hasnote2 = false;
    boolean hasnote3 = false;
    boolean hasnote4 = false;
    boolean hasnote5 = false;

for(int i=0;i< game.inventory.size(); i++){
if(game.inventory.get(i).equals("note1")){
hasnote1=true;
}
if(game.inventory.get(i).equals("note2")){
hasnote2=true;
}
if(game.inventory.get(i).equals("note3")){
hasnote3=true;
}
if(game.inventory.get(i).equals("note4")){
hasnote4=true;
}
if(game.inventory.get(i).equals("note5")){
hasnote5=true;
}
}

if(hasnote1&&hasnote2&&hasnote3&&hasnote4&&hasnote5&&points>=70){
Println("You peer out of it and see multiple shadowy white figure that all look up at you with smiles on their faces");
halt(2);
Println("In unison, they thank you and dissapate into the mist.");
halt(2);
Println("you revealed the truth of the castle and freed all of the trapped spirits.");
halt(2);
Println("The mist around the castle starts to fade away and you see the sunrise start to rise over the horizon.");
halt(2);
Println("Congratulations, you finished our game!");
halt(2);
Println("You got " + points + " points you did great!");
halt(2);
Println();

Println("Made by Christian Cabrera & Jennifer Sibri");
}
else{
Println("You peer out of it and see the empty courtyard below you feel a sense of emptiness and fear.");
halt(2);
Println("There has to be something you missed, some information or something.");
halt(2);
Println("Would you like to try again?");
halt(2);
Println("You got " + points + " you might not have done so well..");
Println(); 
Println("Made by Christian Cabrera & Jennifer Sibri");
}

}
}
