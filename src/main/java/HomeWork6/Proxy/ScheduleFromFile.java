package HomeWork6.Proxy;

public class ScheduleFromFile implements ISchedule {
    @Override
    public String[] getSchedule() {
        return new String[]{"test1,12-00","test2,15-00","test3,18-00"};
    }

}