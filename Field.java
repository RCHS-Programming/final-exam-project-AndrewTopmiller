import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Field here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Field extends World
{

    /**
     * Constructor for objects of class Field.
     * 
     */
    public Field()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(325, 150, 3); 
        addObject( new endZone(), 15, 75);
        addObject( new linebacker(), 15, 75);
    }
}
