package feetarcestimation.service.config;

import java.util.HashMap;
import java.util.Map;

public class ShoeSizes {
    protected Map<Double, Double> menShoeSize = new HashMap<Double, Double>(){{
        put(7.0, 24.4);
        put(7.5, 24.8);
        put(8.0, 25.2);
        put(8.5, 25.7);
        put(9.0, 26.0);
        put(9.5, 26.5);
        put(10.0, 26.8);
        put(10.5, 27.3);
        put(11.0, 27.8);
        put(11.5, 28.3);
        put(12.0, 28.6);
        put(13.0, 29.4);
    }};
    protected Map<Double, Double> womenShoeSize = new HashMap<Double, Double>(){{
        put(6.0, 22.5);
        put(6.5, 23.0);
        put(7.0, 23.5);
        put(7.5, 23.8);
        put(8.0, 24.0);
        put(8.5, 24.6);
        put(9.0, 25.0);
        put(9.5, 25.4);
        put(10.0, 25.9);
        put(10.5, 26.2);
        put(11.0, 26.7);
    }};
    public Map<Double, Double> getMenShoeSizes(){
        return this.menShoeSize;
    }
    public Map<Double, Double> getWomenShoeSizes(){
        return this.womenShoeSize;
    }
}
