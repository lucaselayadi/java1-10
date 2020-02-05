

class Runner {

    public static void main(String[] args) {
        // write your code here
        System.out.println(monkeyTrouble(true,false));
    }


    public static boolean monkeyTrouble(boolean a, boolean b) {

        return (a == b);
    }

    public int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if  (str.substring(i, i+2).equals("xx")) count++;
        }

        return count;
    }



    public boolean hasBad(String str) {
        if (str.length() < 3) {
            return false;
        } else {
            if (str.substring(0, 3).equals("bad")) {
                return true;
            } else {
                if (str.length() > 3) {
                    if (str.substring(1, 4).equals("bad")) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public boolean no23(int[] nums) {
        if(nums[0] == 2 || nums[1] == 2){
            return false;
        }
        if(nums[0]== 3 || nums[1] == 3){
            return false;
        } else {
            return true;
        }
    }

    public boolean old35(int n) {
        if(n % 3 == 0){
            return true;
        }
        if(n % 5 == 0){
            return true;
        }
        if(n % 3 == 0 && n % 5 == 0){
            return false;
        } else {
            return false;
        }
    }





}

