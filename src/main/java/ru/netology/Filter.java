package ru.netology;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        int counter = 0;
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (int valueSource : source) {
            if (valueSource < treshold) {
                logger.log("Элемент \"" + valueSource + "\" не проходит");
            } else {
                counter++;
                logger.log("Элемент \"" + valueSource + "\" проходит");
                result.add(valueSource);
            }
        }
        logger.log("Прошло фильтр " + counter + " элемента из " + treshold);
        return result;
    }
}