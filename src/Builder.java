import contract.ConfigurableEntity;
import implementation.ConfigurableEntityImplementation;

public class Builder {
    public static ConfigurableEntity<?> from(Class<?> type) {
        return new ConfigurableEntityImplementation<>(type);
    }
}
