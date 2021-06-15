/**
 * Given a file and assume that you can only read the file using a given method read4, implement a method to read n characters.
 *
 * Method read4:
 *
 * The API read4 reads four consecutive characters from file, then writes those characters into the buffer array buf4.
 *
 * The return value is the number of actual characters read.
 *
 * Note that read4() has its own file pointer, much like FILE *fp in C.
 */

package fackbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Reader4 {


    int idx=0;
    public int read(char[] buf, int n) {
        if(idx==0){
            try {
                File fp = new File("abc");
                InputStream in = new FileInputStream(fp);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        return 0;
    }
}
