package com.ashish.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashish.dto.ListOfString;

public interface SaveDataRepository extends JpaRepository<ListOfString, Integer> {

}
