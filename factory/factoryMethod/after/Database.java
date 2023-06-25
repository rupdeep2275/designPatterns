package after;

public interface Database {
    void setUrl();

    void setHostname();

    DatabaseType getType();

    //factory method
    Query createQuery();
}
