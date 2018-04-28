package horo.numenology.name.data;

public enum  HoroNameData {
    Peace("Мир"),
    Aspiration("Устремления"),
    Spirit("Душа")
    ;

    private final String name;

    HoroNameData(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
