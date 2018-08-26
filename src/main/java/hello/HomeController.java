package hello;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

@RestController
public class HomeController {

    @GetMapping("/")
    public String index() {




//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        String userName = auth.getName();
//        String password = (String)auth.getCredentials();
//        System.out.println(userName+"----+++++++++-----"+password);
//
//        /**************************/
//
//        String serverIP = "localhost";
//        String serverPort = "12345";
//        String serverLogin = "uid=admin,dc=springframework,dc=org";
//        String serverPass = "secret";
//
//
//        Hashtable<String,String> env = new Hashtable<String,String>();
//        env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
//        env.put(Context.PROVIDER_URL, "ldap://localhost:12345");
//        env.put(Context.SECURITY_AUTHENTICATION, "simple");
//        env.put(Context.SECURITY_PRINCIPAL, serverLogin );
//        env.put(Context.SECURITY_CREDENTIALS, "secret");
//
//        try {
//            DirContext ctx = new InitialDirContext(env);
//            System.out.println("Connexion au serveur : OK");
//
//            try {
//
//                Attributes attrs = ctx.getAttributes("uid=bob,ou=people,dc=springframework,dc=org");
//                System.out.println("Recuperation de Nom Prenom: OK");
//
//                System.out.println("+++++++++++++++++++++++"+attrs.get("sn"));
//                System.out.println("+++++++++++++++++++++++"+attrs.get("manager"));
////                System.out.println(attrs.get("name"));
////                System.out.println(attrs.get("mail"));
////                System.out.println(attrs.get("department"));
//            } catch (NamingException e) {
//                System.out.println("Recuperation de  Nom Prenom: KO");
//                e.printStackTrace();
//            }
//        } catch (NamingException e) {
//            System.out.println("Connexion au serveur : KO");
//            e.printStackTrace();
//        }
//
//
//
//
//
///*******************************/
//




        return "Welcome to the home page!";
    }
}