package org.lucky.classes.wrapper;

public class AllWrapperClassesExample {
    public static void main(String[] args) {
        // Boolean
        Boolean boolObj = Boolean.valueOf(true);
        boolean boolValue = boolObj.booleanValue();

        // Character
        Character charObj = Character.valueOf('A');
        char charValue = charObj.charValue();

        // Byte
        Byte byteObj = Byte.valueOf((byte) 127);
        byte byteValue = byteObj.byteValue();

        // Short
        Short shortObj = Short.valueOf((short) 32767);
        short shortValue = shortObj.shortValue();

        // Integer
        Integer intObj = Integer.valueOf(2147483647);
        int intValue = intObj.intValue();

        // Long
        Long longObj = Long.valueOf(9223372036854775807L);
        long longValue = longObj.longValue();

        // Float
        Float floatObj = Float.valueOf(3.14159f);
        float floatValue = floatObj.floatValue();

        // Double
        Double doubleObj = Double.valueOf(2.71828);
        double doubleValue = doubleObj.doubleValue();

        System.out.println("Boolean: " + boolValue);
        System.out.println("Character: " + charValue);
        System.out.println("Byte: " + byteValue);
        System.out.println("Short: " + shortValue);
        System.out.println("Integer: " + intValue);
        System.out.println("Long: " + longValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
    }
}
