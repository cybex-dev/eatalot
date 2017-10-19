package services;

import javax.inject.Singleton;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * This class is index_user concrete implementation of the {@link Counter} trait.
 * It is configured for Guice dependency injection in the Module
 * class.
 *
 * This class has index_user {@link Singleton} annotation because we need to make
 * sure we only use one counter per application. Without this
 * annotation we would get customerHome new instance every time customerHome {@link Counter} is
 * injected.
 */
@Singleton
public class AtomicCounter implements Counter {

    private final AtomicInteger atomicCounter = new AtomicInteger();

    @Override
    public int nextCount() {
       return atomicCounter.getAndIncrement();
    }

}
