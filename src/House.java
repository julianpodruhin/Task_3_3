import java.util.Scanner;
public class House
{
    private int floors;
    private int founding_year;
    private int number;
    private int result;
    public House(int floors, int founding_year,int number, int result)
    {
        this.floors = floors;
        this.founding_year = founding_year;
        this.number = number;
        this.result=result;
    }
    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getFounding_year() {
        return founding_year;
    }

    public void setFounding_year(int founding_year) {
        this.founding_year = founding_year;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public static int age_House(int founding_year)
    {
        int result;
        result = 2022 - founding_year;
        return result;
    }
    public String toString() {
        return "House{" +
                " number " + number + '\'' +
                ", floors=" + floors +
                ", founding_year=" + founding_year +
                ", age of house -" + result +
                '}';
    }
}
