public class Main
{
    public static void main(String[] args)
    {
        House building_1 = new House(0,0,0,0); // дом 1
        building_1.setFloors(12); //вызов метода вывод параметров
        building_1.setFounding_year(1953); //вызов метода вывод параметров
        building_1.setNumber(1); //вызов метода вывод параметров
        building_1.getResult();

       // building_1.age_House(getResult()); // вызов метода возраст дома
        System.out.println(building_1);

        House building_2 = new House(0,0,0,0); // дом 2
        building_2.setFloors(12); //вызов метода вывод параметров
        building_2.setFounding_year(1921); //вызов метода вывод параметров
        building_2.setNumber(2); //вызов метода вывод параметров
        //building_2.age_House(); // вызов метода возраст дома
        System.out.println(building_2);
    }
}