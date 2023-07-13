import com.org.strategy.Duck;
import com.org.strategy.impl.FlyRocketPowered;
import com.org.strategy.impl.MallardDuck;
import com.org.strategy.impl.ModelDuck;

public class StrategyMiniDuckSimilatorMain {
    public static void main(String[] args){

        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.display();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck.display();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck.display();

    }
}
