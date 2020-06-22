package day03;

public class PrimitivesPractice {

    public static void main( String[]args) {
        int catCount = 20;
        System.out.println("The cat count of in this house is" +  catCount);

        byte LetterCount = 26;
        System.out.println("The Letter count is" +  LetterCount  );
        // use above example to print out the rest of the variable value in similar format.



        short sheepCount = 300;
        System.out.println(" sheep count is " + sheepCount);

        long mileToSun = 1000000L;
        System.out.println(" The mileage to Sun is "+ mileToSun);
        long mileToMoon = 1000000000L;
        System.out.println(" The mileage to Moon is "+ mileToMoon);
        // __________ floating point ___________
// you must add f at the end of number to indicate this is float data type
        // upper case lowercase does not matter, but its mandatory
        float priceOfBanana = 1.99f;
        System.out.println(" The price of Banana "+  priceOfBanana);

        float priceOfPotato = 2.49f;
        System.out.println(" The price of Potato "+ priceOfPotato);

         double priceOfipad = 355.99d;
         System.out.println(" The price of Ipad "+ priceOfipad);

         double  priceOfipadPro = 1024.99D;
         System.out.println(" The price of ipadPro is " + priceOfipadPro);
         // compiler  automatically assume its  a double so its  not required to have d
        // however for good  programming habbit , add them always

         double priceOfMac = 2299.99;
         System.out.println(" The price of Mac " + priceOfMac);

         //  if you have a whole number by itself, compiler automatically assume its an  int
        // if you have a fractional number by itself, compiler automatically assume its an int




    }
}
