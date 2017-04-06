package dto;

import org.assertj.core.api.AbstractAssert;

/**
 * {@link ProductBatch} specific assertions - Generated by CustomAssertionGenerator.
 */
public class ProductBatchAssert extends AbstractAssert<ProductBatchAssert, ProductBatch> {

  /**
   * Creates a new <code>{@link ProductBatchAssert}</code> to make assertions on actual ProductBatch.
   * @param actual the ProductBatch we want to make assertions on.
   */
  public ProductBatchAssert(ProductBatch actual) {
    super(actual, ProductBatchAssert.class);
  }

  /**
   * An entry point for ProductBatchAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myProductBatch)</code> and get specific assertion with code completion.
   * @param actual the ProductBatch we want to make assertions on.
   * @return a new <code>{@link ProductBatchAssert}</code>
   */
  public static ProductBatchAssert assertThat(ProductBatch actual) {
    return new ProductBatchAssert(actual);
  }

  /**
   * Verifies that the actual ProductBatch's id is equal to the given one.
   * @param id the given id to compare the actual ProductBatch's id to.
   * @return this assertion object.
   * @throws AssertionError - if the actual ProductBatch's id is not equal to the given one.
   */
  public ProductBatchAssert hasId(int id) {
    // check that actual ProductBatch we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting id of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // check
    int actualId = actual.getId();
    if (actualId != id) {
      failWithMessage(assertjErrorMessage, actual, id, actualId);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual ProductBatch's receiptId is equal to the given one.
   * @param receiptId the given receiptId to compare the actual ProductBatch's receiptId to.
   * @return this assertion object.
   * @throws AssertionError - if the actual ProductBatch's receiptId is not equal to the given one.
   */
  public ProductBatchAssert hasReceiptId(int receiptId) {
    // check that actual ProductBatch we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting receiptId of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // check
    int actualReceiptId = actual.getReceiptId();
    if (actualReceiptId != receiptId) {
      failWithMessage(assertjErrorMessage, actual, receiptId, actualReceiptId);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual ProductBatch's status is equal to the given one.
   * @param status the given status to compare the actual ProductBatch's status to.
   * @return this assertion object.
   * @throws AssertionError - if the actual ProductBatch's status is not equal to the given one.
   */
  public ProductBatchAssert hasStatus(int status) {
    // check that actual ProductBatch we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting status of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // check
    int actualStatus = actual.getStatus();
    if (actualStatus != status) {
      failWithMessage(assertjErrorMessage, actual, status, actualStatus);
    }

    // return the current assertion for method chaining
    return this;
  }

}
