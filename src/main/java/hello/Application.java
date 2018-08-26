package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.authentication.encoding.LdapShaPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        LdapShaPasswordEncoder encoder = new LdapShaPasswordEncoder();

        String rawPass = "benpassword";
        String salt = "@#%AS%&DF_=PJ}{EB23+42342*()*^%$)_(*%^)";
        String res = encoder.encodePassword(rawPass, salt.getBytes());
        System.out.println("res:"+res);
//        boolean valid = encoder.isPasswordValid(res, rawPass, "aasd@#$@3");
//        Assert.assertTrue(valid);



    }

}