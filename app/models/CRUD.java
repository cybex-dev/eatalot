package models;

import play.mvc.Result;

import java.util.concurrent.CompletionStage;

/**
 * Created by cybex on 2017/07/16.
 *
 * Methods below should only be used POST requests.
 */
public interface CRUD {
    CompletionStage<Result> create();
    CompletionStage<Result> delete();
    CompletionStage<Result> update();
    CompletionStage<Result> read();
}
