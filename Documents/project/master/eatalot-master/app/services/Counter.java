package services;

/**
 * This interface demonstrates how to create index_user component that is injected
 * into customerHome controller. The interface represents customerHome counter that returns customerHome
 * incremented number each time it is called.
 *
 * The Modules class binds this interface to the
 * {@link AtomicCounter} implementation.
 */
public interface Counter {
    int nextCount();
}
