package com.projetTrans.prjetTrans.controller;
import com.projetTrans.prjetTrans.model.Voyage;
import com.projetTrans.prjetTrans.repository.VoyageRepository;
import com.projetTrans.prjetTrans.service.VoyageService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@RestController
@RequiredArgsConstructor
@CrossOrigin
public class VoyageController {
    @Autowired
    private VoyageRepository voyagerepository;

    @Autowired
    private VoyageService voyageservice;

    @GetMapping("/voyage")//operational**
    public List<Voyage> getAllTravel(){
        return voyagerepository.findAll();
    }

    @GetMapping("/findVoyage/{id}")//operational**
    public Optional<Voyage> getTravelById(@PathVariable int id){
        return voyagerepository.findById(id);
    }

    @DeleteMapping("/deleteVoyage/{id}")//operational**
    public void deleteVoyageById(@PathVariable int id){
         voyagerepository.deleteById(id);
    }

    @RequestMapping (value = "/updateVoyage/{id}", method = RequestMethod.PUT)//operational**
    public void updateVoyage(@RequestBody Voyage voyage, @PathVariable int id){
        voyageservice.saveVoyage(voyage);
    }

    @PostMapping("/saveVoyage")//operational**
    public Voyage saveVoyage(@Validated @RequestBody Voyage voyage){
        return voyageservice.saveVoyage(voyage);
    }
}
