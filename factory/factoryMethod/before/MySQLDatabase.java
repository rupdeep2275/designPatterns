package before;

public class MySQLDatabase implements Database{
    @Override
    public void setUrl() {

    }

    @Override
    public void setHostname() {

    }

    @Override
    public DatabaseType getType() {
        return DatabaseType.MYSQL;
    }
}
