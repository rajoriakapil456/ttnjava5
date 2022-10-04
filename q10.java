import java.util.*;
import java.lang.String;
class Question_10 
{
    public static void main(String[] args) 
    {
        String str = "Java is Love\n";
        System.out.println(str.repeat(4));

        String whiteSpace = "\u2005\u2005\u2005 Hello Motto";
        System.out.println(whiteSpace.strip());

        System.out.println("\n\u2005".isBlank());
        System.out.println("\n\u2005".isEmpty());


        String html = "<html>\n" + "<body>";
        System.out.println(html+"\n");
        //System.out.println(html.stripIndent());


        String multiLine = "<html>\n"
                + "     <body>\n"
                + "         <p>Hello, World</p>\n"
                + "     </body>\n"
                + "</html>";
        System.out.println(multiLine);
    }
}
