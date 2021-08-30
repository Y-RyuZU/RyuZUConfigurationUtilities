import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConfigurationWrapper extends YamlConfiguration{
    //private YamlConfiguration config = new YamlConfiguration();
    private File file;

    public ConfigurationWrapper(String path) throws IOException {
        file = new File(RyuZUConfigurationUtilities.plugin.getDataFolder() , path);
        try {
            this.load(file);
        } catch (IOException | InvalidConfigurationException ignored) {
            this.save(file);
        }
    }

    public void save() {
        try {
            this.save(file);
        } catch (IOException error) {
            return;
        }
    }

    public <T> T get(Class<T> tClass, String path) {
        Object value = this.get(path);
        return as(tClass, value);
    }

    public <T> List<T> getList(Class<T> tClass, String path) {
        List<?> value = this.getList(path);
        if (value != null) {
            return value.stream().map(e -> as(tClass, e)).collect(Collectors.toList());
        } else {
            return new ArrayList<>();
        }
    }

    private static <T> T as(Class<T> tClass, Object obj) {
        if (obj != null && tClass.isAssignableFrom(obj.getClass())) {
            return (T)obj;
        } else {
            return null;
        }
    }
}
