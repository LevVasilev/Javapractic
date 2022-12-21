
public class ProcessStrings implements StringWork {
    public ProcessStrings() {
    }

    public void CountSumbols(String s) {
        int len = s.length();
        System.out.println(len);
    }

    public String NewString(String s) {
        String odd = "";

        for(int j = 0; j < s.length(); ++j) {
            if (j % 2 == 0) {
                odd = odd + s.charAt(j);
            }
        }

        return odd;
    }

    public void ReverseString(String s) {
        String reverse = (new StringBuilder(s)).reverse().toString();
        System.out.println(reverse);
    }
}
