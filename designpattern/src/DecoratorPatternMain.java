import com.org.decorator.Beverage;
import com.org.decorator.impl.DarkRoast;
import com.org.decorator.impl.Espresso;
import com.org.decorator.impl.addons.Mocha;
import com.org.decorator.impl.addons.Whip;

public class DecoratorPatternMain {

    public static void main (String[] args){
        System.out.println("Hello! I am Decorator design pattern.");

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
       
    }
}
