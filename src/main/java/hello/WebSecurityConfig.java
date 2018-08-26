package hello;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import org.hibernate.jpamodelgen.xml.jaxb.Persistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.authentication.encoding.LdapShaPasswordEncoder;


import java.io.FileInputStream;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .anyRequest().fullyAuthenticated()
                .and()
                .formLogin();
    }
}

//    @Override
//    public void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth
//                .ldapAuthentication()
//                .userDnPatterns("uid={0},ou=otherpeople")
//
//                .groupSearchBase("ou=groups")
//                .contextSource()
//                .url("ldap://localhost:12345/dc=springframework,dc=org")
//                .and()
//                .passwordCompare()
////                .passwordEncoder(new LdapShaPasswordEncoder())
//                .passwordAttribute("userPassword");
//
//
//
//
//
//    }
//
//
////    @Override
////    protected void configure2(AuthenticationManagerBuilder auth) throws Exception {
////	/*	auth.inMemoryAuthentication()
////		.withUser("admin").password("admin").roles("USER","ADMIN");
////		auth.inMemoryAuthentication()
////		.withUser("user").password("user").roles("USER");
////	*/
////
////
////        auth.jdbcAuthentication()
////                .dataSource(dataSource)
////                .usersByUsernameQuery("select login as principal,	mot_de_passe as credentials,active from secretaire where login=?")
////                .authoritiesByUsernameQuery("select login as principal, role as role from user_role where login=?")
////                .rolePrefix("ROLE_");
////    }
//
//
//}