package service.impl;

import base.service.impl.BaseServiceImpl;
import domain.Passenger;
import repository.PassengerRepository;
import service.PassengerService;

public class PassengerServiceImpl extends BaseServiceImpl<Passenger, Long, PassengerRepository>
        implements PassengerService {

    public PassengerServiceImpl(PassengerRepository repository) {
        super(repository);
    }

    @Override
    public Passenger findByUsername(String username) {

        if (username != null && !username.isBlank()) {

            try {

                return repository.findByUsername(username);

            } catch (Exception e) {

                return null;

            }

        } else
            return null;

    }

}
