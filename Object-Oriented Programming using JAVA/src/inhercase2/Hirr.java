package inhercase2;
import java.util.Scanner;

public class Hirr {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
System.out.println("Welcome......!\nBook your Room");
System.out.println();
System.out.println("Number of persons");
int p = s.nextInt();
System.out.println("Number of Days");
int dy = s.nextInt();
System.out.println("Tarff per day");
double tf = s.nextInt();
System.out.println("Room Type");
String type = s.next();
Lean bg = new Lean();
Peak bg1 = new Peak();
double cd = bg.Booker(p, dy, tf);

System.out.println("Month ");
int m = s.nextInt();

switch (m) {
case 4:
case 5:
case 6:
case 9:
case 11:
case 12:
bg1.peak(cd);
break;

case 1:
case 2:
case 3:
case 7:
case 8:
case 10:
bg.lean(cd);
break;
}
}

}

class Bookk {
double tot;
double Booker(int p, int dy, double tf) {
tot = p * dy * tf;
return tot;
}
}

class Peak extends Bookk
{
double tot1;
void peak(double cd) {
System.out.println("Welcome");
tot1 = cd + 500;
System.out.println("Total Tarif  :" + tot1);
}
}
class Lean extends Bookk {
double tot2;

void lean(double cd) {
tot2 = cd - 500;
System.out.println("Total Tariff  :" + tot2);
}
}