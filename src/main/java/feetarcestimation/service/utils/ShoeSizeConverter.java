package feetarcestimation.service.utils;

import feetarcestimation.service.config.ShoeSizes;

import java.util.HashMap;
import java.util.Map;

public class ShoeSizeConverter {
    public double convertToCm(double shoeSize, String gender){
        ShoeSizes shoeSizes = new ShoeSizes();
        switch (gender) {
            case "f":
                return shoeSizes.getWomenShoeSizes().get(shoeSize);
            case "m":
                return shoeSizes.getMenShoeSizes().get(shoeSize);
        }
        return 0.0;
    }
}
