package by.zhigarev.service.impl;

import by.zhigarev.dao.DAOFactory;
import by.zhigarev.dao.ApplianceDAO;
import by.zhigarev.entity.Appliance;
import by.zhigarev.entity.criteria.Criteria;
import by.zhigarev.service.ApplianceService;
import by.zhigarev.service.validation.Validator;

import java.io.IOException;
import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {

    @Override
    public List<Appliance> find(Criteria criteria) {
        if (!Validator.criteriaValidator(criteria)) {
            return null;
        }

        DAOFactory factory = DAOFactory.getInstance();
        ApplianceDAO applianceDAO = factory.getApplianceDAO();

        List<Appliance> appliance = null;
        try {
            appliance = applianceDAO.find(criteria);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // you may add your own code here

        return appliance;
    }

}
