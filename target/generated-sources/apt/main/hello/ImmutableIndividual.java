package hello;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link Individual}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableIndividual.builder()}.
 */
@SuppressWarnings("all")
@Generated({"Immutables.generator", "Individual"})
public final class ImmutableIndividual implements Individual {
  private final String name;
  private final Integer id;

  private ImmutableIndividual(String name, Integer id) {
    this.name = name;
    this.id = id;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @Override
  public String name() {
    return name;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @Override
  public Integer id() {
    return id;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Individual#name() name} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableIndividual withName(String value) {
    if (this.name == value) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableIndividual(newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Individual#id() id} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableIndividual withId(Integer value) {
    if (this.id == value) return this;
    Integer newValue = Objects.requireNonNull(value, "id");
    return new ImmutableIndividual(this.name, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableIndividual} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableIndividual
        && equalTo((ImmutableIndividual) another);
  }

  private boolean equalTo(ImmutableIndividual another) {
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
   * Prints the immutable value {@code Individual...} with all non-generated
   * and non-auxiliary attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Individual{"
        + "name=" + name
        + ", id=" + id
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link Individual} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Individual instance
   */
  public static ImmutableIndividual copyOf(Individual instance) {
    if (instance instanceof ImmutableIndividual) {
      return (ImmutableIndividual) instance;
    }
    return ImmutableIndividual.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link hello.ImmutableIndividual ImmutableIndividual}.
   * @return A new ImmutableIndividual builder
   */
  public static ImmutableIndividual.Builder builder() {
    return new ImmutableIndividual.Builder();
  }

  /**
   * Builds instances of type {@link hello.ImmutableIndividual ImmutableIndividual}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private static final long INIT_BIT_ID = 0x2L;
    private long initBits = 0x3;

    private String name;
    private Integer id;

    private Builder() {}

    /**
     * Fill a builder with attribute values from the provided {@link Individual} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Individual instance) {
      Objects.requireNonNull(instance, "instance");
      name(instance.name());
      id(instance.id());
      return this;
    }

    /**
     * Initializes the value for the {@link Individual#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder name(String name) {
      this.name = Objects.requireNonNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link Individual#id() id} attribute.
     * @param id The value for id 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder id(Integer id) {
      this.id = Objects.requireNonNull(id, "id");
      initBits &= ~INIT_BIT_ID;
      return this;
    }

    /**
     * Builds a new {@link hello.ImmutableIndividual ImmutableIndividual}.
     * @return An immutable instance of Individual
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableIndividual build()
        throws IllegalStateException {
      checkRequiredAttributes(); return new ImmutableIndividual(name, id);
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
      return "Cannot build Individual, some of required attributes are not set " + attributes;
    }
  }
}
