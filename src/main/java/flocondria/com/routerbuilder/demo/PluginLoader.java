package flocondria.com.routerbuilder.demo;

import org.pf4j.DefaultPluginManager;
import org.pf4j.PluginManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

@Configuration
public class PluginLoader {

    @Bean
    public String load() {
        URL location = PluginLoader.class.getProtectionDomain().getCodeSource().getLocation();
        System.out.println(location.getFile());
        Path project  = Paths.get("C:\\Users\\j-jse\\Documents\\Java\\router-function\\router-builder\\plugins");
        PluginManager pluginManager = new DefaultPluginManager(project);

        return "";
    }
}
