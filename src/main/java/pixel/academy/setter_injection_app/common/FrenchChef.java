package pixel.academy.setter_injection_app.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class FrenchChef implements Chef {
    @Override
    public String getDailyRecipe() {
        return "Preparez boeuf bourgignon avec des legumes.";
    }

    public FrenchChef() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
}
