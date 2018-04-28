package horo.month.data;

public enum HoroMonthData {
    January("январь"),
    February("февраль"),
    March("март"),
    April("апрель"),
    May("май"),
    June("июнь"),
    July("июль"),
    August("август")
    ;

    private final String name;

    HoroMonthData(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public String getNameWithYear(String year) {
        return String.format("%s %s", name, year);
    }
}
