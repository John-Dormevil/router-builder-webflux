package flocondria.com.routerbuilder.plugin;

import org.pf4j.ExtensionPoint;

public interface RouteInterface extends ExtensionPoint {
    String getRoute();
}
