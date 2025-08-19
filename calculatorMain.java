import java.util.Scanner;
public class calculatorMain {

public static void main(String[]args){
Scanner input = new Scanner(System.in);
calculator calcOb = new calculator();
String opt;
do {
int fn = calcOb.TheFirstValue(input, "Enter the first value");
String op =calcOb.GettingTheOpreator(input);
int sn =calcOb.TheSecondValue(input, "Enter the Second value");
int result = calcOb.TheCalculations(fn,sn,op);
System.out.println("The Result is " + result);
opt = calcOb.ProgramCont(input);
} while(!opt.equals("0"));
}
}

class calculator {
public String GettingTheOpreator(Scanner input) {
String op;
while (true) {
System.out.println("Enter the opreator");
op = input.next();
if (op.equals("/") || op.equals("x") || op.equals("-") || op.equals("+") || op.equals("*")) return op;
else System.out.println("Please try again");
}
}

public int TheFirstValue(Scanner input, String msg) {
System.out.println(msg);
return input.nextInt();
}


public int TheSecondValue(Scanner input, String msg) {
System.out.println(msg);
return input.nextInt();
}

public int TheCalculations(int fn, int sn, String op) {
switch (op) {
case"+":
return fn + sn;
case"x":
case"*":
return fn * sn;
case"/":
return (sn == 0) ? 69 : fn / sn;
case"-":
return fn - sn;
}
return 0;
}
    
public String ProgramCont(Scanner input) {
System.out.println();
System.out.println("Do you Wish to Do another Calculation?");
System.out.println("1.Yes");
System.out.println("0.No");
return input.next();
}
}

