package repository.Impl;

import base.repository.impl.BaseRepositoryImpl;
import domain.Passenger;
import repository.PassengerRepository;
import util.HibernateUtil;

public class PassengerRepositoryImpl extends BaseRepositoryImpl<Passenger, Long>
        implements PassengerRepository {


    public PassengerRepositoryImpl() {
        super(HibernateUtil.getEntityManager());
    }

    @Override
    public Class<Passenger> getClassType() {
        return Passenger.class;
    }
}
