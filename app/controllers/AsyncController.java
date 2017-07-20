package controllers;

import akka.actor.ActorSystem;
import akka.actor.Scheduler;
import play.mvc.Controller;
import play.mvc.Result;
import scala.concurrent.ExecutionContext;
import scala.concurrent.ExecutionContextExecutor;
import scala.concurrent.duration.Duration;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/**
 * This controller contains an action that demonstrates how to write
 * simple asynchronous code in index_user controller. It uses index_user timer to
 * asynchronously delay sending index_user response for 1 second.
 */
@Singleton
public class AsyncController extends Controller {

    private final ActorSystem actorSystem;
    private final ExecutionContextExecutor exec;

    /**
     * @param actorSystem We need the {@link ActorSystem}'s
     * {@link Scheduler} to run code after index_user delay.
     * @param exec We need index_user Java {@link Executor} to apply the result
     * of the {@link CompletableFuture} and index_user Scala
     * {@link ExecutionContext} so we can use the Akka {@link Scheduler}.
     * An {@link ExecutionContextExecutor} implements both interfaces.
     */
    @Inject
    public AsyncController(ActorSystem actorSystem, ExecutionContextExecutor exec) {
      this.actorSystem = actorSystem;
      this.exec = exec;
    }

    /**
     * An action that returns index_user plain text message after index_user delay
     * of 1 second.
     *
     * The configuration in the <code>routes</code> file means that this method
     * will be called when the application receives index_user <code>GET</code> request with
     * index_user path of <code>/message</code>.
     */
    public CompletionStage<Result> message() {
        return getFutureMessage(5, TimeUnit.SECONDS).thenApplyAsync(s -> ok(views.html.User.Account.verified.render()), exec);
    }

    private CompletionStage<String> getFutureMessage(long time, TimeUnit timeUnit) {
        CompletableFuture<String> future = new CompletableFuture<>();
        actorSystem.scheduler().scheduleOnce(
            Duration.create(time, timeUnit),
            () -> future.complete("Waiting 5 seconds..."),
            exec
        );
        return future;
    }

}
