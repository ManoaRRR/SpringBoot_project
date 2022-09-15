package com.projetTrans.prjetTrans.repository;

import com.projetTrans.prjetTrans.model.Chauffeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;

import java.util.List;
import java.util.Optional;

public interface ChauffeurRepository extends JpaRepository <Chauffeur, Integer> {

}
