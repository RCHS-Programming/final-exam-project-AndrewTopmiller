import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class linebacker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class linebacker extends Actor
{
    private int Speed;
    public linebacker(int setSpeed)
    {
        Speed= setSpeed;
    }
    
    /**
     * Act - do whatever the linebacker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      move (Speed);
     if(isAtEdge())
     {
         setLocation( 25, getY());
         Speed = Speed + 1;
       }
    
   
     
     
    }
}
