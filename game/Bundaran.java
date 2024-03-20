import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.awt.Color;
/**
 * Write a description of class Bundaran here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bundaran extends Actor
{
    private int jeda=5;
    public void addedToWorld(World MyWorld)
{
    GreenfootImage image = new GreenfootImage(100, 100); // Create a new GreenfootImage
    setImage(image); // Set the image to the newly created GreenfootImage
    getImage().setColor(Color.RED);
    getImage().fillOval(20, 20, getImage().getWidth() - 41, getImage().getHeight() - 41);
}
    /**
     * Act - do whatever the Bundaran wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(jeda>0)jeda--;
        else getWorld().removeObject(this);
    }
}
