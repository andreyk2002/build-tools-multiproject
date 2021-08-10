package org.gradle.utils;

import gradle.jar.lib.utils.StringUtils;

import java.util.Arrays;

public class Utils {
    public boolean isAllPositiveNumbers(String ... strings){
        StringUtils stringUtils = new StringUtils();
        return Arrays.stream(strings).allMatch(stringUtils::isPositiveNumber);
    }
}
