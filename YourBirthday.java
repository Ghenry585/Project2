/* Gary Henry
CIS 219 Tuesdays and Thursday 3:30pm to 5:30pm
Proffesor: Mr. Swinarski
12/17/2021
Project 2*/

import java.time.LocalDate; //import localdate util
import java.time.Period; //import period util
import java.util.Scanner; //import scanner util

public class YourBirthday {
    public static int year; // create perm variable for year
    public static int month; // create perm variable for month
    public static int day; // creat perm variable for day

    // getMonth method gets user input, verifies correct range
    public static void getMonth() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your birth month:");
        month = (int) scan.nextInt();
        if (month > 12) {
            getMonth();
        } else if (month == 0) {
            getMonth();
        }

    }

    // getYear gets user input, verifies number range
    public static void getYear() {
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter your birth year:");
        year = (int) scan2.nextInt();
        if (year > 2022) {
            getYear();
        } else if (year == 0) {
            getYear();
        }
    }

    // getDay method gets user input, verifies number range
    public static void getDay() {
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Enter your birth day:");
        day = (int) scan3.nextInt();
        if (day > 31) {
            getDay();
        } else if (day == 0) {
            getDay();
        }
    }

    // customMessage method prints out custom birthday message based on user input
    public static void customMessage() {

        switch (month) {
            case 1:
                System.out.println("Your born in January!");
                if (day <= 20) {
                    System.out.println("Your zodiac sign is Capricorn!");
                } else {
                    System.out.println("Your zodiac sign is Aquarius!");
                }
                break;
            case 2:
                System.out.println("Your born in February!");
                if (day <= 18) {
                    System.out.println("Your zodiac sign is Aquarius!");
                } else {
                    System.out.println("Your zodiac sign is Pisces!");
                }
                break;
            case 3:
                System.out.println("Your born in March!");
                if (day <= 20) {
                    System.out.println("Your zodiac sign is Pisces!");
                } else {
                    System.out.println("Your zodiac sign is Aries!");
                }
                break;
            case 4:
                System.out.println("Your born in April!");
                if (day <= 20) {
                    System.out.println("Your zodiac sign is Aries!");
                } else {
                    System.out.println("Your zodiac sign is Taurus!");
                }
                break;
            case 5:
                System.out.println("Your born in May!");
                if (day <= 20) {
                    System.out.println("Your zodiac sign is Taurus!");
                } else {
                    System.out.println("Your zodiac sign is Gemini!");
                }
                break;
            case 6:
                System.out.println("Your born in June!");
                if (day <= 20) {
                    System.out.println("Your zodiac sign is Gemini!");
                } else {
                    System.out.println("Your zodiac sign is Cancer!");
                }
                break;
            case 7:
                System.out.println("Your born in July!");
                if (day <= 21) {
                    System.out.println("Your zodiac sign is Cancer!");
                } else {
                    System.out.println("Your zodiac sign is Leo!");
                }
                break;
            case 8:
                System.out.println("Your born in August!");
                if (day <= 21) {
                    System.out.println("Your zodiac sign is Leo!");
                } else {
                    System.out.println("Your zodiac sign is Virgo!");
                }
                break;
            case 9:
                System.out.println("Your born in September!");
                if (day <= 21) {
                    System.out.println("Your zodiac sign is Virgo!");
                } else {
                    System.out.println("Your zodiac sign is Libra!");
                }
                break;
            case 10:
                System.out.println("Your born in October!");
                if (day <= 21) {
                    System.out.println("Your zodiac sign is Libra!");
                } else {
                    System.out.println("Your zodiac sign is Scorpio!");
                }
                break;
            case 11:
                System.out.println("Your born in November!");
                if (day <= 22) {
                    System.out.println("Your zodiac sign is Scorpio!");
                } else {
                    System.out.println("Your zodiac sign is Sagittarius!");
                }
                break;
            case 12:
                System.out.println("Your born in December!");
                if (day <= 20) {
                    System.out.println("Your zodiac sign is Saggitarius!");
                } else {
                    System.out.println("Your zodiac sign is Capricorn!");
                }
                break;
        }
    }

    // printBirthday method prints out user entire birthday in format month/day/year
    public static void printBirthday() {
        System.out.println("Your birthday is " + month + "/" + day + "/" + year + ".");
    }

    public static void main(String[] args) {// main method
        // Get birth month input from the user, throw exception if input invalid
        try {
            getMonth();
        } catch (Exception e) {
            System.out.println("Enter your birth month...it must be a number between 1-12.");
            getMonth();
        }

        // Get birth day input from the user, throw exception if input invalid
        try {
            getDay();
        } catch (Exception e) {
            System.out.println(
                    "Enter your birth day...it must be a number between 1-31 (between 1 - 28 if your birthday is in February).");
            getDay();
        }
        // Get birth year input from the user, throw exception if input invalid
        try {
            getYear();
        } catch (Exception e) {
            System.out.println("Enter your birth year...it must be a number between 0 and the current date.");
            getYear();
        }
        // Get current date
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(year, month, day);
        // compare birthday to current year to get age
        int ageYears = Period.between(birthDate, today).getYears();
        // Print output for age
        System.out.println("You are " + ageYears + " " + "old!");
        // print customized message depending on user input
        customMessage();
        printBirthday();
    }
}
