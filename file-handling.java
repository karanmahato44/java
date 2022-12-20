import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Source file to read from? (abc.txt) : ");
        String readMsg = s.nextLine();
        File x = new File(readMsg);
        System.out.print("Destination file to write to? (xyz.txt): ");
        String writeMsg = s.nextLine();
    
        File y = new File(writeMsg);
        copyContent(x, y);
        s.close();
    }

    public static void copyContent(File a, File b) throws Exception {
        FileInputStream in = new FileInputStream(a);
		FileOutputStream out = new FileOutputStream(b);
		try {
			int n;
			while ((n = in.read()) != -1) {
				out.write(n);
			}
		}
		finally {
			if (in != null)
				in.close();
			if (out != null)
				out.close();
		}
		System.out.println("File Copied");
	}

}
