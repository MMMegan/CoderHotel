import java.util.HashMap;
import java.util.Map;

public abstract class TimeSubject {
    protected Map<String,Clock> clocks =new HashMap<String,Clock>();

    public void attach(String cityName,Clock clock){
        clocks.put(cityName,clock);
    }

    public void detach(String cityName){
        clocks.remove(cityName);
    }

    public abstract void notifyAllClocks();
}
