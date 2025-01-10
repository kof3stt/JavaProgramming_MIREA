public class MathCalculator implements MathCalculable{
    @Override
    public double pow(double x,double n){
        return Math.pow(x,n);
    }

    @Override
    public double abs(double a, double b){
        return Math.sqrt(pow(a,2)+pow(b,2));
    }

}
