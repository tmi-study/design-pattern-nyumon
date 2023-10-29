package Part5Singleton;

import java.util.Map;
import java.util.Set;

public class Triple {
    private static String ALPHA = "ALPHA";
    private static String BETA = "BETA";
    private static String GAMMA = "GAMMA";
    private static Map<String, Triple> tripleMap;
    static {
        tripleMap.put(ALPHA, new Triple(ALPHA));
        tripleMap.put(BETA, new Triple(BETA));
        tripleMap.put(GAMMA, new Triple(GAMMA));
    }
    private String name;

    private Triple(String name) {
        this.name = name;
    }

    public static Triple getInstance(String name) {
        Triple triple = tripleMap.get(name);
        if (triple == null) {
            throw new NullPointerException(String.format("There is no Triple instance which has name '%s'", name));
        }
        return triple;
    }
}
