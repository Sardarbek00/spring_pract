package org.example;

import org.example.model.Passport;
import org.example.model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

//       User user =new User();
//       user.setId(3);
//       user.setName("Marat");
//       user.setLastName("lastName");
//        Passport passport=new Passport();
//        passport.setId(2L);
//        passport.setName("foreign passport");
//        passport.setUniqueNumber(23);
//        user.setPassport(passport);
//        System.out.println(user);
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("containerConfig.xml");
        User user=context.getBean("marat", User.class);
        System.out.println(user);
    }
}
