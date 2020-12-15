package by.zhigarev.service;

import by.zhigarev.service.impl.ElectroDeviceServiceImpl;

public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private final ElectroDeviceService applianceService = new ElectroDeviceServiceImpl();

    private ServiceFactory() {}

    public ElectroDeviceService getApplianceService() {

        return applianceService;
    }

    public static ServiceFactory getInstance() {
        return instance;
    }


}
