package com.mkyong.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mkyong.dao.BaseballCardRepository;
import com.mkyong.model.BaseballCard;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    BaseballCardRepository cardrepository;

    BaseballCard CarmenPerez = new BaseballCard();
    BaseballCard FernandoMtz = new BaseballCard();
    BaseballCard VictorDaniel = new BaseballCard();

    public void addCards() {
        CarmenPerez.setName("Carmen");
        CarmenPerez.setYear(24);
        CarmenPerez.setRarityLevel("Secundaria");

        cardrepository.save(CarmenPerez);

        FernandoMtz.setName("Fernando");
        FernandoMtz.setYear(26);
        FernandoMtz.setRarityLevel("Primaria");

        cardrepository.save(FernandoMtz);

        VictorDaniel.setName("Victor Daniel");
        VictorDaniel.setYear(25);
        VictorDaniel.setRarityLevel("Licenciatura");

        cardrepository.save(VictorDaniel);

        System.out.println("Cards have been added : " + cardrepository.findAll());

    }
}
