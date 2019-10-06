package test.di;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("B")
@Profile("dev")
public class B implements IB{
    @Override
    public String show() {
        return "B show()";
    }
}
