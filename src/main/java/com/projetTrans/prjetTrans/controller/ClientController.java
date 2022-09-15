package com.projetTrans.prjetTrans.controller;
import com.projetTrans.prjetTrans.model.Client;
import com.projetTrans.prjetTrans.repository.ClientRepository;
import com.projetTrans.prjetTrans.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class ClientController {
    @Autowired
    private ClientRepository client;
    @Autowired
    private ClientService clientservice;

    @GetMapping("/client")//operational***
    public List<Client> getAllClient(){
        return client.findAll();
    }

    @GetMapping("/clientCount")//operational**
    public Long numberOfClient(){
        return client.count();
    }

    @GetMapping("/findClientById/{id}")//operational**
    public Optional<Client> getClientById(@PathVariable int id){
        return client.findById(id);
    }

    @DeleteMapping("/deleteClientById/{id}")//operational**
    public void deleteById(@PathVariable int id){
         client.deleteById(id);
    }

    @RequestMapping(value = "/updateClient/{id}", method = RequestMethod.PUT)//operational**
    public void updateClient(@RequestBody Client clientt,@PathVariable int id){
        clientservice.saveClient(clientt);
    }

    @PostMapping("/saveClient")//operational***
    public Client saveClient(@Validated  @RequestBody Client client){
        return clientservice.saveClient(client);
    }

}
