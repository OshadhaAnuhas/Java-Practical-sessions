import IT.FirstYear;
import AMC.FirstYear as AMCFirstYear;
import AMC.SecondYear;
import IT.Hons.FourthYear;

public class App2 {
    public static void main(String[] args) {
        FirstYear itFY = new FirstYear();
        AMCFirstYear amcFY = new AMCFirstYear();
        SecondYear amcSY = new SecondYear();
        FourthYear itHonsFY = new FourthYear();

        itFY.display();
        amcFY.display();
        amcSY.display();
        itHonsFY.display();
    }
}
