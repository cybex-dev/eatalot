package models.User.Customer;

import utility.DashboardButton;

enum EntryType {
    ActiveOrder;
}

public class DashboardEntries {
    public int index;
    public EntryType type;

    public DashboardEntries(int index, EntryType type, Object object){

    }
}
