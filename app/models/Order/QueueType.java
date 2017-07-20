package models.Order;

import io.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by cybex on 2017/07/13.
 */
@Entity
public class QueueType extends Model{

    @Id
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
}
