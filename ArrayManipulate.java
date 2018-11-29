import java.io.InputStreamReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.PrintStream;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.io.InputStream;
/*
	Starting with a 1-indexed array of zeros and a list of operations, for each operation add a value to each of the array element between two given indices, inclusive. Once all operations have been performed, return the maximum value in your array.

	For example, the length of your array of zeros . Your list of queries is as follows:

	    a b k
	    1 5 3
	    4 8 7
	    6 9 1
	Add the values of  between the indices  and  inclusive:

	index->	 1 2 3  4  5 6 7 8 9 10
		[0,0,0, 0, 0,0,0,0,0, 0]
		[3,3,3, 3, 3,0,0,0,0, 0]
		[3,3,3,10,10,7,7,7,0, 0]
		[3,3,3,10,10,8,8,8,1, 0]
	The largest value is  after all operations are performed.

	Function Description

	Complete the function arrayManipulation in the editor below. It must return an integer, the maximum value in the resulting array.

	arrayManipulation has the following parameters:

	n - the number of elements in your array
	queries - a two dimensional array of queries where each queries[i] contains three integers, a, b, and k.
	Input Format

	The first line contains two space-separated integers  and , the size of the array and the number of operations. 
	Each of the next  lines contains three space-separated integers ,  and , the left index, right index and summand.

	Constraints

	Output Format

	Return the integer maximum value in the finished array.

	Sample Input

	5 3
	1 2 100
	2 5 100
	3 4 100
	Sample Output

	200
	Explanation

	After the first update list will be 100 100 0 0 0. 
	After the second update list will be 100 200 100 100 100. 
	After the third update list will be 100 200 200 200 100. 
	The required answer will be 200
	*/


public class ArrayManipulate{
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		FastScanner in = new FastScanner(inputStream);
		FastPrinter out = new FastPrinter(outputStream);
		Task2 solver = new Task2();
		solver.solve(1, in, out);
		out.close();
	}
}

class Task2 {
    /////////////////////////////////////////////////////////////

    public void solve(int testNumber, FastScanner in, FastPrinter out) {
    int n=in.nextInt(),m=in.nextInt();
    long[] A= new long[n+2];
	for (int i = 0; i < m; i++) {
	    int a=in.nextInt(),b=in.nextInt();
	    long k=in.nextLong();
	    A[a]+=k;
	    A[b+1]-=k;
	}
    long ans=0,cur=0;
	for (int i = 0; i <= n+1 ; i++) {
	   cur+=A[i];
	   ans=Math.max(cur,ans);
	}
	out.println(ans);
    }
}

class FastScanner extends BufferedReader {

    public FastScanner(InputStream is) {
	super(new InputStreamReader(is));
    }

    public int read() {
	try {
	    int ret = super.read();
//            if (isEOF && ret < 0) {
//                throw new InputMismatchException();
//            }
//            isEOF = ret == -1;
	    return ret;
	} catch (IOException e) {
	    throw new InputMismatchException();
	}
    }

    public String next() {
	StringBuilder sb = new StringBuilder();
	int c = read();
	while (isWhiteSpace(c)) {
	    c = read();
	}
	if (c < 0) {
	    return null;
	}
	while (c >= 0 && !isWhiteSpace(c)) {
	    sb.appendCodePoint(c);
	    c = read();
	}
	return sb.toString();
    }

    static boolean isWhiteSpace(int c) {
	return c >= 0 && c <= 32;
    }

    public int nextInt() {
	int c = read();
	while (isWhiteSpace(c)) {
	    c = read();
	}
	int sgn = 1;
	if (c == '-') {
	    sgn = -1;
	    c = read();
	}
	int ret = 0;
	while (c >= 0 && !isWhiteSpace(c)) {
	    if (c < '0' || c > '9') {
		throw new NumberFormatException("digit expected " + (char) c
			+ " found");
	    }
	    ret = ret * 10 + c - '0';
	    c = read();
	}
	return ret * sgn;
    }

    public long nextLong() {
	return Long.parseLong(next());
    }

    public String readLine() {
	try {
	    return super.readLine();
	} catch (IOException e) {
	    return null;
	}
    }

    }

class FastPrinter extends PrintWriter {

    public FastPrinter(OutputStream out) {
	super(out);
    }

    public FastPrinter(Writer out) {
	super(out);
    }


}
