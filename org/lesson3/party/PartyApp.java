package com.proftelran.org.lesson3.party;

public class PartyApp {
    public static void main(String[] args) {

        Man alex = new Man("Alex",45);
        Man oleg = new Man("Oleg", 30);
        Women alla = new Women("Alla", 20);
        Women maria = new Women("Maria", 31);
        Child child = new Child("Maxim", "M", 7);
        GrandFather mike = new GrandFather("Mike", 90);

        Guest[] guests = {alex,oleg,alla,maria,child, mike};


        for (Guest guest : guests){
            guest.printGreetings();
        }

        DrinkAlcohol[] drinker = new DrinkAlcohol[10];
        LikeDance[] dancer = new LikeDance[10];
        Sleep[] sleeper = new Sleep[10];
        sortGuest(guests, drinker, dancer, sleeper);

        for (DrinkAlcohol element : drinker){
            if (element!=null) {
                element.drink();

            }

        }
        for (LikeDance element: dancer){
           if (element!=null){
               element.dance();
           }
        }
        for (Sleep element : sleeper){
            if (element!=null){
                element.sleep();
            }

        }

    }

    private static void sortGuest(Guest[] guests,  DrinkAlcohol[] drinker, LikeDance[] dancer, Sleep[] sleeper){
        int daIndex = 0;
        int ldIndex = 0;
        int slIndex = 0;
        for (Guest guest : guests) {

            if (guest instanceof DrinkAlcohol) {
                drinker[daIndex++] = (DrinkAlcohol) guest;

            }
            if (guest instanceof LikeDance) {
                dancer[ldIndex++] = (LikeDance) guest;

            }
            if (guest instanceof Sleep) {
                sleeper[slIndex++] = (Sleep) guest;

            }
        }
    }
}
