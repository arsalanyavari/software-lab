public interface Component {
    void methodA();
    void methodB();
}

public class ConcreteComponent implements Component {

    @Override public void methodA() {
        // put your function body :D
    }
    @Override public void methodB() {
        // put your function body :D
    }
}

public abstract class Decorator implements Component {
    protected Component component;

    public component(Component c) {
        this.component = c;
    }

    public void methodA() { component.methodA(); }
    public void newBehavior() { 
        // blob blob blob
    }
}

