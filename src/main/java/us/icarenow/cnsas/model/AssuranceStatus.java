package us.icarenow.cnsas.model;

import java.util.Arrays;

public enum AssuranceStatus {
    ASSURED("1890511125802", "assured"),
    NOT_ASSURED("40364512464", "not_assured"),
    NOT_FOUND("404576513265", "not_found");

    private String cnp;

    private String status;


    AssuranceStatus(String cnp, String status){
        this.cnp = cnp;
        this.status = status;
    }

    public static AssuranceStatus byCNP(String cnpProvided) {
        String cnpPrefixAssured="187";
        String cnpPrefixNotAssured="195";
        if (cnpProvided.startsWith(cnpPrefixAssured)) {
           return ASSURED;
        }else   if (cnpProvided.startsWith(cnpPrefixNotAssured)){
            return NOT_ASSURED;
        } else return NOT_FOUND;
    }

    public String getStatus() {
        return status;
    }
}
