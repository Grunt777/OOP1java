
/**
 * The NumberDisplay class represents a digital number display that can hold
 * values from zero to a given limit. The limit can be specified when creating
 * the display. The values range from zero (inclusive) to limit-1. If used,
 * for example, for the seconds on a digital clock, the limit would be 60, 
 * resulting in display values from 0 to 59. When incremented, the display 
 * automatically rolls over to zero when reaching the limit.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 2011.07.31
 */
public class NumberDisplay
{
    private int limit;
    private int valuemin;  //minuten
    private int valuehour; // uren

    /**
     * Constructor for objects of class NumberDisplay.
     * Set the limit at which the display rolls over.
     */
    public NumberDisplay(int rollOverLimit)
    {
        limit = rollOverLimit;
        valuemin = 0;
        valuehour = 0;
    }

    /**
     * Return the current value.
     */
    public int getValuemin()
    {
        return valuemin;
    }

  
   public int getValuehour()
   {
    return valuehour;
   }
    
    /**
     * Return the display value (that is, the current value as a two-digit
     * String. If the value is less than ten, it will be padded with a leading
     * zero).
     */
    public String getDisplayValuemin()
    {
        if(valuemin < 10) {
            return "0" + valuemin;
        }
        else {
            return "" + valuemin;
        }
    }

    
     public String getDisplayValuehour()
    {
        if (valuehour == 0){
            return "12";
        }   
        else if (valuehour < 10) {
            return "0" + valuehour;
        }
        else {
            return "" + valuehour;
        }
    }
    
    
    /**
     * Set the value of the display to the new specified value. If the new
     * value is less than zero or over the limit, do nothing.
     */
    public void setValuemin(int replacementValue)
    {
        if((replacementValue >= 0) && (replacementValue < limit)) {
            valuemin = replacementValue;
        }
    }

    
       public void setValuehour(int replacementValue)
    {
        if((replacementValue >= 0) && (replacementValue < limit)) {
            valuehour = replacementValue;
        }
    }
    
    
    /**
     * Increment the display value by one, rolling over to zero if the
     * limit is reached.
     */
    public void increment()
    {
        valuemin = (valuemin + 1) % limit;
        valuehour = (valuehour + 1) % limit;
    }

}
