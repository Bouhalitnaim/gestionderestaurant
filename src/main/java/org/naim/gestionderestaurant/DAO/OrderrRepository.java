package org.naim.gestionderestaurant.DAO;



import org.naim.gestionderestaurant.entity.Orderr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OrderrRepository extends JpaRepository<Orderr,Long> {
}
