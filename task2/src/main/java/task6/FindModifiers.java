package task6;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FindModifiers {

    private Field[] fields;
    private int numPrivate = 0;
    private int numProtected = 0;
    private int numPublic = 0;

    FindModifiers(Object object) {
        //Get fields of out class
        Class<?> o = object.getClass();
        fields = getClass().getDeclaredFields();
    }

    public void countModifiers() {
        //Count fields
        for (Field field : fields) {
            int fieldMods = field.getModifiers();
            if (Modifier.isPrivate(fieldMods)) {
                numPrivate++;
            } else if (Modifier.isProtected(fieldMods)) {
                numProtected++;
            } else if (Modifier.isPublic(fieldMods)) {
                numPublic++;
            }
        }
    }

    public int getNumPrivate() {
        return numPrivate;
    }

    public int getNumPublic() {
        return numPublic;
    }

    public int getNumProtected() {
        return numProtected;
    }
}
