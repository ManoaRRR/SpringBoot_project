package com.projetTrans.prjetTrans.service;

import com.projetTrans.prjetTrans.model.Reservation;
import com.projetTrans.prjetTrans.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements ReservationService{
    //save opertion
    @Autowired
    private ReservationRepository reservationrepository;

    @Override
    public Reservation saveReservation(Reservation reservation){
        return reservationrepository.save(reservation);
    }
}
