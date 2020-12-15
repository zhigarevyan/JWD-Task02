package by.zhigarev.dao;

import by.zhigarev.dao.impl.ElectroDeviceDAOImpl;
import by.zhigarev.entity.ElectroDevice;

public class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private final ElectroDeviceDAO applianceDAO = new ElectroDeviceDAOImpl();

    private DAOFactory() {}

    public ElectroDeviceDAO getApplianceDAO() {
        return applianceDAO;
    }

    public static DAOFactory getInstance() {
        return instance;
    }

}
