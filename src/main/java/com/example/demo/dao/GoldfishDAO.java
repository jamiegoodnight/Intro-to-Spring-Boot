package com.example.demo.dao;

import com.example.demo.model.Goldfish;

import java.util.UUID;

public interface GoldfishDAO {

    int insertGoldfish(UUID id, Goldfish goldfish);

    default int addGoldfish(Goldfish goldfish){
        UUID id = UUID.randomUUID();
        return insertGoldfish(id, goldfish)
    }
}