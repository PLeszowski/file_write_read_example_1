package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by RENT on 2017-05-31.
 */
public class MyReader {


	public MyReader() {

	}

	public void readFile(String fileName) {

		try {
			Files.lines(Paths.get(fileName))
					.sorted()
					.mapToInt(line -> Integer.parseInt(line))
					.filter(i -> i > 3)
					.forEach(line -> System.out.println(line));

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
