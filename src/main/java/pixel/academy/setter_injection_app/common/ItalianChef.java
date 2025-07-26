package pixel.academy.setter_injection_app.common;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
public class ItalianChef implements Chef {

    @Override
    public String getDailyRecipe() {
        return "Prepare pasta al pomodoro with fresh tomatoees and basil.";
    }
}
