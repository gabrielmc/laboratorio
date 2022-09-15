package factory.abs;

import factory.action.ArvoreTipo;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

/**
 * @author gmuniz
 */
public class ArvoreFactory {
    
    public static Map<String, ArvoreTipo> treeTypes = new HashMap<>();

    public static ArvoreTipo getTreeType(String name, Color color, String otherTreeData) {
        ArvoreTipo result = treeTypes.get(name);
        if (result == null) {
            result = new ArvoreTipo(name, color, otherTreeData);
            treeTypes.put(name, result);
        }
        return result;
    }
}