public class toMilesPerHourClass {
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        }else{
            return Math.round( kilometersPerHour/1.609 );
        }
    }
    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0){
            System.out.printf("Invalid Value");
        }else{
            System.out.println(kilometersPerHour + " km/h = "+ Math.round( kilometersPerHour/1.609 ) + " mi/h");
        }
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.printf("Invalid Value");
        }else{
        System.out.println(kiloBytes+ " KB = "+ kiloBytes/1024 +" MB and "+ kiloBytes%1024 +" KB");
        }
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay ){
        if(barking == true && (hourOfDay > 23 ||  hourOfDay < 0 )){
            return false;
        }else if(barking == true && (hourOfDay > 22 ||  hourOfDay < 8) ){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isLeapYear(int year){
        if(year <1 || year > 9999){
            return false;
        }else{
            if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0){
                return true;
            }else if(year % 4 == 0 && year % 100 != 0){
                return true;
            }else{
                return false;
            }
        }

    }
    public static boolean  areEqualByThreeDecimalPlaces(double a,double b){
        if((int)a ==(int)b){
            String doubleAsString = String.valueOf(a);
            int indexOfDecimal = doubleAsString.indexOf(".");
            String m = doubleAsString.substring(indexOfDecimal,5).substring(1);
            int mm = Integer.parseInt(m);

            doubleAsString = String.valueOf(b);
            indexOfDecimal = doubleAsString.indexOf(".");
            String n = doubleAsString.substring(indexOfDecimal,5).substring(1);
            int nn = Integer.parseInt(n);
            if( mm == nn ){
                return true;

            }else{
                return false;
            }

        }else{
            return false;
        }

    }
}
