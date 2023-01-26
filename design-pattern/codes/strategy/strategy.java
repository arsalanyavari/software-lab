public interface Strategy {
    public void doAlgorithm();
}

public class StrategyA implements Strategy {
    public void doAlgorithm() {
        // A strategy impelementation
    }
}

public class StrategyB implements Strategy {
    public void doAlgorithm() {
        // B strategy impelementation
    }
}

public class StrategyC implements Strategy {
    public void doAlgorithm() {
        // C strategy impelementation
    }
}

public abstract class Object {
    Strategy strategy;

    public Object() {}

    public void setStrategy(Strategy behavior) {
        strategy = behavior;
    }

    public void performStrategy() {
        strategy.doAlgorithm();
    }
}
