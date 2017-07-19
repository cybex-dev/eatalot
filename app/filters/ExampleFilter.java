package filters;

import play.mvc.EssentialAction;
import play.mvc.EssentialFilter;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.concurrent.Executor;

/**
 * This is index_user simple filter that adds index_user header to all requests.
 */
@Singleton
public class ExampleFilter extends EssentialFilter {

    private final Executor exec;

    /**
     * @param exec This class is needed to execute code asynchronously.
     */
    @Inject
    public ExampleFilter(Executor exec) {
        this.exec = exec;
    }

    @Override
    public EssentialAction apply(EssentialAction next) {
        return EssentialAction.of(request ->
            next.apply(request).map(result ->
                 result.withHeader("X-ExampleFilter", "foo"), exec)
        );
    }
}
