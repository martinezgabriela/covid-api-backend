package com.dev.software.devsoftware.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.software.devsoftware.models.FavoriteHospital;

import java.util.List;

public interface FavoriteHospitalRepository extends JpaRepository<FavoriteHospital, Long>{

    List<FavoriteHospital> findAll();
}
