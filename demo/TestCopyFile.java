package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TestCopyFile {

	public static void main(String[] args) throws IOException {
		File sourceSrc = new File("/home/tom/workspace/demo/src/demo/test.txt");
		File destSrc = new File("/home/tom/workspace/demo/src/demo/test.jpg");
		InputStream source = new FileInputStream(sourceSrc);
		OutputStream dest = new FileOutputStream(destSrc);
		int len = 0;
		byte[] flush = new byte[1024];
		while(-1 != (len = source.read(flush))){
			dest.write(flush, 0, len);
		}
		dest.flush();
		
		dest.close();
		source.close();
	}
	

}
