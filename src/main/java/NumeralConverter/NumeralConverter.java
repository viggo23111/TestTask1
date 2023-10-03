package NumeralConverter;

public class NumeralConverter {

    public static Long convertToArabicFromRoman(String romanNumeral){
        Long arabic = 0L;
        int i = 0;
        while(i < romanNumeral.length()){
            switch(romanNumeral.charAt(i)){
                case 'M':
                    arabic += 1000;
                    break;
                case 'D':
                    arabic += 500;
                    break;
                case 'C':
                    if(i + 1 < romanNumeral.length()){
                        if(romanNumeral.charAt(i + 1) == 'M'){
                            arabic += 900;
                            i++;
                        } else if(romanNumeral.charAt(i + 1) == 'D'){
                            arabic += 400;
                            i++;
                        } else {
                            arabic += 100;
                        }
                    } else {
                        arabic += 100;
                    }
                    break;
                case 'L':
                    arabic += 50;
                    break;
                case 'X':
                    if(i + 1 < romanNumeral.length()){
                        if(romanNumeral.charAt(i + 1) == 'C'){
                            arabic += 90;
                            i++;
                        } else if(romanNumeral.charAt(i + 1) == 'L'){
                            arabic += 40;
                            i++;
                        } else {
                            arabic += 10;
                        }
                    } else {
                        arabic += 10;
                    }
                    break;
                case 'V':
                    arabic += 5;
                    break;
                case 'I':
                    if(i + 1 < romanNumeral.length()){
                        if(romanNumeral.charAt(i + 1) == 'X'){
                            arabic += 9;
                            i++;
                        } else if(romanNumeral.charAt(i + 1) == 'V'){
                            arabic += 4;
                            i++;
                        } else {
                            arabic += 1;
                        }
                    } else {
                        arabic += 1;
                    }
                    break;
                default:
                    arabic = -1L;
                    break;
            }
            i++;
        }
        return arabic;

    }
    public static String convertToRoman(int number) throws Exception {

        if(number < 1){
            throw new Exception("Unable to convert to Roman");
        }
        String roman = "";
        while(number >= 1000){
            roman += "M";
            number -= 1000;
        }
        while(number >= 900){
            roman += "CM";
            number -= 900;
        }
        while(number >= 500){
            roman += "D";
            number -= 500;
        }
        while(number >= 400){
            roman += "CD";
            number -= 400;
        }
        while(number >= 100){
            roman += "C";
            number -= 100;
        }
        while(number >= 90){
            roman += "XC";
            number -= 90;
        }
        while(number >= 50){
            roman += "L";
            number -= 50;
        }
        while(number >= 40){
            roman += "XL";
            number -= 40;
        }
        while(number >= 10){
            roman += "X";
            number -= 10;
        }
        while(number >= 9){
            roman += "IX";
            number -= 9;
        }
        while(number >= 5){
            roman += "V";
            number -= 5;
        }
        while(number >= 4){
            roman += "IV";
            number -= 4;
        }
        while(number >= 1){
            roman += "I";
            number -= 1;
        }
        return roman;
    }
}