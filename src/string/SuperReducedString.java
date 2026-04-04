package string;

public class SuperReducedString {
    public static String superReducedString(String s) {

        StringBuilder result = new StringBuilder();

        for(char c : s.toCharArray()){
            int len = result.length();

            if(len > 0 && result.charAt(len-1)== c){
                result.deleteCharAt(len-1);
            }else {
                result.append(c);
            }
        }
        return result.length() == 0 ? "Empty Result" : result.toString();

    }

    public static void main(String[] args) {
        System.out.println(superReducedString("abbbcccddd"));

    }
}
