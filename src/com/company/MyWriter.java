package com.company;
import java.io.*;

/**
 * Created by RENT on 2017-05-31.
 */
public class MyWriter {

	private String fileName = "c:/temp/write_file.txt";
	private FileOutputStream fos = null;
	private BufferedWriter bw = null;

	public MyWriter(String fileName) {
		this.fileName = fileName;
	}

	public int[][] writeToFile (int[][] table){

		try {
			fos = new FileOutputStream(this.fileName);
			bw = new BufferedWriter(new OutputStreamWriter(fos, "UTF-8"));

			//bw.write(Integer.toString(table.length * table[0].length));
			//bw.write("\n");

			for (int i = 0; i < table.length; i++){
				for(int j = 0; j < table[i].length; j++){
					bw.write(Integer.toString(table[i][j]));
					//bw.write(";");
					bw.write("\n");
				}
			}

			bw.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


		return table;

	}


}
