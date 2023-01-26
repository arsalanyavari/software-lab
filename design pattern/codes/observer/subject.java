import java.util.ArrayList;
import java.util.List;

public class Subject {

   private List<Observer> observers = new ArrayList<Observer>();
   private int args;
   
    public void registerObserver(Observer o) {
        observers.add(o);
    }
    
    public void removeObserver(Observver o) {
        int i = observers.indexOf(o);
        if (i >= 0)
            observers.remove(i);
    }
    
    public void notifyObservers() {
        for(Observer observer : observers) {
            observers.update(arg);
        }
    }
    
    public void setParams(int arg) {
        this.arg = arg;
        this.notifyObservers();
    }
}
