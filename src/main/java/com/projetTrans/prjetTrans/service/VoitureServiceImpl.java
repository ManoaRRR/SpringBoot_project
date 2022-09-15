package com.projetTrans.prjetTrans.service;
import com.projetTrans.prjetTrans.model.Voiture;
import com.projetTrans.prjetTrans.repository.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoitureServiceImpl implements VoitureService{
    @Autowired
    private VoitureRepository voiturerepository;

    @Override
    public Voiture saveVoiture(Voiture voiture){
        return voiturerepository.save(voiture);
    }
}
