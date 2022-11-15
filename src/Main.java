public class Main {
    public static void main(String[] args) {
        //Task 1
        int Age = 19;
        if (Age >= 18) {
            System.out.println("Поздравляем");
        }
        if (Age < 18) {
            System.out.println("Подожди");
        }


        //Task 2
        if (Age >= 7 && Age < 18) {
            System.out.println("Школьник");
            if (Age >= 18 && Age < 24) {
                System.out.println("Студент");
                if (Age >= 24) {
                    System.out.println("Взрослый");
                }
            }
        }
        //Task 3
        int trainCapacity = 102;
        int sitPlaces = 60;
        int sitPlacesTaken = 59;
        int standPlaces = trainCapacity - sitPlaces;
        int standPlacesTaken = 39;
        if (sitPlacesTaken == sitPlaces) {
            System.out.println("сидячих мест нету");
        }
        if (sitPlaces > sitPlacesTaken) {
            System.out.println("свободно сидячее место");
        }
        if (standPlaces == standPlacesTaken) {
            System.out.println("все стоячие места заняты");
        }
        if (standPlaces>standPlacesTaken){
            System.out.println("свободны стоячие места");
        }
        if (trainCapacity == sitPlacesTaken + standPlacesTaken)
            System.out.println("свободных мест нет");


        //Task 4
        int age = 19;
        if (age >= 18) {
            System.out.println("Поздравляем");
        } else {
            System.out.println("Подожди");
        }

        //Task 5
        if (age >= 7 && age < 18) {
            System.out.println("Школьник");
            {

                if (age >= 18 && age < 24) {
                    System.out.println("Студент");

                } else {
                }
                System.out.println("Взрослый");
            }


        }
        //Task 6
        int trainCapacity1 = 102;
        int sitPlaces1 = 60;
        int sitPlacesTaken1 = 60;
        int standPlaces1 = trainCapacity1 - sitPlaces1;
        int standPlacesTaken1 = 42;
        if (sitPlacesTaken1 == sitPlaces1) {
            System.out.println("сидячих мест нету");
        }
        if (sitPlaces1 > sitPlacesTaken1) {
            System.out.println("свободно сидячее место");
        }
        if (standPlaces1 == standPlacesTaken1) {
            System.out.println("все стоячие места заняты");
        }
        if (standPlaces1>standPlacesTaken1){
            System.out.println("свободны стоячие места");
        }
       else
            System.out.println("свободных мест нет");


        //Task 7
        int age1 = 4;
        if (age1 >= 2 && age1<=6){
            System.out.println("Сад");
        }
        if (age1 >=7 && age1 <18){
            System.out.println("школа");
        }
        else if (age1 >= 18 && age1 < 24){
            System.out.println("универ");
        }
        else if (age1 > 24){
            System.out.println("работа");
        }
       //Task 8
        if (age1 <5){
            System.out.println("нельзя кататься");
        }
        else if (age1 > 5 && age1 <14){
            System.out.println("нельзя кататься без взрослых");
        }
        else {
            System.out.println("можно");
        }
       //Task 9
        int one = 4;
        int two = 2;
        int three = 3;
        if (one > two && one > three){
            System.out.println(one +" самое большое число");
        }
        if (two > one&& two > three)
            System.out.println(two +" самое большое число");
        else {
            System.out.println(three +" самое большое число");
    }
    }





    }


