package org.assertj;

import org.assertj.core.internal.cglib.proxy.Enhancer;

import org.assertj.core.api.ErrorCollector;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.MultipleFailureException;
import org.junit.runners.model.Statement;

/**
 * Entry point for assertions of different data types. Each method in this class is a static factory for the
 * type-specific assertion objects.
 */
public class JUnitSoftAssertions implements TestRule {

  /** Collects error messages of all AssertionErrors thrown by the proxied method. */
  protected final ErrorCollector collector = new ErrorCollector();

  /** Creates a new </code>{@link JUnitSoftAssertions}</code>. */
  public JUnitSoftAssertions() {
    super();
  }

  /**
   * TestRule implementation that verifies that no proxied assertion methods have failed.
   */
  public Statement apply(final Statement base, Description description) {
    return new Statement() {
      @Override
      public void evaluate() throws Throwable {
        base.evaluate();
        MultipleFailureException.assertEmpty(collector.errors());
      }
    };
  }
  
  @SuppressWarnings("unchecked")
  protected <T, V> V proxy(Class<V> assertClass, Class<T> actualClass, T actual) {
    Enhancer enhancer = new Enhancer();
    enhancer.setSuperclass(assertClass);
    enhancer.setCallback(collector);
    return (V) enhancer.create(new Class[] { actualClass }, new Object[] { actual });
  }

  /**
   * Creates a new "soft" instance of <code>{@link dto.MaterialAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created "soft" assertion object.
   */
  public dto.MaterialAssert assertThat(dto.Material actual) {
    return proxy(dto.MaterialAssert.class, dto.Material.class, actual);
  }

  /**
   * Creates a new "soft" instance of <code>{@link dto.MaterialBatchAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created "soft" assertion object.
   */
  public dto.MaterialBatchAssert assertThat(dto.MaterialBatch actual) {
    return proxy(dto.MaterialBatchAssert.class, dto.MaterialBatch.class, actual);
  }

  /**
   * Creates a new "soft" instance of <code>{@link dto.OperatorAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created "soft" assertion object.
   */
  public dto.OperatorAssert assertThat(dto.Operator actual) {
    return proxy(dto.OperatorAssert.class, dto.Operator.class, actual);
  }

  /**
   * Creates a new "soft" instance of <code>{@link dto.OperatorTestAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created "soft" assertion object.
   */
  public dto.OperatorTestAssert assertThat(dto.OperatorTest actual) {
    return proxy(dto.OperatorTestAssert.class, dto.OperatorTest.class, actual);
  }

  /**
   * Creates a new "soft" instance of <code>{@link dto.ProductBatchAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created "soft" assertion object.
   */
  public dto.ProductBatchAssert assertThat(dto.ProductBatch actual) {
    return proxy(dto.ProductBatchAssert.class, dto.ProductBatch.class, actual);
  }

  /**
   * Creates a new "soft" instance of <code>{@link dto.ProductBatchComponentAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created "soft" assertion object.
   */
  public dto.ProductBatchComponentAssert assertThat(dto.ProductBatchComponent actual) {
    return proxy(dto.ProductBatchComponentAssert.class, dto.ProductBatchComponent.class, actual);
  }

  /**
   * Creates a new "soft" instance of <code>{@link dto.ReceiptAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created "soft" assertion object.
   */
  public dto.ReceiptAssert assertThat(dto.Receipt actual) {
    return proxy(dto.ReceiptAssert.class, dto.Receipt.class, actual);
  }

  /**
   * Creates a new "soft" instance of <code>{@link dto.ReceiptComponentAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created "soft" assertion object.
   */
  public dto.ReceiptComponentAssert assertThat(dto.ReceiptComponent actual) {
    return proxy(dto.ReceiptComponentAssert.class, dto.ReceiptComponent.class, actual);
  }

}
