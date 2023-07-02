public class DBConn {
    private DBConn(){
    }

    private static Lock lock = new ReentrantLock();
    private static DBConn inst;
    public static DBConn getInstance(){
        if(inst == null){
            lock.lock();
            if(inst == null){
                inst = new DBConn();
            }
            lock.unlock();
        }

        return inst;
    }
}