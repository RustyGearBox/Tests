public class Appointment {

    private int counter;
    private String date;
    private String time;
    private Doctor doctor;
    private static int counterAppointment = 1;

    public Appointment(String date, String time, Doctor doctor) {
        this.counter = counterAppointment++;
        this.date = date;
        this.time = time;
        this.doctor = doctor;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }



}
