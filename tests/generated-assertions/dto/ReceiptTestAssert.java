package dto;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.util.Objects;

/**
 * {@link ReceiptTest} specific assertions - Generated by CustomAssertionGenerator.
 */
public class ReceiptTestAssert extends AbstractAssert<ReceiptTestAssert, ReceiptTest> {

  /**
   * Creates a new <code>{@link ReceiptTestAssert}</code> to make assertions on actual ReceiptTest.
   * @param actual the ReceiptTest we want to make assertions on.
   */
  public ReceiptTestAssert(ReceiptTest actual) {
    super(actual, ReceiptTestAssert.class);
  }

  /**
   * An entry point for ReceiptTestAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myReceiptTest)</code> and get specific assertion with code completion.
   * @param actual the ReceiptTest we want to make assertions on.
   * @return a new <code>{@link ReceiptTestAssert}</code>
   */
  public static ReceiptTestAssert assertThat(ReceiptTest actual) {
    return new ReceiptTestAssert(actual);
  }

  /**
   * Verifies that the actual ReceiptTest's source is equal to the given one.
   * @param source the given source to compare the actual ReceiptTest's source to.
   * @return this assertion object.
   * @throws AssertionError - if the actual ReceiptTest's source is not equal to the given one.
   */
  public ReceiptTestAssert hasSource(org.assertj.db.type.Source source) {
    // check that actual ReceiptTest we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting source of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    org.assertj.db.type.Source actualSource = actual.source;
    if (!Objects.areEqual(actualSource, source)) {
      failWithMessage(assertjErrorMessage, actual, source, actualSource);
    }

    // return the current assertion for method chaining
    return this;
  }

}