package hu.petrik.oopalap;

import hu.petrik.oopalap.pont.Pont;

public class Main {
    public static void main(String[] args) {
        Pont p1 = new Pont();
        Pont p2 = new Pont(3,6);
        Pont p3 = new Pont(100);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.printf("A(z) %s pont tavolsaga az origotol %.3f \n",p3, p3.getTavolasgOrigo() );
        System.out.printf("A(z) %s pont tavolsaga az %s pontol %.3f \n",p2, p3, p2.tavolsag(p3) );

        Pont[] pontok = new Pont[100];
        for (int i = 0; i < pontok.length; i++) {
            pontok[i] = new Pont(15);
        }
        for(Pont p: pontok){
            System.out.println(p);

        }
        int legtavolabbiIndex = 0;

        for (int i = 0; i < pontok.length; i++) {
            if (pontok[legtavolabbiIndex].getTavolasgOrigo() < pontok[i].getTavolasgOrigo()) {
                legtavolabbiIndex = i;
            }

        }
        System.out.printf("Az origotol legtavolabb az %d áll " +
                "A pomt az %s tavolsaga az origitol: %.3f\n", legtavolabbiIndex+1, pontok[legtavolabbiIndex],pontok[legtavolabbiIndex].getTavolasgOrigo() );
    }
}
