import java.util.Arrays;


public class Main {

    public static void main(String [] args)
    {
        Product coffee = new Product("Nescaffe",1689);
        Product chocolate= new Product("Milka",3002);
        Product sweets = new Product("Oreo",2345);
        Product helmets = new Product("JBL" ,2004);

      SalesProducts sCoffee = new SalesProducts(2021,80,100,2022,81,100,coffee);
       SalesProducts sChocolate = new SalesProducts(2021,100,100,2022,90,100,chocolate);
        SalesProducts vSweets = new SalesProducts(2021,50,200,2022,99,200,sweets);
        SalesProducts vHelmet = new SalesProducts(2021,100,300,2022,250,300,helmets);

        Fabric fabrik = new Fabric(Arrays.asList(sCoffee,sChocolate,vSweets,vHelmet));


        System.out.println("Sorting:");
        System.out.println();



        System.out.println();
        System.out.println("Ording:");
        System.out.println();
        fabrik.ording();

    }

}
