package by.zhigarev.util;

import by.zhigarev.entity.TypesOfDevice;
import by.zhigarev.entity.criteria.Criteria;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplianceFileReader {
    private static final String filePath = "appliances_db.txt";
    private static final String COLON = ":";
    private static final String COMMA = ",";
    private static final String EQUAL_SIGN = "=";
    private static final String TYPE = "type";

    private final BufferedReader reader;

    public ApplianceFileReader() throws FileNotFoundException {
        this.reader = new BufferedReader(new FileReader(filePath));
    }

    public List<Map<String, Object>> getParamsList(Criteria criteria) throws IOException {
        Map<String, Object> paramsMap;
        List<Map<String, Object>> resultList = new ArrayList<>();

        String line = reader.readLine();
        while (line != null) {
            if (checkLine(line, criteria)) {
                paramsMap = splitLineToParams(line);
                resultList.add(paramsMap);
            }
            line = reader.readLine();
        }
        return resultList;
    }

    private boolean checkLine(String line, Criteria criteria) {
        boolean result = false;
        Map<String, Object> params;

        if (line.contains(criteria.getGroupSearchName())) {
            params = splitLineToParams(line);
            for (String paramToSearch : criteria.getKeys()) {
                Object a = params.get(paramToSearch);
                Object b = criteria.get(paramToSearch);
                if (params.get(paramToSearch).equals(criteria.get(paramToSearch))) {
                    result = true;
                } else {
                    return false;
                }
            }
        }
        return result;

    }

    private Map<String, Object> splitLineToParams(String line) {
        Map<String, Object> resultMap = new HashMap<>();

        String[] params = line.split(COLON);
        TypesOfDevice type = TypesOfDevice.valueOf(params[0].trim());

        resultMap.put(TYPE, type);

        for (String param : params[1].split(COMMA)) {
            String[] result = param.split(EQUAL_SIGN);
            resultMap.put(result[0].trim(), result[1].trim());
        }
        return resultMap;
    }
}
