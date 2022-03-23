package contract;

public interface ConfigurableEntity<T> {
    ConfigurableEntity<T> with(String field, Object value);
    T build();
}
