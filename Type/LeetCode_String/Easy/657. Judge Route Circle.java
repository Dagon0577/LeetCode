class Solution {
    public boolean judgeCircle(String moves) {
        int h=0,w=0;
        for (char c : moves.toCharArray())
			switch (c) {
			case 'U':
				h++;
				break;
			case 'D':
				h--;
				break;
			case 'R':
				w++;
				break;
			case 'L':
				w--;
				break;

			}
        return h==0&&w==0;
    }
}