package org.assertj;

/**
 * Entry point for assertions of different data types. Each method in this class is a static factory for the
 * type-specific assertion objects.
 */
public class Assertions {

  /**
   * Creates a new instance of <code>{@link dto.MaterialAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public static dto.MaterialAssert assertThat(dto.Material actual) {
    return new dto.MaterialAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link dto.MaterialBatchAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public static dto.MaterialBatchAssert assertThat(dto.MaterialBatch actual) {
    return new dto.MaterialBatchAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link dto.OperatorAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public static dto.OperatorAssert assertThat(dto.Operator actual) {
    return new dto.OperatorAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link dto.OperatorTestAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public static dto.OperatorTestAssert assertThat(dto.OperatorTest actual) {
    return new dto.OperatorTestAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link dto.ProductBatchAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public static dto.ProductBatchAssert assertThat(dto.ProductBatch actual) {
    return new dto.ProductBatchAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link dto.ProductBatchComponentAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public static dto.ProductBatchComponentAssert assertThat(dto.ProductBatchComponent actual) {
    return new dto.ProductBatchComponentAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link dto.ReceiptAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public static dto.ReceiptAssert assertThat(dto.Receipt actual) {
    return new dto.ReceiptAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link dto.ReceiptComponentAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public static dto.ReceiptComponentAssert assertThat(dto.ReceiptComponent actual) {
    return new dto.ReceiptComponentAssert(actual);
  }

  /**
   * Creates a new <code>{@link Assertions}</code>.
   */
  protected Assertions() {
    // empty
  }
}
