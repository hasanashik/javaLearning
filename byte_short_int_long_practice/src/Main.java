public class Main {
    public static void main(String[] args) {
        int myValue = 1000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Max Value = " + myMaxIntValue);

        int myMaxIntTest = 2_147_483_647;
        System.out.println(myMaxIntTest);
        int myMaxIntTest2 = myMaxIntValue + 1;
        System.out.println("After increment value starts from neg val. Ex: "+myMaxIntValue+" + 1 = " + myMaxIntTest2);

        Byte myMinByteValue = Byte.MIN_VALUE;
        Byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Max Value = " + myMaxByteValue);

        Short myMinShortValue = Short.MIN_VALUE;
        Short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Max Value = " + myMaxShortValue);

        Long myMinLongValue = Long.MIN_VALUE;
        Long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Max Value = " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMaxShortValue / 2);



        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 5000L + 10L * (byteValue + shortValue + intValue);
        System.out.println("longTotal = "+ longTotal);

        short shortTotal = (short) (1000 + 10 *
                (byteValue + shortValue + intValue));
        System.out.println("shortTotal = "+ shortTotal);



    }
}