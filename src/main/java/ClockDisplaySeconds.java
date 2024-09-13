package src.main.java;


public class ClockDisplaySeconds
{
    private NumberDisplay seconds;
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String display;
    
    //Extend ClockDisplaySeconds to include a seconds field.
    public ClockDisplaySeconds(){
        seconds = new NumberDisplay(60);
        updateDisplay();
    }
    
     public ClockDisplaySeconds(int hour, int minute, int second){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        setTime(hour, minute, second);
    }
    
    
    public void secondsTimeTick(){
        seconds.increment();
        if (seconds.getValue() == 0){
            minutes.increment();
        }
        
        if (minutes.getValue() == 0){
            hours.increment();
        }
        
        
        updateDisplay();
    }
    
    //Implement a method setTime that takes in 2 parameters, hour and minute
    //The method should set the hours value and minutes value
    //The updateDisplay method should be called before finishing
    public void setTime(int hour, int minute, int second){
        minutes.setValue(minute);
        hours.setValue(hour);
        seconds.setValue(second);
        
        updateDisplay();
    }
    //Implement a method getTime that takes no parameter and returns a String
    //The return String should be formatted as HH:MM and report out the current time
    public String getTime(){
        return display;
    }
    //Implement a method updateDisplay that takes no parameters and returns nothing
    //The method should update the displayString with the current time in a format
    //  HH:MM
    public void updateDisplay(){
        String output = "";
        
        output = hours.getDisplayValue();
        output = output + ":";
        output = output + minutes.getDisplayValue();
        output = output + ":";
        output = output + seconds.getDisplayValue();
        
        
        display = output;
    }
    //Update all methods and parameters to accomodate this change
}
