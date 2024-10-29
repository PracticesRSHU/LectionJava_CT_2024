package Lection7_8.example_Enum;

import java.util.Scanner;

public class AppTest {
	static void menu() {
		String textMenu =  "Menu:\n" + "1. Перевірити чи є такий місяць \n"
				+ "2. Вивести всі місяці з такою ж порою року\n"
				+ "3. Вивести всі місяці, які мають таку саму кількість днів\n"
				+ "4. Вивести на екран всі місяці, які мають меншу кількість днів\n"
				+ "5. Вивести на екран всі місяці, які мають більшу кількість днів\n"
				+ "6. Вивести на екран наступну пору року";
		System.out.println(textMenu);
	}

	public static void main(String[] args) {
		Months[] arrMonths = Months.values();
		//System.out.println( arrMonths[0].getSeason().name());
		Seasons[] arrSeasons = Seasons.values();
		Scanner sc = new Scanner(System.in);
		while (true) {
			menu();
			switch (sc.nextInt()) {
			case 1: {
				System.out.println("Input month:");
				String month = sc.next().toUpperCase();
//				boolean flag = false;
				for (Months m : arrMonths) {
					if (m.name().equals(month)) {
						System.out.println("There is such a month");
				 }
				}
				break;
			}
			case 2: {
				System.out.println("Input season:");
				String season = sc.next();
				boolean flag = false;
				for (Months m : arrMonths) {
					if (m.getSeason().name().equalsIgnoreCase(season)) {
						System.out.println(m.name() + " " + m.getDays());
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("Season not exist!");
				}

				break;
			}
			case 4: {
				System.out.println("Input count days:");
				int day = sc.nextInt();
				boolean flag = false;
				for (Months m : arrMonths) {
					if (m.getDays() < day) {
						System.out.println(m);
						flag = true;
					}
				}

				if (!flag) {
					System.out.println("Month not exist that is less !" + day);
				}
			}
			case 6:{
				System.out.println("Input season:");
				String season = sc.next().toUpperCase();
				boolean flag = false;
				for(Seasons s: arrSeasons) {
					if(s.name().equals(season)) {
						flag=true;
					}
				}
				if(flag) { 
					Seasons season_current=Seasons.valueOf(season);
					int ordinal=season_current.ordinal();
					if(ordinal==arrSeasons.length-1) {
						ordinal=0;
					}else {
						ordinal+=1;
					}
					System.out.println("Next season: "+arrSeasons[ordinal]);
				}else {
					System.out.println("Season not exist!");
				}
				
			}
			default:
				System.exit(0);
			}
		}

	}

}

/*
 Створити enum Months, в якому створити 12 констант- місяці року (Січень , Лютий.. Грудень ), оголосити змінну days, та змінну season типу Seasons, як поле enum. Створити конструктор з визначеними параметрами в  enum Months, в який як параметри передати змінну days та season. Описати getters до даних полів (days, season ). Створити консольне меню, в якому реалізувати наступні пункти :

Перевірити чи є такий місяць (місяць вводимо з консолі, передбачити, щоб регістр букв був не важливим);
Вивести всі місяці з такою ж порою року
Вивести всі місяці які мають таку саму кількість днів
Вивести на екран всі місяці які мають меншу кількість днів
Вивести на екран всі місяці які мають більшу кількість днів
Вивести на екран наступну пору року
Вивести на екран попередню пору року
Вивести на екран всі місяці які мають парну кількість днів
Вивести на екран всі місяці які мають непарну кількість днів
Вивести на екран чи введений з консолі місяць має парну кількість днів
 */