
class code333 {
    public static void main(String[] args) {
        String str = "98765+-*/";
        //String str = "789654+-*/+";
        //String str = "12345*/+-";

        System.out.println(calculator(str));
    }

    public static int calculator(String str) {
        Queue operands = new Queue();
        int right = str.charAt(0) - '0';

        for(int i = 1; i < str.length(); i++){

            switch (str.charAt(i)) {
                case '+':
                case '-':
                case '*':
                case '/':
                    int left = operands.pop();
                    //System.out.println(right + " " + str.charAt(i) +  " " + left);
                    switch(str.charAt(i)) {
                        case '+':
                            right = left + right;
                            break;
                        case '-':
                            right = right - left;
                            break;
                        case '*':
                            right = right * left;
                            break;
                        case '/':
                            right = right / left;
                            break;
                        default:
                            break;
                    }
                    break;
                default:
                    operands.push(str.charAt(i) - '0');
                    break;  
            }
        }
        return right;
    }
}