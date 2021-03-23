/*
 * @file RandomNumber.java
 * @authors Alessandro Parrino, Daniel Sciarra
 * @date 20.03.2021
 */

package utils;

import java.util.Random;

public class RandomNumber {
    public static int randomInt(int min, int max) {
        if(max < min || (min == 0 && max == 0))
            throw new IllegalArgumentException("Illegal interval");
        Random r = new Random();
        int randomNumber;
        do {
            randomNumber = r.nextInt((max - min) + 1) + min;
        } while(randomNumber == 0);
        return randomNumber;
    }
}
