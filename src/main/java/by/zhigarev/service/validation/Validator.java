package by.zhigarev.service.validation;

import by.zhigarev.entity.criteria.Criteria;

import java.util.Map;

public class Validator {

    public static boolean criteriaValidator(Criteria criteria) {

        for (Map.Entry<String, Object> entry : criteria.getCriteria().entrySet()) {
            if (entry.getKey() == null || entry.getValue() == null || entry.getKey().equals("") || entry.getValue().equals("")) {
                return false;
            }
        }
        return true;
    }
}
