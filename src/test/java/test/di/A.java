package test.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class A {
    @Autowired
    @Qualifier("B")
    private IB b;

    public void show(){
        System.out.println(b.show());
    }
}
