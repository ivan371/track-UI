package horo.data;

public enum HoroData {
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

    HoroData(String name) {
        this.name = name;
    }

    // make first letter in upper case
    private String firstUpperCase(String word){
        if(word == null || word.isEmpty()) return "";
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    public String getName() {
        return firstUpperCase(name);
    }

    public String getNameWithYear(String year) {
        return String.format("%s %s", name, year);
    }
}
