package com.prasad.Repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prasad.model.Product;

@Transactional
@Repository
public interface Reposiory extends JpaRepository<Product, Long> {

}
