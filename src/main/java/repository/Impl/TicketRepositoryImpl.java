package repository.Impl;

import base.repository.impl.BaseRepositoryImpl;
import domain.Ticket;
import repository.TicketRepository;
import util.HibernateUtil;

public class TicketRepositoryImpl extends BaseRepositoryImpl<Ticket, Long>
        implements TicketRepository {


    public TicketRepositoryImpl() {
        super(HibernateUtil.getEntityManager());
    }

    @Override
    public Class<Ticket> getClassType() {
        return Ticket.class;
    }
}
