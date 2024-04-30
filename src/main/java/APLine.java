public class APLine {
  private int a, b, c;

    public APLine(int aIn, int bIn, int cIn){
        this.a = aIn;
        this.b = bIn;
        this.c = cIn;
    }

    public double getSlope(){
        return - (a / ((double) b));
    }

    public boolean isOnLine(int x, int y){
        return (a * x) + (b * y) + c == 0;
    }
}
