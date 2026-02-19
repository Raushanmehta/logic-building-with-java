package string;

public class VowelsAndConsonant {
    public static void main(String[] args) {

        String str = "Automation";

        int Vowels = 0,  Consonants = 0;

        for (char c : str.toCharArray()) {
            if("aeiouAEIOU".indexOf(c) != -1){
                Vowels++;
            }
            else if (Character.isLowerCase(c)) {
                Consonants++;
            }
        }
        System.out.println("Vowels " + Vowels + " Consonants " + Consonants);

    }
}
