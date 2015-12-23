package hello;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link _PersonName}.
 * <p>
 * Use the static factory method to create immutable instances:
 * {@code PersonName.of()}.
 */
@SuppressWarnings("all")
@Generated({"Immutables.generator", "_PersonName"})
public final class PersonName extends hello._PersonName {
  private final String value;

  private PersonName(String value) {
    this.value = Objects.requireNonNull(value, "value");
  }

  /**
   * @return The value of the {@code value} attribute
   */
  @JsonProperty
  @Override
  public String value() {
    return value;
  }

  /**
   * This instance is equal to all instances of {@code PersonName} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof PersonName
        && equalTo((PersonName) another);
  }

  private boolean equalTo(PersonName another) {
    return value.equals(another.value);
  }

  /**
   * Computes a hash code from attributes: {@code value}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + value.hashCode();
    return h;
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  static final class Json extends hello._PersonName {
    String value;

    public void setValue(String value) {
      this.value = value;
    }

    @Override
    public String value() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator
  static PersonName fromJson(Json json) {
    PersonName instance = PersonName.of(json.value);
    return instance;
  }

  /**
   * Construct a new immutable {@code PersonName} instance.
   * @param value The value for the {@code value} attribute
   * @return An immutable PersonName instance
   */
  public static PersonName of(String value) {
    return validate(new PersonName(value));
  }

  private static PersonName validate(PersonName instance) {
    instance.check();
    return instance;
  }
}
