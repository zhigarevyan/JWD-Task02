package by.zhigarev.dao;

import by.zhigarev.entity.ElectroDevice;
import by.zhigarev.entity.criteria.Criteria;

import java.io.IOException;
import java.util.List;

public interface ElectroDeviceDAO {
    List<ElectroDevice> find(Criteria criteria) throws IOException;
}
