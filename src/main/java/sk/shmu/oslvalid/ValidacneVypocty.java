package sk.shmu.oslvalid;


import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import java.util.ArrayList;

/**
 * Trieda obsahuje metody na výpocet parametrov validacie :
 * vypocetLOD, vypocetLOQ, vypocetOpakovatelnost, vypocetPresnost, vypocetSpravnost,
 * vypocetLinearita, vypocetRobustnost
 */
public class ValidacneVypocty {

    private ArrayList<Double> nameraneHodnoty;
    public ValidacneVypocty(ArrayList<Double> nameraneHodnoty){
        this.nameraneHodnoty=nameraneHodnoty;

    }

    /**
     * metoda vypocita hodnotu LOD ako 3*smerodajnaOdchylka
     * @return LOD
     */
    public double vypocetLOD(){
        // tu by sa mohol pouzit aj vzorec kde sa zohladnuje sklon kal. krivky
        // a to LOD=3.(SD/S) - sd smerodajnaOdchylka, S sklon kalibracnej krivky
        // pouvazovat nad metodou s parametrom a zohladnit viac metod vypoctu ...
       return 3*getSmerodajnaOdchylka();
    }

    /**
     * Vypocita LOQ ako 10*smerodajna odchylka
     * @return LOQ
     */
    public double vypocetLOQ(){
        return  10*getSmerodajnaOdchylka();
    }

    public double vypocetOpakovatelnost(){
        return 0;

    }

    public double vypocetPresnost(){
        return 0;

    }

    public  double vypocetSpravnost(){
        return 0;

    }
    public double vypocetRobustnost(){
        return 0;
    }

    public double vypocetLinearita(){
        return 0;
    }

    /**
     * Vypocita smerdajnu odchylku
     * @return smerodajna odchylka
     */
    private double getSmerodajnaOdchylka(){
        double[] data = new double[nameraneHodnoty.size()];
        for (int i=0; i< nameraneHodnoty.size(); i++){
            data[i]=nameraneHodnoty.get(i);
        }
        DescriptiveStatistics statistika = new DescriptiveStatistics(data);
        return statistika.getStandardDeviation();
    }

    /**
     * Vypocita priemernu hodnotu z merani
     * @return priemernu hodnotu
     */
    private double getPriemernaHodnota(){
        double[] data = new double[nameraneHodnoty.size()];
        for (int i=0; i< nameraneHodnoty.size();i++){
            data[i]=nameraneHodnoty.get(i);
        }
        DescriptiveStatistics statistika = new DescriptiveStatistics(data);
                return statistika.getMean();
    }


}
