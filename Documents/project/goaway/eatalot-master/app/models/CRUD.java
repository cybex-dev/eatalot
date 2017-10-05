package models;

import play.mvc.Result;

/**
 * Created by cybex on 2017/07/16.
 *
 * Methods below should only be used POST requests.
 */
public interface CRUD {
    Result create();
    Result delete();
    Result update();
    Result read();
}
