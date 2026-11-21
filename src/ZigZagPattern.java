public class ZigZagPattern {
    static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;

        StringBuilder[] rows = new StringBuilder[numRows];
        for(int i=0; i<numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int index = 0;
        int step = 1;
        for(char c : s.toCharArray()) {
            rows[index].append(c);

            if(index == 0) step =1 ;
            else if(index == numRows - 1) step = -1;
            index += step;
        }

        StringBuilder res = new StringBuilder();
        for(StringBuilder row : rows) {
            res.append(row);
        }
        System.out.println(res.toString());
    }
}
