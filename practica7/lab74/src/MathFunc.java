public class MathFunc implements MathCalculable {
    private double mRe;
    private double mIm;

    public MathFunc(double mRe, double mIm) {
        this.mRe = mRe;
        this.mIm = mIm;
    }

    public MathFunc() {
    }

    public double getRe() {
        return this.mRe;
    }

    public double getIm() {
        return this.mIm;
    }

    public double Degree(double a, int b) {
        double result = 1.0;

        for(int i = 1; i <= b; ++i) {
            result *= a;
        }

        return result;
    }

    public double ComNum() {
        return Math.sqrt(this.mRe * this.mRe + this.mIm * this.mIm);
    }

    public double PI() {
        return Math.PI;
    }
}
