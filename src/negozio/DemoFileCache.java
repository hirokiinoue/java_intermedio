package negozio;

import java.io.FileInputStream;
import java.util.Scanner;

public class DemoFileCache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileCache f = new FileCache(new ArchivioFile());
		
		//String f1 = f.leggi("C:\\Users\\corso1\\Documents\\JAVAINTERMEDIO\\FileRead\\text1.txt");
		String percorso = "C:\\Users\\corso1\\Documents\\JAVAINTERMEDIO\\FileRead\\text1.txt";
		
		int livello;
		try{
			livello = Integer.parseInt(percorso.substring(percorso.length()-1,percorso.length()));			
		} catch (Exception e)
		{
			livello = 99;
		}
		
		String f1 = f.leggi(percorso);
		System.out.println(f1);
		
		
//		String f2 = f.leggi("C:\\Users\\corso1\\Documents\\JAVAINTERMEDIO\\FileRead\\text2.txt");
//		System.out.println(f2);
//
//		String f3 = f.leggi("C:\\Users\\corso1\\Documents\\JAVAINTERMEDIO\\FileRead\\text3.txt");
//		System.out.println(f3);
//
//		String f4 = f.leggi("C:\\Users\\corso1\\Documents\\JAVAINTERMEDIO\\FileRead\\text4.txt");
//		System.out.println(f4);
//
//		String f5 = f.leggi("C:\\Users\\corso1\\Documents\\JAVAINTERMEDIO\\FileRead\\text5.txt");
//		System.out.println(f5);
//
//		String f6 = f.leggi("C:\\Users\\corso1\\Documents\\JAVAINTERMEDIO\\FileRead\\text6.txt");
//		System.out.println(f6);
//
//		String f7 = f.leggi("C:\\Users\\corso1\\Documents\\JAVAINTERMEDIO\\FileRead\\text7.txt");
//		System.out.println(f7);
//
//		String f8 = f.leggi("C:\\Users\\corso1\\Documents\\JAVAINTERMEDIO\\FileRead\\text8.txt");
//		System.out.println(f8);
//
//		String f9 = f.leggi("C:\\Users\\corso1\\Documents\\JAVAINTERMEDIO\\FileRead\\text9.txt");
//		System.out.println(f9);
//
//		String f10 = f.leggi("C:\\Users\\corso1\\Documents\\JAVAINTERMEDIO\\FileRead\\text10.txt");
//		System.out.println(f10);
}

}
