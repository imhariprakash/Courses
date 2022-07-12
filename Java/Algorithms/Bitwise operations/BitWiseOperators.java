import java.util.Scanner;
 
class BitWiseOperators {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){   
        System.out.println(get_ith_bit(21,4));
        System.out.println(set_ith_bit(21,4));
        System.out.println(clear_ith_bit(21,4));
        System.out.println(toggle_ith_bit(21,4));
        displayBinary(clear_range_of_bits(255, 2, 6));
    }

    public static int get_ith_bit(int value, int i){
        int mask = 1 << i;
        return ((value & mask) != 0 ? 1 : 0);
    }

    public static int set_ith_bit(int value, int i){
        int mask = 1 << i;
        return (value | mask);
    }

    public static int clear_ith_bit(int value, int i){
        int mask = ~(1 << i);
        return (value & mask);
    }

    public static int toggle_ith_bit(int value, int i){
        int mask = 1 << i;
        return (value ^ mask);
    }

    public static int get_ith_bit_from_right(int value, int i){
        int mask = 1 << i;
        return ((value & mask) != 0 ? 1 : 0);
    }

    public static int set_ith_bit_from_right(int value, int i){
        int mask = 1 << i;
        return (value | mask);
    }

    public static int clear_ith_bit_from_right(int value, int i){
        int mask = ~(1 << i);
        return (value & mask);
    }

    public static int toggle_ith_bit_from_right(int value, int i){
        int mask = 1 << i;
        return (value ^ mask);
    }

    public static int clear_range_of_bits(int value, int i, int j){
        int mask = ~(((1 << (j - i + 1)) - 1) << i);
        return (value & mask);
    }

    public static int set_range_of_bits(int value, int i, int j){
        int mask = (((1 << (j - i + 1)) - 1) << i);
        return (value | mask);
    }

    public static int get_range_of_bits(int value, int i, int j){
        int mask = (((1 << (j - i + 1)) - 1) << i);
        return (value & mask);
    }

    public static int toggle_range_of_bits(int value, int i, int j){
        int mask = (((1 << (j - i + 1)) - 1) << i);
        return (value ^ mask);
    }

    public static boolean is_power_of_two(int value){
        return (value & (value - 1)) == 0;
    }

    public static int next_power_of_two(int value){
        return (int) Math.pow(2, (int) Math.ceil(Math.log(value) / Math.log(2)));
    }

    public static int previous_power_of_two(int value){
        return (int) Math.pow(2, (int) Math.floor(Math.log(value) / Math.log(2)));
    }

    public static int count_set_bits(int value){
        int count = 0;
        while(value != 0){
            count += (value & 1);
            value = value >> 1;
        }
        return count;
    }

    public static int count_unset_bits(int value){
        int count = 0;
        while(value != 0){
            count += (value & 1);
            value = value >> 1;
        }
        return (32 - count);
    }

    public static int count_trailing_zeros(int value){
        int count = 0;
        while((value & 1) == 0){
            count++;
            value = value >> 1;
        }
        return count;
    }

    public static int count_leading_zeros(int value){
        int count = 0;
        while((value & 1) == 1){
            count++;
            value = value >> 1;
        }
        return count;
    }

    public static int count_trailing_ones(int value){
        int count = 0;
        while((value & 1) == 1){
            count++;
            value = value >> 1;
        }
        return count;
    }

    public static int count_leading_ones(int value){
        int count = 0;
        while((value & 1) == 0){
            count++;
            value = value >> 1;
        }
        return count;
    }

    public static int fast_exponentiation(int base, int exponent){
        int result = 1;
        while(exponent != 0){
            if((exponent & 1) == 1){
                result = result * base;
            }
            exponent = exponent >> 1;
            base = base * base;
        }
        return result;
    }

    public static void displayBinary(int n){
        System.out.println(Integer.toBinaryString(n));
    }

    
}