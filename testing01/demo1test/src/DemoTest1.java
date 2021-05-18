

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DemoTest1 {
    public static void main(String[] args) throws IOException {
        ArrayList<Book> arr = new ArrayList<>();

        FileReader fis = new FileReader("book.txt");
        BufferedReader fr = new BufferedReader(fis);
       //②将文件内容读到程序中,并将每一条图书信息进行解析,分别把各个属性封装成一个
        String str;
        while((str= fr.readLine())!=null) {

            String[] strBook = str.split(",");
            //System.out.println();

            Book book = new Book();
            book.setName(strBook[0]);
            double dprice = Double.valueOf(strBook[1]);
            //System.out.println(dprice);
            book.setPrice(dprice);
            int a = Integer.parseInt(strBook[2]);
            book.setAmount(a);
            //System.out.println(a);
            arr.add(book);

        }
        double totalPrice=0;
        for (Book book : arr) {
           double singlePrice =  book.getPrice()*book.getAmount();
            System.out.println(book.getName()+",共计"+singlePrice+"元");
            totalPrice+=singlePrice;
        }
        System.out.println("总金额为:"+totalPrice+"元");
        fr.close();
        fis.close();
    }
}
