package org.naim.gestionderestaurant;

import org.naim.gestionderestaurant.DAO.CustomerRepository;
import org.naim.gestionderestaurant.DAO.ItemmRepository;
import org.naim.gestionderestaurant.DAO.OrderrRepository;
import org.naim.gestionderestaurant.entity.Customer;
import org.naim.gestionderestaurant.entity.Itemm;
import org.naim.gestionderestaurant.entity.Orderr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class GestionDeRestaurantApplication implements CommandLineRunner {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ItemmRepository itemmRepository;

    @Autowired
    private OrderrRepository orderrRepository;

    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;

    public static void main(String[] args) {
        SpringApplication.run(GestionDeRestaurantApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        repositoryRestConfiguration.exposeIdsFor(Customer.class, Orderr.class);

        customerRepository.save(new Customer(null, "Olivia Kathleen", null));
        customerRepository.save(new Customer(null, "Liam Patrick", null));
        customerRepository.save(new Customer(null, "Charlotte Rose", null));
        customerRepository.save(new Customer(null, "Elijah Burke", null));
        customerRepository.save(new Customer(null, "Ayesha Ameer", null));
        customerRepository.save(new Customer(null, "Eva Louis", null));



        itemmRepository.save(new Itemm(null,"Chicken Tenders",3.50,null));
        itemmRepository.save(new Itemm(null,"Chicken Tenders w/ Fries",4.99,null));
        itemmRepository.save(new Itemm(null,"Chicken Tenders w/ Onion",5.99,null));
        itemmRepository.save(new Itemm(null,"Grilled Cheese Sandwich",2.50,null));
        itemmRepository.save(new Itemm(null,"Grilled Cheese Sandwich w/ Fries",3.99,null));
        itemmRepository.save(new Itemm(null,"Grilled Cheese Sandwich w/ Onion",4.99,null));
        itemmRepository.save(new Itemm(null,"Soup",1.99,null));
        itemmRepository.save(new Itemm(null,"Onion Rings",2.50,null));
        itemmRepository.save(new Itemm(null,"Fries",2.99,null));
        itemmRepository.save(new Itemm(null,"Sweet Potato Fries",1.99,null));
        itemmRepository.save(new Itemm(null,"Chicken Tenders",2.49,null));
        itemmRepository.save(new Itemm(null,"Sweet Tea",1.79,null));
        itemmRepository.save(new Itemm(null,"Botttle Water",1.00,null));
        itemmRepository.save(new Itemm(null,"Canned Drinks",1.00,null));







    }
}
