/*
 * 
 */
package Entity;

import java.time.LocalDate;

/**
 *
 * @author Angelica
 */
public class Course {
    
    private String courseName;
    private int dailyHours;
    private int weeklyDays;
    private String shift;
    private int hourlyPrice;
    private String[] alumni = new String[5];

    public Course() {
    }       

    public Course(String courseName, int dailyHours, int weeklyDays, String shift, int hourlyPrice, String[] alumni) {
        this.courseName = courseName;
        this.dailyHours = dailyHours;
        this.weeklyDays = weeklyDays;
        this.shift = shift;
        this.hourlyPrice = hourlyPrice;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getDailyHours() {
        return dailyHours;
    }

    public void setDailyHours(int dailyHours) {
        this.dailyHours = dailyHours;
    }

    public int getWeeklyDays() {
        return weeklyDays;
    }

    public void setWeeklyDays(int weeklyDays) {
        this.weeklyDays = weeklyDays;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public double getHourlyPrice() {
        return hourlyPrice;
    }

    public void setHourlyPrice(int hurlyPrice) {
        this.hourlyPrice = hurlyPrice;
    }

    public String[] getAlumni() {
        return alumni;
    }

    public void setAlumni(String[] alumni) {
        this.alumni = alumni;
    }

    @Override
    public String toString() {
        return "Course{" + "courseName=" + courseName + ", dailyHours=" + dailyHours + ", weeklyDays=" + weeklyDays + ", shift=" + shift + ", hourlyPrice=" + hourlyPrice + ", alumni=" + alumni + '}';
    }
    
    
}
