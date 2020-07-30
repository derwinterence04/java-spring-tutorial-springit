package com.derwin.springit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.derwin.springit.model.Link;

public interface LinkRepository extends JpaRepository<Link, Long>{

}
