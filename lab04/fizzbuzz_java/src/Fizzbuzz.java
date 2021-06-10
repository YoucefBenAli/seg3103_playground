public class Fizzbuzz {

    public static String FizzBuzzConverter(Integer num){

        if(num==null){
            throw new IllegalArgumentException("Number can not be null");
        }

        if(num%3 ==0 && num%5 ==0){
            return "FizzBuzz";
        }
        else if(num%3==0){
            return "Fizz";
        }
        else if(num%5==0){
            return "Buzz";
        }
        else{
            return Integer.toString(num);
        }
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
