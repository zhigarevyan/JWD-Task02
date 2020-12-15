package by.zhigarev.dao;

import by.zhigarev.entity.Appliance;
import by.zhigarev.entity.criteria.Criteria;

import java.io.IOException;
import java.util.List;

public interface AppliaceDAO {
    List<Appliance> find(Criteria criteria) throws IOException;
}
