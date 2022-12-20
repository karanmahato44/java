import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("abc.md"));
		String word = br.readLine();
		word = word.replace('a', 'b');
		BufferedWriter bw = new BufferedWriter(new FileWriter("xyz.md", true));
		bw.write(word);
		bw.close();
		br.close();
	}
}
