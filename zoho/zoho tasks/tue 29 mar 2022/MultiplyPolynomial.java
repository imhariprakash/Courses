import java.util.*;

import java.lang.*;

class Polynomial{
    private int coeff;
    private HashMap<String, Integer> variable = new HashMap<String, Integer>();

    public Polynomial(int coeff, String variable, int power){
        this.coeff = coeff;
        this.variable.put(variable, power);
    }


    public Polynomial(){
        this.coeff = 1;
    }

    public void setCoeff(int coeff){
        this.coeff = coeff;
    }

    public int getCoeff(){
        return this.coeff;
    }

    public void putVariable(String variable, int power){
        this.variable.put(variable, power);
    }

    public void putPower(String variable){
        this.variable.get(variable);
    }

    public int getPower(String variable){
        return this.variable.get(variable);
    }

    public void hasVariable(String variable){
        this.variable.containsKey(variable);
    }

    public static int getNumber(String str, int index){
        int result = 0;
        for(int i = index; Character.isDigit(str.charAt(i)); i++){
            result = result * 10 + (str.charAt(i) - '0');
        }
        return result;
    }

}


class MultiplyPolynomial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter equation 1 : ");
        String equ1 = sc.nextLine();
        ArrayList<Polynomial> equation1 = new ArrayList<Polynomial>();
        getEquation(equation1, equ1);
        System.out.print("Enter equation 2 : ");
        String equ2 = sc.nextLine();
        ArrayList<Polynomial> equation2 = new ArrayList<Polynomial>();
        getEquation(equation2, equ2);

        sc.close();
    }

    public static void getEquation(ArrayList<Polynomial> equation, String equ){
        Polynomial obj = new Polynomial();
        for(int i = 0; i < equ.length(); i++){
            if(equ.charAt(i) == ')' || equ.charAt(i) == ' '){   // skip space, paranthesis
                continue;
            }
            else if(equ.charAt(i) == '+' || equ.charAt(i) == '-' || equ.charAt(i) == '('){  // coefficient - after + (or) - (or) (
                if(equ.charAt(i + 1) >= '1' && equ.charAt(i + 1) <= '9'){
                    obj.setCoeff(Polynomial.getNumber(equ, i + 1));
                    i = i + Integer.toString(obj.getCoeff()).length();      //when there is coefficient - (12x  ---> ( oth index 12 - length 2 (next loop i++)
                }
                //by default coefficient is 1
            }
            else if(Character.toLowerCase(equ.charAt(i)) >= 'a' && Character.toLowerCase(equ.charAt(i)) <= 'z'){
                if(Character.isDigit(equ.charAt(i + 1))){ 
                    int num = Polynomial.getNumber(equ, i + 1);
                    obj.putVariable(Character.toString(equ.charAt(i)), num);
                    i = i + Integer.toString(num).length();
                }
                else{
                    obj.putVariable(Character.toString(equ.charAt(i)), 1);
                }
            } 
            equation.add(obj);           
        }
    }
}