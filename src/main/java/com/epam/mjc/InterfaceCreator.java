package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return nums -> {
            List<Integer> result = new ArrayList<>();
            for (Integer num : nums) {
                if (num % divider == 0) result.add(num / divider);
            }
            return result;
        };
    }
}
