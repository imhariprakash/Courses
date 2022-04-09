class code3333
{

    public static void main(String[] args)
    {
        String str = "98765+-*/";
        //String str = "12345*+-+";
        System.out.println(calculate(str));
    }

    static int calculate(String str)
    {
        Stack stack=new Stack();
        int val2, val1;

        for(int i = ((str.length()) / 2); i >= 0; i--){
            stack.push((int)(str.charAt(i) - '0'));
        }

        val1 = stack.pop();
         
        for(int i=(str.length() + 1) / 2; i < str.length();i++){
            char ch = str.charAt(i);

            val2 = stack.pop();
                 
            switch(ch)
            {
                case '+':
                val1 = val1 + val2;
                break;
                     
                case '-':
                val1 = val1 - val2;
                break;
                     
                case '/':
                val1 = val1 / val2;
                break;
                     
                case '*':
                val1 = val1 * val2;
                break;
            }
        }
        return val1;   
    }
}