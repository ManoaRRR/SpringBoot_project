package com.projetTrans.prjetTrans.controller;
import com.projetTrans.prjetTrans.model.Reservation;
import com.projetTrans.prjetTrans.repository.ReservationRepository;
import com.projetTrans.prjetTrans.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequiredArgsConstructor
@CrossOrigin
public class ReservationController {
    @Autowired
    private ReservationRepository reservation;

    @Autowired
    private ReservationService reservationservice;

    @GetMapping("/reservation")//operational**
    public List<Reservation> getAllreservation(){
        return reservation.findAll();
    }

    @GetMapping("/findReservationById/{id}")//operational**
    public Optional <Reservation> findReservationById(@PathVariable int id){
        return reservation.findById(id);
    }

    @DeleteMapping("/deleteReservation/{id}")//operational**
    public void deleteReservation (@PathVariable int id){
        reservation.deleteById(id);
    }

    @RequestMapping(value = "/updateReservation/{id}", method = RequestMethod.PUT)//operational**
    public void updateReservation(@RequestBody Reservation reservation, @PathVariable int id ){
        reservationservice.saveReservation(reservation);
    }

    //create reservation
    @PostMapping("/saveReservation")//operational**
    public Reservation savereservation(@Validated @RequestBody Reservation reservation){
        return reservationservice.saveReservation(reservation);
    }
}
