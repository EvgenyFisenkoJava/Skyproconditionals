package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //задание 1
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Install IOS app from the link");
        }
        else {
            System.out.println("Install Android app from the link");
        }

        //задание 2
        int clientsOS = 1;
        int clientDeviceYear = 2013;

        if (clientsOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Install IOS app from the link");
        }
        else if (clientsOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Install the light version of IOS app from the link");
        }
        else if (clientsOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Install Android app from the link");
        }
        else {
            System.out.println("Install the light version of Android app from the link");
        }

        //задание 3

        int year = 2000;
        boolean leap = year % 4 == 0;
        boolean notLeap = year % 100 != 0;
        boolean alsoNotLeap = year % 100 == 0 && year % 400 ==0;
        if (leap && notLeap || alsoNotLeap)  {
            System.out.println("the year is leap");
        }
        else {
            System.out.println("the year is not leap");
        }

        //задание 4

        int deliveryDistance = 95;
        int oneDayDelivery = 20;
        int intervalKm = 40;
        int range = oneDayDelivery + intervalKm;
        int deliveryTime = 1;

        if (deliveryDistance < oneDayDelivery) {
                        System.out.println("Delivery time is " + deliveryTime + " days");
        }
            if (deliveryDistance >= oneDayDelivery && deliveryDistance < range ) {
                deliveryTime = deliveryTime+1;
            System.out.println("Delivery time is " + deliveryTime + " days");
                    }
            else if (deliveryDistance >= range && deliveryDistance < range + intervalKm) {
                deliveryTime = deliveryTime + 2;

                System.out.println("Delivery time is " + deliveryTime + " days");
            }
            else {
                deliveryTime = deliveryTime + 2;
                System.out.println("Delivery time is more than " + deliveryTime + " days");
            }







        //задание 5

        int monthNumber = 2;
        switch (monthNumber) {
            case 12: case 1: case 2:
                System.out.println("winter"); break;
            case 3: case 4: case 5:
                System.out.println("spring"); break;
            case 6: case 7: case 8:
                System.out.println("summer"); break;
            case 9: case 10: case 11:
                System.out.println("fall"); break;
            default:
                System.out.println("invalid month");

        }











    }
}
