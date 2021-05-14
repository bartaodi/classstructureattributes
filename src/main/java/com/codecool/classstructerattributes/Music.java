package com.codecool.classstructerattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Song song = new Song();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Who is your favourite band?");
        song.band = scanner.nextLine();
        System.out.println("What is the title of your favourite song?");
        song.title = scanner.nextLine();
        System.out.println("What is the length of the song?");
        song.length = scanner.nextInt();

        System.out.println("Band: " + song.band);
        System.out.println("Title: " + song.title);
        System.out.println("Length: " + song.length);
    }
}
