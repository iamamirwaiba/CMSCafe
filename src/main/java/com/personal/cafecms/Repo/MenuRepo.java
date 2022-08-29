package com.personal.cafecms.Repo;

import com.personal.cafecms.Entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepo extends JpaRepository<Menu,Integer> {
}
