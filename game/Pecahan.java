import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pecahan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pecahan extends Actor
{
    public int vx=0,vy=0;
    public Pecahan(GreenfootImage img)
    {
        GreenfootImage image=new GreenfootImage(10,10);
        image.drawImage(img,-Greenfoot.getRandomNumber(img.getWidth()),-Greenfoot.getRandomNumber(img.getHeight()));
        setImage(image);
    }
    public void addedToWorld(World MyWorld)
    {
        vx=-5+Greenfoot.getRandomNumber(10);
        vy=-5+Greenfoot.getRandomNumber(10);
        int rot=-5+Greenfoot.getRandomNumber(20);
        setRotation(getRotation()+rot);
        if(vx==0)vx=1;
        if(vy==0)vy=1;
    }
   
    
    public void act()
    {
        setLocation(getX()+vx,getY()+vy);
        
        if(getX()<-200 || getY()<-200 || getX()>getWorld().getWidth()+200 || getY()>getWorld().getHeight()+200){
            getWorld().removeObject(this);
        }
    }
}
