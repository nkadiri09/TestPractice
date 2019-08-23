package com.foobar.foo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foobar.foo.domain.Company;

@Repository
public interface BarRepository extends JpaRepository<Company, Long> {

	Company getById(int id);

}