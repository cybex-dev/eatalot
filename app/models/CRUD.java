package models;

import play.mvc.Result;

/**
 * Created by cybex on 2017/07/16.
 */
public interface CRUD {
    Result create();
    Result save();

    Result delete();

    Result edit();
    Result update();

    Result read();
}
