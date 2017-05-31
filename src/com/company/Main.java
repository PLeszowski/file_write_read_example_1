package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		int[][] table = {{5,2,6}, {1,3,9}, {7,4,8}};

		MyWriter fw = new MyWriter("c:/temp/write_file.txt");
		fw.writeToFile(table);

		MyReader fr = new MyReader();
		fr.readFile("c:/temp/write_file.txt");



	}
}
