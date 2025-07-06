import java.util.Scanner;
public class calculatorMain {

public static void main(String[]args){
calculator calcOb = new calculator();
while (true) {
double fn = calcOb.TheFirstValue();
String op =calcOb.GettingTheOpreator();
double sn =calcOb.TheSecondValue();
double result = calcOb.TheCalculations(fn,sn,op);
System.out.println("The Result is " +result);
String opt = calcOb.ProgramCont();
if (opt.equals("0")) {
System.out.println("Thanks for using the calculator");
break;
}
else {
    System.out.println("The calculator will continue.....");
}
}


}
}
class calculator {

public String GettingTheOpreator() {
Scanner Theopreator = new Scanner(System.in);
String op;
while (true) {
System.out.println("Enter the opreator");
op = Theopreator.next();
if (op.equals("/") || op.equals("x") || op.equals("-") || op.equals("+") || op.equals("*")) {
break;
}
else {
System.out.println("Please try again");
}

}
return op;
}

public double TheFirstValue() {
Scanner FV = new Scanner(System.in);
System.out.println("Enter the first value");
double fn = FV.nextDouble();
return fn;
}


public double TheSecondValue() {
Scanner SV = new Scanner(System.in);
System.out.println("Enter the second value");
double sn = SV.nextDouble();
return sn;
}

public double TheCalculations(double fn, double sn, String op) {
double result = 0;
switch (op) {
case"+":
result = fn + sn;
break;

case"x":
case"*":
result = fn * sn;
break;

case"/":
if (sn==0)
{
    System.out.println("You can't divide by zero");
}
else {
result = fn / sn;
}
break;

case"-":
result = fn - sn;
break;

}
return result;

}
public String ProgramCont() {
Scanner input = new Scanner(System.in);
    System.out.println();
        System.out.println("Do you Wish to Do another Calculation?");
            System.out.println("1.Yes");
                System.out.println("0.No");
String opt = input.next();

return opt;

}



}
