package com.projetTrans.prjetTrans.service;

import com.projetTrans.prjetTrans.model.Voyage;
import com.projetTrans.prjetTrans.repository.VoyageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoyageServiceImpl implements VoyageService{
    @Autowired
    private VoyageRepository voyagerepository;

    public Voyage saveVoyage(Voyage voyage){
        return  voyagerepository.save(voyage);
    }
}
