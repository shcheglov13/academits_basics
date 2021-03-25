package lesson6;

public class Overload {
    public static int getTypeSize(byte byteTypeArgument) {
        return 1;
    }

    public static int getTypeSize(short shortTypeArgument) {
        return 2;
    }

    public static int getTypeSize(int intTypeArgument) {
        return 4;
    }

    public static int getTypeSize(long longTypeArgument) {
        return 8;
    }

    public static int getTypeSize(float floatTypeArgument) {
        return 4;
    }

    public static int getTypeSize(double doubleTypeArgument) {
        return 8;
    }

    public static void main(String[] args) {
        int byteSize = getTypeSize((byte) 1);
        int shortSize = getTypeSize((short) 2);
        int intSize = getTypeSize(3);
        int longSize = getTypeSize((long) 4);
        int floatSize = getTypeSize((float) 5.1);
        int doubleSize = getTypeSize(5.2);

        System.out.println("Размер типа данных byte в байтах = " + byteSize);
        System.out.println("Размер типа данных short в байтах = " + shortSize);
        System.out.println("Размер типа данных int в байтах = " + intSize);
        System.out.println("Размер типа данных long в байтах = " + longSize);
        System.out.println("Размер типа данных float в байтах = " + floatSize);
        System.out.println("Размер типа данных double в байтах = " + doubleSize);
    }
}