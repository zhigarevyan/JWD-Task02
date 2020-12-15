package by.zhigarev.service.impl;

import by.zhigarev.dao.DAOFactory;
import by.zhigarev.dao.ElectroDeviceDAO;
import by.zhigarev.entity.ElectroDevice;
import by.zhigarev.entity.criteria.Criteria;
import by.zhigarev.service.ElectroDeviceService;
import by.zhigarev.service.validation.Validator;

import java.io.IOException;
import java.util.List;

public class ElectroDeviceServiceImpl implements ElectroDeviceService {

    @Override
    public List<ElectroDevice> find(Criteria criteria) {
        if (!Validator.criteriaValidator(criteria)) {
            return null;
        }

        DAOFactory factory = DAOFactory.getInstance();
        ElectroDeviceDAO applianceDAO = factory.getApplianceDAO();

        List<ElectroDevice> appliance = null;
        try {
            appliance = applianceDAO.find(criteria);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // you may add your own code here

        return appliance;
    }

}
