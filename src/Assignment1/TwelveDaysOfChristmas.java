package Assignment1;

import java.util.Scanner;

public class TwelveDaysOfChristmas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                Enter a day of Christmas between 1 and 12 :
                1 -> [Verse 1]
                2 -> [Verse 2]
                3 -> [Verse 3]
                4 -> [Verse 4]
                5 -> [Verse 5]
                6 -> [Verse 6]
                7 -> [Verse 7]
                8 -> [Verse 8]
                9 -> [Verse 9]
                10 -> [Verse 10]
                11 -> [Verse 11]
                12 -> [Verse 12]
                """);
        int day = scan.nextInt();
            while (day > 12) {

                System.out.println("""
                        Selection not available !
                        Enter a day between 1 and 12 to select a verse of the TWELVE DAYS OF CHRISTMAS :
                        """);
                day = scan.nextInt();
            }
        switch (day) {
            case 1 -> System.out.println("""
                    [Verse 1]
                    On the first day of Christmas, my true love sent to me
                    A partridge in a pear tree""");
            case 2 -> System.out.println("""
                    [Verse 2]
                    On the second day of Christmas, my true love sent to me
                    Two turtle doves, and
                    A partridge in a pear tree""");
            case 3 -> System.out.println("""
                    [Verse 3]
                    On the third day of Christmas, my true love sent to me
                    Three french hens
                    Two turtle doves, and
                    A partridge in a pear tree""");
            case 4 -> System.out.println("""
                    [Verse 4]
                    On the fourth day of Christmas, my true love sent to me
                    Four calling birds
                    Three french hens
                    Two turtle doves, and
                    A partridge in a pear tree""");
            case 5 -> System.out.println("""
                    [Verse 5]
                    On the fifth day of Christmas, my true love sent to me
                    Five golden rings
                    Four calling birds
                    Three french hens
                    Two turtle doves, and
                    A partridge in a pear tree""");
            case 6 -> System.out.println("""
                    [Verse 6]
                    On the sixth day of Christmas, my true love sent to me
                    Six geese a-laying
                    Five golden rings
                    Four calling birds
                    Three french hens
                    Two turtle doves, and
                    A partridge in a pear tree""");
            case 7 -> System.out.println("""
                    [Verse 7]
                    On the seventh day of Christmas, my true love sent to me
                    Seven swans a-swimming
                    Six geese a-laying
                    Five golden rings
                    Four calling birds
                    Three french hens
                    Two turtle doves, and
                    A partridge in a pear tree""");
            case 8 -> System.out.println("""
                    [Verse 8]
                    On the eighth day of Christmas, my true love sent to me
                    Eight maids a-milking
                    Seven swans a-swimming
                    Six geese a-laying
                    Five golden rings
                    Four calling birds
                    Three french hens
                    Two turtle doves, and
                    A partridge in a pear tree""");
            case 9 -> System.out.println("""
                    [Verse 9]
                    On the ninth day of Christmas, my true love sent to me
                    Nine ladies dancing
                    Eight maids a-milking
                    Seven swans a-swimming
                    Six geese a-laying
                    Five golden rings
                    Four calling birds
                    Three french hens
                    Two turtle doves, and
                    A partridge in a pear tree""");
            case 10 -> System.out.println("""
                    [Verse 10]
                    On the tenth day of Christmas, my true love sent to me
                    Ten lords a-leaping
                    Nine ladies dancing
                    Eight maids a-milking
                    Seven swans a-swimming
                    Six geese a-laying
                    Five golden rings
                    Four calling birds
                    Three french hens
                    Two turtle doves, and
                    A partridge in a pear tree""");
            case 11 -> System.out.println("""
                    [Verse 11]
                    On the eleventh day of Christmas, my true love sent to me
                    Eleven pipers piping
                    Ten lords a-leaping
                    Nine ladies dancing
                    Eight maids a-milking
                    Seven swans a-swimming
                    Six geese a-laying
                    Five golden rings
                    Four calling birds
                    Three french hens
                    Two turtle doves, and
                    A partridge in a pear tree""");
            case 12 -> System.out.println("""
                    [Verse 12]
                    On the twelfth day of Christmas, my true love sent to me
                    Twelve drummers drumming
                    Eleven pipers piping
                    Ten lords a-leaping
                    Nine ladies dancing
                    Eight maids a-milking
                    Seven swans a-swimming
                    Six geese a-laying
                    Five golden rings
                    Four calling birds
                    Three french hens
                    Two turtle doves, and
                    A partridge in a pear tree
                    """);
        }
        }

    }