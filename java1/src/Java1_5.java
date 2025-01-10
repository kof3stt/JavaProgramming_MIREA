public class Java1_5 {
    public static void main(String[] args)
    {
        int res = f(4);
        System.out.println(res);
    }
    public static int f(int n)
    {
        int total = 1;
        for (int i =1; i<=n;i++)
        {
            total*=i;
        }
        return total;
    }
}
