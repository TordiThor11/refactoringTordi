package oop2.tp3.ejercicio2;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class Recaudacion {
    public static final String COMPANY_NAME = "company_name";
    public static final String CITY = "city";
    public static final String STATE = "state";
    public static final String ROUND = "round";
    private CSVHelper csvHelper;
    private List<String[]> data;

    public Recaudacion(CSVHelper csvHelper){
        this.csvHelper = csvHelper;
    }
    public List<Map<String, String>> where(Map<String, String> options) throws IOException {
        data = csvHelper.readCSV();

        if (options.containsKey(COMPANY_NAME)) {
            data = filter((fila) -> fila[1].equals(options.get(COMPANY_NAME)));
        }

        if (options.containsKey(CITY)) {
            data = filter((fila) -> fila[4].equals(options.get(CITY)));
        }

        if (options.containsKey(STATE)) {
            data = filter((fila) -> fila[5].equals(options.get(STATE)));
        }

        if (options.containsKey(ROUND)) {
            data = filter((fila) -> fila[9].equals(options.get(ROUND)));
        }

        List<Map<String, String>> output = transformToListOfHashMap();
        return output;
    }

    private List<Map<String, String>> transformToListOfHashMap() {
        List<Map<String, String>> output = new ArrayList<Map<String, String>>();

        for (int i = 0; i < data.size(); i++) {
            Map<String, String> mapped = new HashMap<String, String>();
            mapped.put("permalink", data.get(i)[0]);
            mapped.put(COMPANY_NAME, data.get(i)[1]);
            mapped.put("number_employees", data.get(i)[2]);
            mapped.put("category", data.get(i)[3]);
            mapped.put(CITY, data.get(i)[4]);
            mapped.put(STATE, data.get(i)[5]);
            mapped.put("funded_date", data.get(i)[6]);
            mapped.put("raised_amount", data.get(i)[7]);
            mapped.put("raised_currency", data.get(i)[8]);
            mapped.put(ROUND, data.get(i)[9]);
            output.add(mapped);
        }
        return output;
    }

    private List<String[]> filter(Predicate<String[]> predicate){
        List<String[]> results = new ArrayList<String[]>();
        for (String[] fila : data) {
            if (predicate.test(fila)) {
                results.add(fila);
            }
        }
        return results;
    }

}
