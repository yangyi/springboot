package hello;

import org.immutables.value.Value;

/**
 * Created by joeyang on 12/23/15.
 */
@Value.Immutable
public interface Individual {
    String name();
    Integer id();
}
