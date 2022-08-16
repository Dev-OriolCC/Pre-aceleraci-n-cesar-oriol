package com.example.disney.repository;

import com.example.disney.entity.Character;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Integer>, JpaSpecificationExecutor<Character> {
    List<Character> findAll(Specification<Character> spec);
}
