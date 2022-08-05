package src;

public enum TestEnum {
    AV("AV","Andhra Pradesh","Bengaluru"),
    AR("AR","Arunachal Pradesh","Itanagar"),
    AS("AS","Assam","Disputer"),
    BR("BR","Bihar","Patna"),
    CT("CT","Chhattisgarh","Bhilai"),
    DL("DL","Delhi","New Delhi");

    private final String assam;
    private final String as;

    TestEnum(String as, String assam, String bhilai) {
        this.as = as;
        this.assam = assam;
    }
}
