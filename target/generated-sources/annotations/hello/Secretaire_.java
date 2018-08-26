package hello;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Secretaire.class)
public abstract class Secretaire_ {

	public static volatile SingularAttribute<Secretaire, String> motDePasse;
	public static volatile ListAttribute<Secretaire, Role1> roleu;
	public static volatile SingularAttribute<Secretaire, Integer> tel;
	public static volatile SingularAttribute<Secretaire, String> login;
	public static volatile SingularAttribute<Secretaire, String> nom;
	public static volatile SingularAttribute<Secretaire, String> prenom;
	public static volatile SingularAttribute<Secretaire, String> email;

}

