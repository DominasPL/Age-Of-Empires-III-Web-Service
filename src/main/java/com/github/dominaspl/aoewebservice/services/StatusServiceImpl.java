package com.github.dominaspl.aoewebservice.services;

import com.github.dominaspl.aoewebservice.entities.Status;
import com.github.dominaspl.aoewebservice.repositories.StatusRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusServiceImpl implements StatusService {

    private StatusRepository statusRepository;

    public StatusServiceImpl(StatusRepository statusRepository) {
        this.statusRepository = statusRepository;
    }

    @Override
    public List<Status> getAllStatuses() {

        List<Status> allStatuses = statusRepository.findAll();

        if (allStatuses == null) {
            throw new IllegalStateException("Statuses not found!");
        }

        return allStatuses;
    }


}
