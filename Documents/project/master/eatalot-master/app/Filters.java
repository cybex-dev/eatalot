import play.filters.csrf.CSRFFilter;
import play.http.DefaultHttpFilters;

import javax.inject.Inject;

/**
 * Created by dylan on 2017/07/26.
 */
public class Filters extends DefaultHttpFilters {
    @Inject
    public Filters(CSRFFilter csrfFilter) {
        super(csrfFilter);
    }
}