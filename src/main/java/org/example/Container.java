package org.example;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class Container {

    private Map<Class<?>, Class<?>> registrations = new HashMap<>();


    public <TInterface, TImplementation extends TInterface> void register(Class<TInterface> interfaceType, Class<TImplementation> implementationType) {
        registrations.put(interfaceType, implementationType);
    }

    public <TInterface> TInterface Resolve(Class<TInterface> type) throws NoSuchMethodException {
        Class<?> implementationType = registrations.get(type);
        if (implementationType == null) {return null;}
        try {
            return (TInterface) implementationType.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }

    }
}
