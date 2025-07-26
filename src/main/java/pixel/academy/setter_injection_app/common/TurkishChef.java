package pixel.academy.setter_injection_app.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class TurkishChef implements Chef {
    @Override
    public String getDailyRecipe() {
        return "Lulea kebab";
    }

    public TurkishChef() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

}
