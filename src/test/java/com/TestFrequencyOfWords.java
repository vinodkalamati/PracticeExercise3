package com.stackroute;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestFrequencyOfWords {
    private static FrequencyOfWords _freq=new FrequencyOfWords();

    @BeforeClass
    public static void setup(){
        _freq=new FrequencyOfWords();
    }
    @AfterClass
    public static void teardown(){
        _freq=null;
    }
    @Test
    public void TestFrequencyOfWordsInAFile() throws IOException {

        File file=new File( "/home/cgi/Documents/MyFile.txt");
        FileWriter Writer =new FileWriter(file);
        Writer.write("i am a man ,\n" +
                "i like to sleep ,\n" +
                "i have a home.");

        assertArrayEquals("");
    }
}