package org.assertj;

/**
 * Entry point for BDD assertions of different data types. Each method in this class is a static factory for the
 * type-specific assertion objects.
 */
public class BddAssertions {

  /**
   * Creates a new instance of <code>{@link dto.MaterialAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public static dto.MaterialAssert then(dto.Material actual) {
    return new dto.MaterialAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link dto.MaterialBatchAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public static dto.MaterialBatchAssert then(dto.MaterialBatch actual) {
    return new dto.MaterialBatchAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link dto.MaterialTestAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public static dto.MaterialTestAssert then(dto.MaterialTest actual) {
    return new dto.MaterialTestAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link dto.OperatorAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public static dto.OperatorAssert then(dto.Operator actual) {
    return new dto.OperatorAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link dto.OperatorTestAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public static dto.OperatorTestAssert then(dto.OperatorTest actual) {
    return new dto.OperatorTestAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link dto.ProductBatchAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public static dto.ProductBatchAssert then(dto.ProductBatch actual) {
    return new dto.ProductBatchAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link dto.ProductBatchComponentAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public static dto.ProductBatchComponentAssert then(dto.ProductBatchComponent actual) {
    return new dto.ProductBatchComponentAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link dto.ReceiptAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public static dto.ReceiptAssert then(dto.Receipt actual) {
    return new dto.ReceiptAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link dto.ReceiptComponentAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public static dto.ReceiptComponentAssert then(dto.ReceiptComponent actual) {
    return new dto.ReceiptComponentAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link dto.ReceiptTestAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public static dto.ReceiptTestAssert then(dto.ReceiptTest actual) {
    return new dto.ReceiptTestAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link dto.RoleAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public static dto.RoleAssert then(dto.Role actual) {
    return new dto.RoleAssert(actual);
  }

  /**
   * Creates a new <code>{@link BddAssertions}</code>.
   */
  protected BddAssertions() {
    // empty
  }
}
