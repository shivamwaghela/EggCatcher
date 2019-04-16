import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * implementation for SwitchModeButton
 */
public class SwitchModeButton extends Button
{
    GreenfootImage switchButtonImage = new GreenfootImage("switchModeButton.png");
    GreenfootImage switchButtonPressedImage = 
    new GreenfootImage("switchModeButtonPressed.png");
    
    private boolean mouseDown;
    
    public SwitchModeButton(){
        setImage(switchButtonImage);
        mouseDown = false;
    }
    
    public void act() 
    {
        if (!mouseDown && Greenfoot.mousePressed(this)) {    
            setImage(switchButtonPressedImage);
            mouseDown = true; // here
        }    
        if (mouseDown && Greenfoot.mouseClicked(this)) {                
            setImage(switchButtonImage);
            mouseDown = false; 
            
            //add also the methods you want to execute here;  
        }
    }    
}