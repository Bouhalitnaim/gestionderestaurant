package org.naim.gestionderestaurant.DAO;


import org.naim.gestionderestaurant.entity.Itemm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ItemmRepository extends JpaRepository<Itemm,Long> {
}
