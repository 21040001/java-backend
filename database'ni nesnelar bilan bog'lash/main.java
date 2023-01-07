package hibernatePACKAGE;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class Main {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml").addAnnotatedClass(City.class).buildSessionFactory(); // clasimizni beramiz 
		
		Session session = factory.getCurrentSession(); // so'ro'v ishlarini bajarish uchun Session fabrikasini chaqiramiz
	
		try {
			session.beginTransaction(); //so'ro'vni boshlashimiz haqida malumot beradi dasturga
			
			List<City> cities = session.createQuery("from City").getResultList(); 
			
			for (City city:cities) {
				System.out.println(city.getName());
			}
			session.getTransaction().commit();//bu esa so'ro'vni tugatishimiz haqida malumot beradi dasturga
		}finally {factory.close(); // bu yerda factoryni tamomiyla yopamiz
			 }
		
	}

}
