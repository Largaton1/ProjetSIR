package fr.istic.taa.jaxrs;
import fr.istic.taa.jaxrs.dao.*;
import fr.istic.taa.jaxrs.domain.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class JpaTest {


	private EntityManager manager;

	/* public JpaTest(EntityManager manager) {
		this.manager = manager;
	} */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/* 	EntityManager manager = EntityManagerHelper.getEntityManager();

		JpaTest test = new JpaTest(manager);

		EntityTransaction tx = manager.getTransaction();
		tx.begin(); */

		
		try {

			Administrateur admin = new Administrateur();
			AdministrateurDao daoAdmin = new AdministrateurDao();
            admin.setNom("Jean");
			admin.setEmail("jean@example.com");
			admin.setPassword("12345678");
			daoAdmin.save(admin);
            

            Organisateur organisateur = new Organisateur();
			 OrganisateurDao daoOrganisateur = new OrganisateurDao();
             organisateur.setNom("kone event");
			 organisateur.setEmail("largaton@example.com");
			 organisateur.setPassword("12345678");
             daoOrganisateur.save(organisateur);
		
			// Evenement event = new Evenement();
			// EvenementDao dao = new EvenementDao();
			// event.setNomEvent("Concert Geant");
			// event.setCapacite(10);
			// event.setAdministrateur(admin);
            // event.setOrganisateur(organisateur);
			// dao.save(event);




			/* Administrateur admin = new Administrateur();
			Organisateur organisateur = new Organisateur();
			Client client = new Client();
			Evenement event = new Evenement();
			Ticket ticket = new Ticket(); */
			/* EntityManagerHelper.getEntityManager().persist(admin);
			EntityManagerHelper.getEntityManager().persist(organisateur);
			EntityManagerHelper.getEntityManager().persist(event);
			EntityManagerHelper.getEntityManager().persist(ticket);
			EntityManagerHelper.getEntityManager().persist(client); */

			// TODO create and persist entity
		} catch (Exception e) {
			e.printStackTrace();
		}
		/* tx.commit();

			
   	 manager.close();
		EntityManagerHelper.closeEntityManagerFactory();
		System.out.println(".. done"); */
	}




}
