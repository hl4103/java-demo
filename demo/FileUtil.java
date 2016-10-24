package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileUtil {

	/**
	 * 复制文件
	 * 
	 * @param src
	 * @param dest
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void copyFile(File src, File dest) throws FileNotFoundException, IOException {
		if (!src.isFile()) {
			System.out.println("只能拷贝文件");
			throw new IOException("只能拷贝文件");
		}
		if (!dest.isDirectory()) {
			System.out.println("不能建立于文件夹同名的文件");
			throw new IOException("不能建立于文件夹同名的文件");
		}
		InputStream source = new FileInputStream(src);
		OutputStream dests = new FileOutputStream(dest);
		int len = 0;
		byte[] flush = new byte[1024];
		while (-1 != (len = source.read(flush))) {
			dests.write(flush, 0, len);
		}
		dests.flush();

		dests.close();
		source.close();
	}

	/**
	 * 复制文件
	 * 
	 * @param srcPath
	 * @param destPath
	 */
	public static void copyFile(String srcPath, String destPath) {
		try {
			copyFile(new File(srcPath), new File(destPath));
		} catch (FileNotFoundException e) {
			System.out.println("文件不存在");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("文件操作失败");
			e.printStackTrace();
		}
	}

	/**
	 * 复制目录
	 * 
	 * @param srcPath
	 * @param destPath
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public static void copyDir(String srcPath, String destPath) throws FileNotFoundException, IOException {
		copyDir(new File(srcPath), new File(destPath));
	}

	/**
	 * 复制目录
	 * 
	 * @param src
	 * @param dest
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public static void copyDir(File src, File dest) throws FileNotFoundException, IOException {
		if (src.isDirectory()) {
			dest = new File(dest, src.getName());
		}
		copyDirDetail(src, dest);
	}

	/**
	 * 目录的复制
	 * 
	 * @param src
	 * @param dest
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public static void copyDirDetail(File src, File dest) throws FileNotFoundException, IOException {
		if (src.isDirectory()) {
			dest.mkdirs();
			for (File sub : src.listFiles()) {
				copyDir(sub, new File(dest, sub.getName()));
			}
		} else if (src.isFile()) {
			try {
				copyFile(src, dest);
			} catch (FileNotFoundException e) {
				// e.printStackTrace();
				throw e;
			} catch (IOException e) {
				// e.printStackTrace();
				throw e;
			}
		} else {
			throw new IOException("操作错误");
		}
	}
}
