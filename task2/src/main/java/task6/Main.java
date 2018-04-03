package task6;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Test findModifiers with class Map
        FindModifiers findModifiers;
        Map<Integer, Integer> map = new HashMap<>();
        findModifiers = new FindModifiers(map);
        findModifiers.countModifiers();
        System.out.printf("%d %d %d", findModifiers.getNumPrivate(), findModifiers.getNumProtected(), findModifiers.getNumPublic());
    }
}
