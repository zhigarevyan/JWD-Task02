package by.zhigarev.entity.criteria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Criteria {

    private String groupSearchName;
    private Map<String, Object> criteria = new HashMap<String, Object>();

    public Criteria(String groupSearchName) {
        this.groupSearchName = groupSearchName;
    }

    public String getGroupSearchName() {
        return groupSearchName;
    }

    public void add(String searchCriteria, Object value) {
        criteria.put(searchCriteria, value);
    }

    public String get(String key){
        return criteria.get(key).toString();
    }

    public List<String> getKeys(){
        return new ArrayList<String>(criteria.keySet());
    }

    public Map<String,Object> getCriteria(){
        return criteria;
    }


}
