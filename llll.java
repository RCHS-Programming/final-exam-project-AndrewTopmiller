import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class llll here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class llll extends Actor
{
    public int lives;
    public int score;
    public llll()
    {
        lives = 3;
        score = 0;
    }
    /**
     * Act - do whatever the llll wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         if( Greenfoot.isKeyDown("up") )
         {
             setLocation( getX(), getY() - 4);
             
         }
          if( Greenfoot.isKeyDown("down") )
         {
             setLocation( getX(), getY() + 4);
             
         }
          if( Greenfoot.isKeyDown("right") )
         {
             setLocation( getX()+ 4, getY());
             
         }
          if( Greenfoot.isKeyDown("left") )
         {
             setLocation( getX()- 4, getY());
             
         }
         if(isTouching(linebacker.class))
         {
            setLocation( 300, 75);
            lives = lives - 1;
            ((Field)getWorld()).resetLinebackers();
            
         }
         if(isTouching(endZone.class))
         {
            setLocation( 300, 75);
            score = score + 1;
            ((Field)getWorld()).resetLinebackers();
           
            
         }
         if(lives == 0)
         {
             getWorld(). addObject( new gameover(), 170, 81);
             
         }
         if(score == 4)
         {
             getWorld(). addObject( new winner(), 170, 81);
         }
         
    }
}
