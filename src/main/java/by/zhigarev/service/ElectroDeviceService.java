package by.zhigarev.service;

import by.zhigarev.entity.ElectroDevice;
import by.zhigarev.entity.criteria.Criteria;

import java.util.List;

public interface ElectroDeviceService {
    List<ElectroDevice> find(Criteria criteria);
}
