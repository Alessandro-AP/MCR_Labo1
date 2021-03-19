package utils;

import java.util.Random;

public class RandomNumber {
        public static int randomInt(int min, int max) {
            Random r = new Random();
            return r.nextInt((max - min) + 1) + min;
        }
    }
