import java.util.Map;

public class Moneda {
    private String base_code;
    private Map<String, Double> conversion_rates;

    public Moneda(String base_code, Map<String, Double> conversion_rates) {
        this.base_code = base_code;
        this.conversion_rates = conversion_rates;
    }

    public String getBase_code() {
        return base_code;
    }

    public Map<String, Double> getConversion_rates() {
        return conversion_rates;
    }
}
