package com.personal.cafecms.Repo;

import com.personal.cafecms.Entity.Dues;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DueRepo extends JpaRepository<Dues,Integer> {
}
