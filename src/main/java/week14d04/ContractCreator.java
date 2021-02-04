package week14d04;

import java.util.ArrayList;
import java.util.List;

public class ContractCreator {

    public Contract template;

    public ContractCreator(String client, List<Integer> monthlyPrices) {
        this.template = new Contract(client, monthlyPrices);
    }

    public Contract getTemplate() {
        return template;
    }

    public Contract createContract(String client) {
        return new Contract(client, new ArrayList<>(template.getMonthlyPrices()));
    }

    public static void main(String[] args) {
        ContractCreator cc = new ContractCreator("John doo", List.of(4,5,6,7,78));
        cc.createContract("John Smith").getMonthlyPrices().set(1,28);
    }

}
