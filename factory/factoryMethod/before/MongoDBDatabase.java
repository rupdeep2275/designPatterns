package before;


public class MongoDBDatabase implements Database {
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
}
