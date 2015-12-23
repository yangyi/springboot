package hello.mapper;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import hello.PersonName;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link AbstractPeople}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePeople.builder()}.
 */
@SuppressWarnings("all")
@Generated({"Immutables.generator", "AbstractPeople"})
public final class ImmutablePeople implements AbstractPeople {
  private final PersonName name;
  private final String id;

  private ImmutablePeople(PersonName name, String id) {
    this.name = name;
    this.id = id;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty
  @Override
  public PersonName getName() {
    return name;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty
  @Override
  public String getId() {
    return id;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AbstractPeople#getName() name} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePeople withName(PersonName value) {
    if (this.name == value) return this;
    PersonName newValue = Objects.requireNonNull(value, "name");
    return new ImmutablePeople(newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AbstractPeople#getId() id} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePeople withId(String value) {
    if (this.id == value) return this;
    String newValue = Objects.requireNonNull(value, "id");
    return new ImmutablePeople(this.name, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePeople} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePeople
        && equalTo((ImmutablePeople) another);
  }

  private boolean equalTo(ImmutablePeople another) {
    return name.equals(another.name)
        && id.equals(another.id);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + name.hashCode();
    h = h * 17 + id.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code People...} with all non-generated
   * and non-auxiliary attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "People{"
        + "name=" + name
        + ", id=" + id
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  static final class Json implements AbstractPeople {
    PersonName name;
    String id;

    public void setName(PersonName name) {
      this.name = name;
    }

    public void setId(String id) {
      this.id = id;
    }

    @Override
    public PersonName getName() { throw new UnsupportedOperationException(); }

    @Override
    public String getId() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator
  static ImmutablePeople fromJson(Json json) {
    ImmutablePeople.Builder builder = ImmutablePeople.builder();
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.id != null) {
      builder.id(json.id);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AbstractPeople} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable People instance
   */
  public static ImmutablePeople copyOf(AbstractPeople instance) {
    if (instance instanceof ImmutablePeople) {
      return (ImmutablePeople) instance;
    }
    return ImmutablePeople.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link hello.mapper.ImmutablePeople ImmutablePeople}.
   * @return A new ImmutablePeople builder
   */
  public static ImmutablePeople.Builder builder() {
    return new ImmutablePeople.Builder();
  }

  /**
   * Builds instances of type {@link hello.mapper.ImmutablePeople ImmutablePeople}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private static final long INIT_BIT_ID = 0x2L;
    private long initBits = 0x3;

    private PersonName name;
    private String id;

    private Builder() {}

    /**
     * Fill a builder with attribute values from the provided {@link AbstractPeople} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(AbstractPeople instance) {
      Objects.requireNonNull(instance, "instance");
      name(instance.getName());
      id(instance.getId());
      return this;
    }

    /**
     * Initializes the value for the {@link AbstractPeople#getName() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder name(PersonName name) {
      this.name = Objects.requireNonNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link AbstractPeople#getId() id} attribute.
     * @param id The value for id 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder id(String id) {
      this.id = Objects.requireNonNull(id, "id");
      initBits &= ~INIT_BIT_ID;
      return this;
    }

    /**
     * Builds a new {@link hello.mapper.ImmutablePeople ImmutablePeople}.
     * @return An immutable instance of People
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePeople build()
        throws IllegalStateException {
      checkRequiredAttributes(); return new ImmutablePeople(name, id);
    }

    private boolean nameIsSet() {
      return (initBits & INIT_BIT_NAME) == 0;
    }

    private boolean idIsSet() {
      return (initBits & INIT_BIT_ID) == 0;
    }

    private void checkRequiredAttributes() throws IllegalStateException {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }
    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if (!nameIsSet()) attributes.add("name");
      if (!idIsSet()) attributes.add("id");
      return "Cannot build People, some of required attributes are not set " + attributes;
    }
  }
}
