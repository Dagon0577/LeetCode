class Solution {
    public int calPoints(String[] ops) {
        String temp_str;

		int pos = 0;
		int[] temp_array = new int [2 * ops.length];
		int sum = 0;
		int temp;

		for (int i = 0; i < ops.length; i++)
		{
			temp_str = ops[i];
			if (temp_str.charAt(0) == 'C')
			{
				//pos--;
				sum -= temp_array[--pos];

			}
			else if (temp_str.charAt(0) == '+')
			{
				temp_array[pos] = temp_array[pos - 1] + temp_array[pos - 2];				
				sum += temp_array[pos++];
			}
			else if (temp_str.charAt(0) == 'D')
			{
				temp_array[pos] = temp_array[pos - 1] + temp_array[pos - 1];
				sum += temp_array[pos++];
			}
			else if (temp_str.charAt(0) == '-')
			{
				temp = 0;
				for (int j = 1; j < temp_str.length(); j++)
				{
					temp *= 10;
					temp += temp_str.charAt(j) - 48;
				}
				temp_array[pos++] = (-temp);
				sum += (-temp);
			}
			else
			{
				temp = 0;
				for (int j = 0; j < temp_str.length(); j++)
				{
					temp *= 10;
					temp += temp_str.charAt(j) - 48;
				}
				temp_array[pos++] = temp;
				sum += temp;
			}
		}
		return sum;
    }
}
