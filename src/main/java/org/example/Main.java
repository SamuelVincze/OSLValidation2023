package org.example;

import sk.shmu.oslvalid.ValidacneVypocty;
import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {

        ArrayList<Double>nameraneData=new ArrayList<>();
        nameraneData.add(5.0);
        nameraneData.add(4.0);
        nameraneData.add(2.0);
        nameraneData.add(1.0);
        nameraneData.add(8.0);

        ValidacneVypocty validacia = new ValidacneVypocty(nameraneData);
        System.out.println(validacia.vypocetLOD());
        System.out.println(validacia.vypocetLOQ());


    }
}