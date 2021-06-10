public class Fizzbuzz {

    public static String FizzBuzzConverter(Integer num){

        if(num==null){
            throw new IllegalArgumentException("Number can not be null");
        }

        if(divisibleBy3(num) && divisibleBy5(num)){
            return "FizzBuzz";
        }
        else if(divisibleBy3(num)){
            return "Fizz";
        }
        else if(divisibleBy5(num)){
            return "Buzz";
        }
        else{
            return Integer.toString(num);
        }
    }

    private static boolean divisibleBy3(int number){
        return number%3 == 0;
    }

    private static boolean divisibleBy5(int number){
        return number%5 == 0;
    }

    public static String[] MassFizzBuzzConverter(Integer length){

        if (length==null || length<1){
            throw new IllegalArgumentException("Number can not be null and needs to be above 0");
        }

        String[] result = new String[length];
        for(int i =0; i<length;i++){
            result[i] = FizzBuzzConverter(i);
        }

        return result;

    }


}
