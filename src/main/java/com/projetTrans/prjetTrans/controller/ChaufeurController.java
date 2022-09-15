package com.projetTrans.prjetTrans.controller;
import com.projetTrans.prjetTrans.model.Chauffeur;
import com.projetTrans.prjetTrans.repository.ChauffeurRepository;
import com.projetTrans.prjetTrans.service.ChauffeurService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@RestController
@RequiredArgsConstructor
@CrossOrigin
public class ChaufeurController {
    @Autowired
    private ChauffeurRepository chauffeur;

    @Autowired
    private ChauffeurService chauffeurservice;

    @GetMapping("/driver")//operational***
    public List<Chauffeur> getAllChauffeur(){
        return chauffeur.findAll();
    }

    @GetMapping("/driverByID/{id}")//operational***
    public Optional<Chauffeur> getDriverById(@PathVariable int id){
        return chauffeur.findById(id);
    }

    @DeleteMapping("/deleteChauffeur/{id}")//operational**
    public void deleteChauffeur(@PathVariable int id){
        chauffeur.deleteById(id);
    }

    @RequestMapping(value = "/saveDriver/{id}", method = RequestMethod.PUT)//operational**
    public void updateChauffeur(@RequestBody Chauffeur chauffeur,@PathVariable int id ){
         chauffeurservice.saveChauffeur(chauffeur);
    }
    @PostMapping("/saveDriver")//operational***
    public Chauffeur saveChauffeur(@Validated @RequestBody Chauffeur chauffeur){
        return chauffeurservice.saveChauffeur(chauffeur);
    }
}
