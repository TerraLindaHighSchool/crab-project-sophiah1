import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class aligator here.
 * 
 * @Sophia Hobie 
 * @09/09/21
 */
public class aligator extends Actor
{
    /**
     * Act - do whatever the aligator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(3);
        turnAtEdge();
      
    }  
     
    
    private void turnAtEdge()
    { 
        if(isAtEdge())
        
        {
            turn(50);
        }
    }   
}   

