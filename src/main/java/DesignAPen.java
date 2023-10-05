import dev.vivek.models.ButterflowPen;
import dev.vivek.models.Pen;
import dev.vivek.models.PenType;

import java.util.Scanner;

public class DesignAPen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Pen type");
        String penType = scanner.nextLine();

        if(PenType.valueOf(penType)==(PenType.BALLPOINT))
        {
            Pen pen = new ButterflowPen();
            pen.write();
            pen.refill();
        }
    }
}
