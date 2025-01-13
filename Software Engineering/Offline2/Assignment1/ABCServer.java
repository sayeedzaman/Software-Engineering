import java.util.List;
import java.util.ArrayList;

public class ABCServer implements Subject {
    private List<Observer> observers;
    private int previousState;
    private int currentState;

    public ABCServer() {
        observers = new ArrayList<>();
        currentState = 1;
    }

    public void setCurrentState(int currentState) {
        previousState = this.currentState;
        this.currentState = currentState;

        notifyAllObservers();

        return ;
    }

    public int getPreviousState() {
        return previousState;
    }

    public int getCurrentState() {
        return currentState;
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
        return ;
    }

    @Override
    public boolean detach(String name) {
        int index = -1;

        for(int i=0; i<observers.size(); i++) {
            if(name.equalsIgnoreCase(observers.get(i).getName())) {
                index = i;
            }
        }

        if(index == -1) {
            return false;
        } else {
            observers.remove(observers.get(index));
            return true;
        }
    }

    @Override
    public void notifyAllObservers() {
        for(Observer observer: observers) {
            observer.notifyObserver();
        }

        return ;
    }
    public int getListSize() {
        return observers.size();
    }

    public Observer getUser(int index) {
        return observers.get(index);
    }
}