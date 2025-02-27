package com.pmo.demo;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class LargestEx {
    public static Integer largest() {

        Integer[] numbers = {56, 27, 128, 465, 8565};

        Integer largest = Arrays.stream(numbers)
                .reduce(Integer::max)
                .orElse(null);
        return largest;
    }

}
