class Solution {
    public boolean isNumber(String s) {
         s = s.trim();
    
    boolean point = false;          /*  '.' */
    boolean e = false;              /*  'e' */
    boolean number = false;         /*  '0~9' */
    boolean E_number = true;        /*  '指数0~9' */
    for(int i=0; i<s.length(); i++) {
         if(s.charAt(i)>='0' && s.charAt(i)<='9') {
            number = true;
            E_number = true;
        }
        else if(s.charAt(i) == '.') {
            if(e || point) {
                return false;
            }
            point = true;
        } else if(s.charAt(i) == 'e') {
            if(e || !number) {
                return false;
            }
            E_number = false;
            e = true;
        }
        else if(s.charAt(i) == '-' || s.charAt(i) == '+') {
            if(i != 0 && s.charAt(i-1) != 'e') {
                return false;
            }
        }
        else {
            return false;
        }
    }
    
    return number && E_number;
    }
}

