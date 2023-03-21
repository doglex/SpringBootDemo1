package ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class testIoc {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigIt.class);
        User user = ctx.getBean(User.class);
        System.out.println(user.getUserName());
    }
}
