package ioc;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigIt {

    @Bean(name="user")
    public User initUser(){
        User user = new User();
        user.setId(1L);
        user.setUserName("user_name_1");
        user.setNote("note1");
        return user;
    }
}
