package after;

public class MySQLDatabase implements Database {
    @Override
    public void setUrl() {

    }

    @Override
    public void setHostname() {

    }

    @Override
    public DatabaseType getType() {
        return DatabaseType.MONGODB;
    }

    @Override
    public Query createQuery() {
        return new MySQLQuery();
    }
}
