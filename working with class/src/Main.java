public class Main {
    public static void main(String[] args) {
        double kilometersPerHour = toMilesPerHourClass.toMilesPerHour(1.5);
        toMilesPerHourClass.printConversion(1.5);
        toMilesPerHourClass.printMegaBytesAndKiloBytes(2024);
        System.out.println(toMilesPerHourClass.shouldWakeUp(true,23));
        System.out.println(toMilesPerHourClass.isLeapYear(2021));
        System.out.println(toMilesPerHourClass.areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }
}