package hello.mapper;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import hello.PersonName;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutablePeople.class)
@JsonDeserialize(as = ImmutablePeople.class)
public interface AbstractPeople {
    PersonName getName();
    String getId();
}