package day02;

public class Schedule {
    private String date;
    private int getWork;
    private int getOff;

    public Schedule(String date, int getWork, int getOff) {
        this.date = date;
        this.getWork = getWork;
        this.getOff = getOff;
    }
    
    public void timetable() {
        System.out.println("요일: " + this.date);
        System.out.println("출근: " + this.getWork);
        System.out.println("퇴근: " + this.getOff);
    }
    
}
