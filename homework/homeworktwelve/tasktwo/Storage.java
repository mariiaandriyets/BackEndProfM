package com.proftelran.homework.homeworktwelve.tasktwo;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Storage {
    public static void main(String[] args) {
        HashMap<User, List<UserRequest>> userMap = new HashMap<>();

        UserRequest userRequestOne = new UserRequest("www.de.de", Answer.APPROVED);
        UserRequest userRequestTwo = new UserRequest("www.ebay.de", Answer.DENIED);
        UserRequest userRequestThree = new UserRequest("www.amazon.de", Answer.DENIED);
        UserRequest userRequestFour = new UserRequest("www.ebay.blabla", Answer.ERROR);
        UserRequest userRequestFive = new UserRequest("www.uklon.de", Answer.DENIED);
        UserRequest userRequestSix = new UserRequest("www.skilldesk.starta.university", Answer.APPROVED);
        UserRequest userRequestSeven = new UserRequest("www.gdz.math.ru", Answer.APPROVED);
        UserRequest userRequestEight = new UserRequest("www.telran.de", Answer.ERROR);

        List<UserRequest> userOneList = List.of(userRequestOne);
        List<UserRequest> userTwoList = List.of(userRequestTwo, userRequestThree);
        List<UserRequest> userThreeList = List.of(userRequestSix, userRequestEight);
        List<UserRequest> userFourList = List.of(userRequestFive, userRequestSeven, userRequestFour);

        User maria = new User("Maria",1);
        User alex = new User("Alex",2);
        User dmitriy = new User("Dmitriy",3);
        User oleg = new User("Oleg",4);

        userMap.put(maria, userOneList);
        userMap.put(alex, userTwoList);
        userMap.put(dmitriy, userThreeList);
        userMap.put(oleg, userFourList);

        Scanner scanner = new Scanner(System.in);
        System.out.println("View visit statistics for the selected user. Enter: 1 for Maria," +
                " 2 for Alex, 3 for Dmitriy, 4 for Oleg");
        int user = scanner.nextInt();
        scanner.close();
        switch (user) {

            case 1:  if (userMap.containsKey(maria)) {
                List<UserRequest> visitsMaria = userMap.get(maria);
                System.out.println("Visits for Maria = " + visitsMaria );
                System.out.println("Count of visits for Maria = " + visitsMaria.size());
            }
            break;
            case 2:
                if (userMap.containsKey(alex)) {
                    List<UserRequest> visitsALex = userMap.get(alex);
                    System.out.println("Visits for Alex by key = " + visitsALex);
                    System.out.println("Count of visits for Alex = " + visitsALex.size());
                }
                break;
            case 3:
                if (userMap.containsKey(dmitriy)) {
                    List<UserRequest> visitsDmitriy = userMap.get(dmitriy);
                    System.out.println("Visits for Dmitriy by key = " + visitsDmitriy);
                    System.out.println("Count of visits for Dmitriy = " + visitsDmitriy.size());
                }
                break;
            case 4:
                if (userMap.containsKey(oleg)) {
                    List<UserRequest> visitsOleg = userMap.get(oleg);
                    System.out.println("Visits for Oleg by key = " + visitsOleg);
                    System.out.println("Count of visits for Oleg = " + visitsOleg.size());
                }
                break;
            default:
                System.out.println("There is no such a user");
        }
    }
}
