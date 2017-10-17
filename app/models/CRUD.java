package models;

import play.filters.csrf.RequireCSRFCheck;
import play.mvc.Result;

import java.util.concurrent.CompletionStage;

/**
 * Created by cybex on 2017/07/16.
 *
 * Methods below should only be used POST requests.
 */
public interface CRUD {
    @RequireCSRFCheck
    CompletionStage<Result> create();
    @RequireCSRFCheck
    CompletionStage<Result> delete();
    @RequireCSRFCheck
    CompletionStage<Result> update();

    CompletionStage<Result> edit();
    CompletionStage<Result> read();
}
