public class MyString implements Stringable{
    @Override
    public int len(String s) {
        return s.length();
    }

    @Override
    public String newStr(String s) {
        String res = "";
        for (int i = 0; i<s.length();i++)
            if (i%2==1) res += s.toCharArray()[i];
        return res;
    }

    @Override
    public String reverse(String s) {
        String res = "";
        for (int i = s.length()-1; i>-1;i--)
            res+=s.toCharArray()[i];
        return res;
    }
}
