package kz.aptekaplus.repository;

import kz.aptekaplus.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;


@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {

    List<Product> findByNameStartingWith(String temp);
}
