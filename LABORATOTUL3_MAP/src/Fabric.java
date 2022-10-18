import java.util.List;

public class Fabric {

    private final List<SalesProducts> arrayProducts;

    public Fabric(List<SalesProducts> arrayproducts) {
        this.arrayProducts = arrayproducts;
    }

    public void nSorting() {
        float[] arrayP = new float[arrayProducts.size()];
        for(int i=0; i<arrayProducts.size(); i++) {
            arrayP[i] = arrayProducts.get(i).nachfrage();

        }


        for (int i = 0; i<arrayProducts.size() - 1; i++)
            for (int j = 0; j < arrayProducts.size() - i - 1; j++)
                if (arrayP[j] > arrayP[j+1]) {
                    float t =arrayP[j];
                    arrayP[j] = arrayP[j + 1];
                    arrayP[j + 1] = t;

                    SalesProducts t1 = arrayProducts.get(j);
                   arrayProducts.set(j,arrayProducts.get(j + 1));
                    arrayProducts.set(j+1,t1);
                }

        for (SalesProducts salesProducts : arrayProducts) {
            System.out.println(salesProducts.productName() + " with ID: " + salesProducts.productiD());
        }
    }

    public void ording() {
        for (SalesProducts saledproducts : arrayProducts) {
          saledproducts.ording();

        }
    }
}
