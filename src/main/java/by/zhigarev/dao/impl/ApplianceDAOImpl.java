package by.zhigarev.dao.impl;

import by.zhigarev.dao.ApplianceDAO;
import by.zhigarev.entity.Appliance;
import by.zhigarev.entity.Factory;
import by.zhigarev.entity.criteria.Criteria;
import by.zhigarev.entity.TypesOfDevice;
import by.zhigarev.util.ApplianceFileReader;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplianceDAOImpl implements ApplianceDAO {
    private ApplianceFileReader reader;
    private Factory factory;

    public ApplianceDAOImpl()  {
        factory = new Factory();
    }

    @Override
    public List<Appliance> find(Criteria criteria) throws IOException {
        reader = new ApplianceFileReader();

        List<Map<String, Object>> applianceParamsList = reader.getParamsList(criteria);
        List<Appliance> devices = factory.getApplianceList(applianceParamsList);

        return devices;
    }



}
