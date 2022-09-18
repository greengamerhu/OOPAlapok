package hu.petrik.oopalap.pont;

public class Pont {
    private int x;
    private int y;



    public Pont() {
        this.x =0;
        this.y =0;
    }


    public Pont(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Pont(int n) {
        this.x = kordinátaGeneralasa(n);
        this.y = kordinátaGeneralasa(n);
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    public double getTavolasgOrigo() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
    public  double tavolsag(Pont masikPont) {
        return Math.sqrt(Math.pow(this.x - masikPont.x, 2) + Math.pow(this.y - masikPont.y, 2));
    }
    public  int getSiknegyed() {
                if   (this.x < 0 && this.y > 0) {
                    return 1;
                } else if (this.x < 0 && this.y < 0) {
                    return 2;
                } else if (this.x > 0 && this.y < 0) {
                    return 3;
                } else if (this.x > 0 && this.y > 0) {
                    return 4;
                } else return 0;
    }

    private static int kordinátaGeneralasa(int n) {
        return (int) (Math.random() * (2 * n + 1)) - n;
    }






    @Override
    public String toString() {
        return String.format("(%d, %d)", this.x, this.y);
    }
}
