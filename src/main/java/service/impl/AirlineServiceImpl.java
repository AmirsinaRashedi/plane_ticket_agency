package service.impl;

import base.service.impl.BaseServiceImpl;
import domain.Airline;
import repository.AirlineRepository;
import service.AirlineService;

public class AirlineServiceImpl extends BaseServiceImpl<Airline, Long, AirlineRepository>
        implements AirlineService {

    public AirlineServiceImpl(AirlineRepository repository) {
        super(repository);
    }

    @Override
    public Airline findByName(String name) {

        if (name != null && !name.isBlank()) {

            try {

                return repository.findByName(name);

            } catch (Exception e) {

                return null;

            }


        } else
            return null;


    }

}
