import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dolphin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dolphin extends Actor
{   /**
     * Act - do whatever the dolphin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(3);
        turnAtEdge();
        checkKeyPress();
        onCollision();
    }
    private void turnAtEdge()
    { 
        if(isAtEdge())
        
        {
            turn(50);
        }
    }
        
    private void checkKeyPress()
    {
        if(Greenfoot.isKeyDown("right"))
        
        {
         turn(4);
        }
    
        if(Greenfoot.isKeyDown("left"))
        {
        turn(-4);
        }
      
            
    }   
    
    // Check for collisions with other objects private void onCollision()
    private void onCollision()
    {
         if(isTouching(pizza.class))
         {
              removeTouching(pizza.class);
              Greenfoot.playSound("chewing.mp3");
              // Winning the game
              if(getWorld().getObjects(pizza.class).size()==0)
            {
               Greenfoot.setWorld(new youwin3());
               Greenfoot.playSound("yay.mp3");
               Greenfoot.stop();
            }
        }
    
        if(isTouching(aligator.class))
        {
         Greenfoot.playSound("scream.mp3");
         Greenfoot.stop();
         Greenfoot.setWorld(new gameover());
         
        }
    }

}


