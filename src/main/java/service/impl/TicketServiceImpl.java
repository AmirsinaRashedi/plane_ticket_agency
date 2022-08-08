package service.impl;

import base.service.impl.BaseServiceImpl;
import domain.Passenger;
import domain.Ticket;
import repository.TicketRepository;
import service.TicketService;

import java.util.List;

public class TicketServiceImpl extends BaseServiceImpl<Ticket, Long, TicketRepository>
        implements TicketService {

    public TicketServiceImpl(TicketRepository repository) {
        super(repository);
    }

    @Override
    public List<Ticket> getByPassenger(Passenger passenger) {

        if (passenger != null) {

            try {

                return repository.getByPassenger(passenger);

            } catch (Exception e) {

                return null;

            }

        } else
            return null;

    }
}
