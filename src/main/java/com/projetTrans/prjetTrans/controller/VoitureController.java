package com.projetTrans.prjetTrans.controller;
import com.projetTrans.prjetTrans.model.Voiture;
import com.projetTrans.prjetTrans.repository.VoitureRepository;
import com.projetTrans.prjetTrans.service.VoitureService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class VoitureController {
    @Autowired
    private VoitureRepository voiture;
    @Autowired
    private VoitureService voitureservice;

    @GetMapping("/car")//operational**
    public List<Voiture>getAllvoiture(){
        return voiture.findAll();
    }

    @GetMapping("/findCarById/{id}")//operational**
    public Optional<Voiture> findCarById(@PathVariable int id){
        return voiture.findById(id);
    }

    @DeleteMapping("/deleteCar/{id}")//operational**
    public void getVoitureById(@PathVariable int id){
        voiture.deleteById(id);
    }

    @RequestMapping(value = "/updateCar/{id}", method = RequestMethod.PUT)//operational**
    public void updateVoiture(@RequestBody Voiture voiture, @PathVariable int id ){
        voitureservice.saveVoiture(voiture);
    }

    @PostMapping("/saveVoiture")//operational**
    public Voiture saveVoiture(@Validated @RequestBody Voiture voiture){
        return voitureservice.saveVoiture(voiture);
    }
}
