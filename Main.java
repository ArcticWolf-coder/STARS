import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(;sc.hasNextLine();) {
            String n = sc.nextLine();


            n = n.toUpperCase();
            String a[] = n.split("");
            for (int i = 1; i <= 5; i++) {
                for (int j = 0; j < a.length; j++) {
                    if (a[j].equals(" ")) {
                        System.out.print("   ");
                    } else {
                        Print(a[j], i);
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }

    }
    public static void Print(String b,int num){
        switch(b){
            case "0":
                Nums.zero(num);
                break;
            case "1":
                Nums.one(num);
                break;
            case "2" :
                Nums.two(num);
                break;
            case "3":
                Nums.three(num);
                break;
            case "4":
                Nums.four(num);
                break;
            case "5":
                Nums.five(num);
                break;
            case "6" :
                Nums.six(num);
                break;
            case "7":
                Nums.seven(num);
                break;
            case "8":
                Nums.eight(num);
                break;
            case "9":
                Nums.nine(num);
                break;
            case "A" :
                Alphs.A(num);
                break;
            case "B":
                Alphs.B(num);
                break;
            case "C":
                Alphs.C(num);
                break;
            case "D":
                Alphs.D(num);
                break;
            case "E":
                Alphs.E(num);
                break;
            case "F" :
                Alphs.F(num);
                break;
            case "G":
                Alphs.G(num);
                break;
            case "H":
                Alphs.H(num);
                break;
            case "I":
                Alphs.I(num);
                break;
            case "J":
                Alphs.J(num);
                break;
            case "K":
                Alphs.K(num);
                break;
            case "L":
                Alphs.L(num);
                break;
            case "M":
                Alphs.M(num);
                break;
            case "N":
                Alphs.N(num);
                break;
            case "O":
                Alphs.O(num);
                break;
            case "P":
                Alphs.P(num);
                break;
            case "Q":
                Alphs.Q(num);
                break;
            case "R":
                Alphs.R(num);
                break;
            case "S":
                Alphs.S(num);
                break;
            case "T":
                Alphs.T(num);
                break;
            case "U":
                Alphs.U(num);
                break;
            case "V":
                Alphs.V(num);
                break;
            case "W":
                Alphs.W(num);
                break;
            case "X":
                Alphs.X(num);
                break;
            case "Y":
                Alphs.Y(num);
                break;
            case "Z":
                Alphs.Z(num);
                break;

        }

    }
}
