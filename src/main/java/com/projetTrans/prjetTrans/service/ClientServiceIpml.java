package com.projetTrans.prjetTrans.service;
import com.projetTrans.prjetTrans.model.Client;
import com.projetTrans.prjetTrans.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceIpml implements ClientService {
    @Autowired
    private ClientRepository clientrepository;

    @Override
    public Client saveClient(Client client) {
        return clientrepository.save(client);
    }
}
