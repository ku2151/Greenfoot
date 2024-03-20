import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.awt.Color;
/**
 * Write a description of class Laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laser extends Actor
{
    private boolean toRemove=false;
    private int vx=15;
    public void addedToWorld(World MyWorld)
    {
        GreenfootImage image=new GreenfootImage(80,10);
        image.setColor(Color.YELLOW);
        image.drawLine(0,5,image.getWidth()-1,5);
        setImage(image);
        
        
        
    }
    /**
     * Act - do whatever the Laser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       if(!toRemove){
           setLocation(getX()+vx,getY());
           Actor actor=getOneIntersectingObject(Enemy.class);
           if(actor!=null){
               ((Enemy)actor).Hancur();
           }
           if(getX()>getWorld().getWidth()+200)toRemove=true;
       }else{
           getWorld().removeObject(this);
       }
    }
}
