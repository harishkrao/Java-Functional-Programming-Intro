
public class alarm {
    public static void main(String args[])
    {
        
    }
    public boolean beep()
    {
        boolean beep_sound = true;
        return beep_sound;
    }
    public void alarm()
    {
        boolean on = true;
        
        
    }
    public int checkAlarm(int button)
    {
        if(button == 0 || button == 1)
            return button;
        else
            return -1; 
    } 
}