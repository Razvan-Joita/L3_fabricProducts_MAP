public class SalesProducts {
    private final int j1;
    private final int qtV1;
    private final int qJ1;
    private final int j2;
    private final int qtV2;
    private final int qJ2;
    private final Product product;

    public SalesProducts(int j1, int qtV1, int qJ1, int j2, int qtV2, int qJ2, Product product) {
        this.j1 = j1;
        this.qtV1 = qtV1;
        this.qJ1 = qJ1;
        this.j2 = j2;
        this.qtV2 = qtV2;
        this.qJ2 = qJ2;
        this.product = product;
    }


    public float nachfrage() {
        double prozent1 = 100 * ((double) qtV1 / qJ1);
        double prozent2 = 100 * ((double) qtV2 / qJ2);
        return (float) (prozent2+prozent1)/2;
    }

    public void anordnung() {
        System.out.println("Product: " + product.getName());
        double prozent1 = 100 * ((double) qtV1/qJ1);
        prozent1 = Math.round(prozent1);
        System.out.println("Procent Jahr1: " + prozent1);
        double prozent2 = 100 * ((double) qtV2/qJ2);
        prozent2 = Math.round(prozent2);
        System.out.println("Procent Jahr2: " + prozent2);
        if (prozent1 == prozent2 || (prozent1 + 1 >= prozent2 && prozent1 < prozent2) || (prozent2 + 1 >= prozent1 && prozent2 < prozent1)) {
            System.out.println("Die Nachfrage der " + product.getName() + " ist der selbe geblieben im " + j1 + " wie im " + j2 + " und zwar " + prozent2);
            System.out.println(" " + ((float) (110 * qtV2) / 100));
        } else if (prozent1 < prozent2) {
            System.out.println("Die Nachfrage der " + product.getName() + " ist mit " + (prozent2 - prozent1) + "% vom " + j1 + " zu " + j2 + " gestiegen");
            System.out.println(" " + ((float) (150 * qtV2) / 100));}
        else{
            System.out.println("Die Nachfrage der " + product.getName() + " ist mit " + (prozent2 - prozent1) + "% vom " + j1 + " zu " + j2 + " runtergefallen");
            System.out.println(" " + ((float) (90 * qtV2) / 100));
        }
    }

    public String productName() {
        return product.getName();
    }

    public int productiD() {
        return product.getID();
    }

    public void ording() {
    }
}