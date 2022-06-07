package us.icarenow.cnsas.model;

import java.util.Arrays;

public enum AssuranceStatus {
    ASSURED("12895665", "assured"),
    NOT_ASSURED("40364512464", "not_assured"),
    NOT_FOUND("404576513265", "not_found");

    private String cnp;
    private String status;

    AssuranceStatus(String cnp, String status){
        this.cnp = cnp;
        this.status = status;
    }

    public static AssuranceStatus byCNP(String cnpProvided) {
        return Arrays.stream(values())
                .filter(as -> as.cnp.equals(cnpProvided))
                .findFirst()
                .orElse(NOT_FOUND);
    }

    public String getStatus() {
        return status;
    }
}
