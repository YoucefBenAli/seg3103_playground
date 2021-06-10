public class Fizzbuzz {

    public static String FizzBuzzConverter(Integer num){

        String result = "";
        if(num!=null){
            if(num%3==0){
                result+="Fizz";
            }
            if(num%5==0){
                result+="Buzz";
            }
            if(result==""){
                result+= Integer.toString(num);
            }

            return result;
        }
        else{
            throw new IllegalArgumentException("Number can not be null");
        }
    }

    public static String[] MassFizzBuzzConverter(Integer length){
        if(length!=null){
            String[] result = new String[length];
            for(int i =0; i<length;i++){
                result[i] = FizzBuzzConverter(i);
            }

            return result;
        }
        else{
            throw new IllegalArgumentException("Number can not be null");
        }
    }

}