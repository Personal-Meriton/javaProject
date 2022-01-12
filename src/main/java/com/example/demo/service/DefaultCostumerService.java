package com.example.demo.service;

import com.example.demo.pojo.entity.Costumer;
import com.example.demo.pojo.input.CostumerInput;
import com.example.demo.repository.CostumerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DefaultCostumerService implements CostumerService {

    @Autowired
    private CostumerRepository costumerRepository;

    @Override
    public List<Costumer> findAll() {
        return costumerRepository.findAll();
    }

    @Override
    public Costumer findCostumerById(Integer id) {
        if (id == null) {
            return null;
        }
        return costumerRepository.findCostumerById(id);
    }

    @Override
    public Costumer save(CostumerInput costumerInput) {
        String newName = costumerInput.getName();
        String newSurname = costumerInput.getSurname();
        Integer newAge = costumerInput.getAge();
        String newEmail = costumerInput.getEmail();
        String newPhone = costumerInput.getPhone();
        String newDrln = costumerInput.getDrln();



        Costumer costumer = new Costumer();
        costumer.setName(newName);
        costumer.setSurname(newSurname);
        costumer.setAge(newAge);
        costumer.setEmail(newEmail);
        costumer.setPhone(newPhone);
        costumer.setDrln(newDrln);


        return costumerRepository.save(costumer);
    }

    @Override
    public Costumer update(Costumer costumer, CostumerInput costumerInput) {
        String newName = costumerInput.getName();
        String newSurname = costumerInput.getSurname();
        Integer newAge = costumerInput.getAge();
        String newEmail = costumerInput.getEmail();
        String newPhone = costumerInput.getPhone();
        String newDrln = costumerInput.getDrln();

        costumer.setName(newName);
        costumer.setSurname(newSurname);
        costumer.setAge(newAge);
        costumer.setEmail(newEmail);
        costumer.setPhone(newPhone);
        costumer.setDrln(newDrln);

        return costumerRepository.save(costumer);
    }

    @Override
    public void delete(Integer id) {
        costumerRepository.deleteById(id);
    }

}
