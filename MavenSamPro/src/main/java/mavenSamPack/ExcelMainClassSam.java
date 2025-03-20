package mavenSamPack;

import java.io.IOException;

public class ExcelMainClassSam {

	public static void main(String[] args) throws IOException {


		System.out.println(ExcelReading.getStringData(1,0));
		System.out.println(ExcelReading.getIntegerData(1,1));

	}

}
