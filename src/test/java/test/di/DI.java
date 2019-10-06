package test.di;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ActiveProfiles("dev")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Config.class})
public class DI {
    @Autowired
    A a ;

    @Test
    public void test(){
        a.show();
    }
//    public static void main(String[] args) {
//        //创建Spring的容器
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//        A a = context.getBean(A.class);
//        a.show();
//        context.close();
//    }
}
