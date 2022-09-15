package com.projetTrans.prjetTrans.service;
import com.projetTrans.prjetTrans.model.Chauffeur;
import com.projetTrans.prjetTrans.repository.ChauffeurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class ChauffeurServiceImpl implements ChauffeurService{
    @Autowired
    private ChauffeurRepository chauffeurrepository;

    @Override
    public Chauffeur saveChauffeur (Chauffeur chauffeur){
        return chauffeurrepository.save(chauffeur);
    }

}
