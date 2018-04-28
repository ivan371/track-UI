package horo.name.data;

public enum  HoroNameData {
    Peace("Мир"),
    Aspiration("Стремление"),
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
