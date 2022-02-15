enum ChargeLevel {

    FULL(4, "green"),
    HIGH(3, "green"),
    MEDIUM(2, "yellow"),
    LOW(1, "red");

    int sections;
    String color;

    ChargeLevel(int sections, String color) {
        this.sections = sections;
        this.color = color;
    }

    public int getSections() {
        return sections;
    }

    public String getColor() {
        return color;
    }
}

public enum ChargeLevel1 {

    FULL(4, "green"),
    HIGH(3, "green"),
    MEDIUM(2, "yellow"),
    LOW(1, "red");

    int sections;
    String color;

    ChargeLevel(int sections, String color) {
        this.sections = sections;
        this.color = color;
    }

    public int getSections() {
        return sections;
    }

    public String getColor() {
        return color;
    }

    public static ChargeLevel findByNumberOfSections(int sections) {
        for (ChargeLevel value: values()) {
            if (value.sections == sections) {
                return value;
            }
        }
        return null;
    }
}


class Use_enum{
    public static void main(String[] args) {
        System.out.println(ChargeLevel.LOW.sections); // 1
        System.out.println(ChargeLevel.LOW.color); // red
        System.out.println(ChargeLevel1.findByNumberOfSections(2)); // MEDIUM
    }
}

