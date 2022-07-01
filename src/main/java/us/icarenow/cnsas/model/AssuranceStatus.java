package us.icarenow.cnsas.model;

import java.util.Arrays;

public enum AssuranceStatus {
    ASSURED("187", "assured"),
    NOT_ASSURED("295", "not_assured"),
    NOT_FOUND("110", "not_found");

    private String cnpPrefix;

    private String status;


    AssuranceStatus(String cnpPrefix, String status) {
        this.cnpPrefix = cnpPrefix;
        this.status = status;
    }


    public static AssuranceStatus byCNP(String cnpProvided) {
        return Arrays.stream(values())
                .filter(as -> cnpProvided.startsWith(as.cnpPrefix))
                .findFirst()
                .orElse(NOT_FOUND);
    }

    public String getStatus() {
        return status;
    }
}
