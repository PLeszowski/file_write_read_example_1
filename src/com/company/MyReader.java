package com.company;

import java.io.*;

/**
 * Created by RENT on 2017-05-31.
 */
public class MyReader {


	private FileInputStream fis = null;
	private BufferedReader br = null;

	public MyReader() {

	}

	public void readFile (String fileName) {

		try {
			fis = new FileInputStream(fileName);
			br = new BufferedReader(new InputStreamReader(fis, "UTF-8"));

			String line = br.readLine();
			int fileLines = Integer.parseInt(line);

			for (int i = 0; i < fileLines; i++){
				line = br.readLine();
				System.out.println(line);
			}



		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
