import greenfoot.*; 

public class Score extends Actor
{
    public static int score;
    public Score(){
        score = 0;
    }
    public void act(){
        World myWorld = getWorld();
        GreenfootImage textImage = new GreenfootImage("Score: "+ score, 36, Color.BLACK, Color.WHITE);
        getWorld().getBackground().drawImage(textImage, 10,10);
        Font font = new Font("Arial", true,true, 30);
    }
    
    public static void add(int num){
        score+=num;
 } 
}