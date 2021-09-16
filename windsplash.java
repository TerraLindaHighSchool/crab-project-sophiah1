import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class windsplash here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class windsplash extends World
{

    /**
     * Constructor for objects of class windsplash.
     * 
     */
    public windsplash()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        aligator aligator = new aligator();
        addObject(aligator,94,378);
        pizza pizza = new pizza();
        addObject(pizza,503,300);
        pizza pizza2 = new pizza();
        addObject(pizza2,386,235);
        pizza pizza3 = new pizza();
        addObject(pizza3,127,261);
        pizza pizza4 = new pizza();
        addObject(pizza4,277,342);
        pizza pizza5 = new pizza();
        addObject(pizza5,95,144);
        pizza pizza6 = new pizza();
        addObject(pizza6,245,177);
        pizza pizza7 = new pizza();
        addObject(pizza7,188,60);
        pizza pizza8 = new pizza();
        addObject(pizza8,514,203);
        pizza pizza9 = new pizza();
        addObject(pizza9,348,140);
        pizza pizza10 = new pizza();
        addObject(pizza10,316,62);
        dolphin dolphin = new dolphin();
        addObject(dolphin,487,67);
        dolphin.setLocation(446,52);
        aligator aligator2 = new aligator();
        addObject(aligator2,442,373);
        aligator2.setLocation(472,365);
        aligator2.setLocation(508,378);
        aligator2.setLocation(434,384);
        aligator2.setLocation(81,33);
        aligator2.setLocation(107,12);
        aligator2.setLocation(104,23);
        pizza pizza11 = new pizza();
        addObject(pizza11,416,364);
        pizza pizza12 = new pizza();
        addObject(pizza12,265,261);
        pizza pizza13 = new pizza();
        addObject(pizza13,62,325);
        pizza pizza14 = new pizza();
        addObject(pizza14,56,218);
        pizza7.setLocation(178,88);
    }
}
