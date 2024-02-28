package org.example;

import jdepend.xmlui.JDepend;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

@SpringBootApplication
public class Tuan20040331LeThanhToanApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(Tuan20040331LeThanhToanApplication.class, args);

        PrintWriter printWriter = new PrintWriter(new FileOutputStream("result.xml"));
        JDepend jDepend = new JDepend(printWriter);
        jDepend.addDirectory("T:\\Tuan4\\Tuan_20040331_LeThanhToan");
        jDepend.analyze();
    }

}
