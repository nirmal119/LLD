package com.sept2024.parkinglot.repositories;

import com.sept2024.parkinglot.models.Gate;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GateRepository {
    private Map<Long, Gate> gateMap = new HashMap<>();

    public Optional<Gate> findGateById(long id) {
        if(gateMap.containsKey(id)) {
            return Optional.of(gateMap.get(id));
        }
        return Optional.empty();
    }
}
