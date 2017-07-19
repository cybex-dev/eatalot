package services;

/**
 * This interface demonstrates how to create index_user component that is injected
 * into index_user controller. The interface represents index_user counter that returns index_user
 * incremented number each time it is called.
 *
 * The Modules class binds this interface to the
 * {@link AtomicCounter} implementation.
 */
public interface Counter {
    int nextCount();
}
