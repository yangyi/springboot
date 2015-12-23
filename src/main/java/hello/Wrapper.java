package hello;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import hello.mapper.ImmutablePeople;
import org.immutables.value.Value;

/**
 * Created by joeyang on 12/23/15.
 */
abstract class Wrapper<T> {
    @Value.Parameter
    abstract public T value();
    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" + value() + ")";
    }
}


@Value.Immutable @Wrapped
@JsonSerialize(as = PersonName.class)
@JsonDeserialize(as = PersonName.class)
abstract class _PersonName extends Wrapper<String> {
    @Value.Check
    protected void check() {
        if (value().length() < 3) {
            throw new IllegalStateException("less than 3 characters");
        }
    }

}
