package by.zhigarev.dao;

import by.zhigarev.dao.impl.AppliaceDAOImpl;

public class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private final AppliaceDAO applianceDAO = new AppliaceDAOImpl();

    private DAOFactory() {}

    public AppliaceDAO getApplianceDAO() {
        return applianceDAO;
    }

    public static DAOFactory getInstance() {
        return instance;
    }

}
