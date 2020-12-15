package by.zhigarev.main;

import by.zhigarev.entity.Appliance;
import by.zhigarev.entity.criteria.Criteria;
import by.zhigarev.entity.criteria.SearchCriteria;
import by.zhigarev.entity.impl.Oven;
import by.zhigarev.entity.impl.TabletPC;
import by.zhigarev.service.ApplianceService;
import by.zhigarev.service.ServiceFactory;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Appliance> appliance;

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        //////////////////////////////////////////////////////////////////

        Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());//"Oven"
        criteriaOven.add(SearchCriteria.Oven.CAPACITY.toString(), 33);

        appliance = service.find(criteriaOven);

        for(Appliance e : appliance){
            System.out.println(e);
        }


        //////////////////////////////////////////////////////////////////

        criteriaOven = new Criteria(Oven.class.getSimpleName());
        criteriaOven.add(SearchCriteria.Oven.HEIGHT.toString(), 40);
        criteriaOven.add(SearchCriteria.Oven.DEPTH.toString(), 60);

        appliance = service.find(criteriaOven);

        for(Appliance e : appliance){
            System.out.println(e);
        }

        //////////////////////////////////////////////////////////////////

        Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
        criteriaTabletPC.add(SearchCriteria.TabletPC.COLOR.toString(), "blue");
        criteriaTabletPC.add(SearchCriteria.TabletPC.DISPLAY_INCHES.toString(), 14);
        criteriaTabletPC.add(SearchCriteria.TabletPC.MEMORY_ROM.toString(), 8000);

        appliance = service.find(criteriaTabletPC);// find(Object...obj)

        for(Appliance e : appliance){
            System.out.println(e);
        }
    }

}
