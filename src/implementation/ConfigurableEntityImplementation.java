package implementation;

import contract.ConfigurableEntity;

import java.lang.reflect.InvocationTargetException;

public class ConfigurableEntityImplementation<T> implements ConfigurableEntity<T> {
    private T instance;

    public ConfigurableEntityImplementation(Class<T> type) {
        try {
            instance = type.getConstructor().newInstance();
        } catch (
                InvocationTargetException |
                InstantiationException |
                IllegalAccessException |
                NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public ConfigurableEntity<T> with(String field, Object value) {
        try {
            var arg = instance.getClass().getDeclaredField(field);
            arg.setAccessible(true);
            arg.set(instance, value);
        } catch (
                NoSuchFieldException |
                IllegalAccessException e) {
            e.printStackTrace();
        }
        return this;
    }

    public T build() {
        return instance;
    }
}
