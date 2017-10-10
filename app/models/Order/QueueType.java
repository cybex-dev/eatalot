package models.Order;

import controllers.Application.AppTags;
import io.ebean.Model;
import play.data.validation.Constraints;
import utility.RandomString;

import javax.persistence.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by cybex on 2017/07/13.
 */
@Entity
public class QueueType extends Model{
    @Id
    private String typeId;
    @Constraints.Required
    private String type;
    @Constraints.Required
    private String description;

    QueueType(@Constraints.Required String type, @Constraints.Required String description) {
        this.type = type;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return  type + " {" +
                "description=\'" + description + '\'' +
                '}';
    }

    @Override
    public void insert() {
        typeId = new RandomString(16, ThreadLocalRandom.current()).nextString();
        super.insert();
    }
}
