package src.com.company;

public class Table implements ThingName {

    private String name;
    private String actionWithTable;
    public String changeName = "столом";

    Table(String name) {
        this.name = name;
    }

    public void setActionWithTable(String action) {
        this.actionWithTable = action;
    }

    public void setChangeName(String action) {
        this.changeName = action;
    }

    public String getChangeName() {
        return changeName;
    }

    @Override
    public String getName() {
        return name;
    }
}
