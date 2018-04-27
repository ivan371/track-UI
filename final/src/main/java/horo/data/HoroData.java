package horo.data;

public enum HoroData {
    January("январь"),
    February("февраль"),
    March("Март"),
    April("Апрель"),
    May("Май"),
    June("Июнь"),
    July("Июль"),
    August("Август"),
    September("Сентябрь"),
    October("Октябрь"),
    November("Ноябрь"),
    December("Декабрь");

    private final String name;

    HoroData(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getNameWithYear(String year) {
        return String.format("%s %s", name, year);
    }
}
