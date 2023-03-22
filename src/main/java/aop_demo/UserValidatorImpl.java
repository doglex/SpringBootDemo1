package aop_demo;

import org.springframework.stereotype.Component;

//@Component
public class UserValidatorImpl implements UserValidator{

    @Override
    public boolean validate(User user) {
        System.out.println("引入的新的接口" + UserValidator.class.getSimpleName());
        return user != null && user.getId() != null;
    }
}
