public class Java1_4 {
    public static void main(String[] args) {
        for (int i = 0;i<10;i++)
        {
            String s = "";
            if (i!=0)
                s = "1" + "/" + Integer.toString(i+1);
            else
                s = "1";
            System.out.println(s);
        }
    }
}
