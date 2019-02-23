package exceptions.price;

public class PriceCalculator {

    public Double calculatePrice() {

        Double basePrice = calculateBasePrice();

        if (basePrice == -1) {
            return -1D;
        }
        
        return basePrice * (1 + getVat());
    }

    private Double getVat() {
        return 0.2;
    }

    private Double calculateBasePrice() {
        // some complex calculation that produces 100 as net cost
        Double netCost = 100D;

        Integer profitConstant = readProfitConstant();

        if (profitConstant == -1) {
            return -1D;
        }

        return netCost + (0.1 * profitConstant * netCost);
    }

    private Integer readProfitConstant() {
        // read constant from file
        // return -1 if some error happens

        // this simulates described behavior
        return MyFileResource.read();
    }

}
