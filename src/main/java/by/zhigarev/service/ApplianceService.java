package by.zhigarev.service;

import by.zhigarev.entity.Appliance;
import by.zhigarev.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceService {
    List<Appliance> find(Criteria criteria);
}
