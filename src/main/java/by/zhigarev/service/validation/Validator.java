package by.zhigarev.service.validation;

import by.zhigarev.entity.criteria.Criteria;
import by.zhigarev.entity.criteria.SearchCriteria;

public class Validator {

    static boolean isValid = true;

    public static boolean criteriaValidator(Criteria criteria) {
        criteria.getCriteria().forEach((key, value) ->
                {
                    if (value == null) {
                        isValid = false;
                    }
                }
        );

        if (!isValid) {
            isValid = true;
            return false;
        } else {
            return isValid;
        }
    }



}
