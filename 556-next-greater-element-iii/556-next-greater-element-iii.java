class Solution {
    public int nextGreaterElement(int n) {
        return NGE(n);
    }
    public static int NGE(int n ) {
          char[] arr=(n+"").toCharArray();
		int p = 0;
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] < arr[i + 1]) {
				p = i;
				break;
			}
		}

		int q = 0;
		for (int i = arr.length - 1; i > p; i--) {
			if (arr[i] > arr[p]) {
				q = i;
				break;
			}

		}
		if (p == 0 && q == 0) {
			//Reverse(arr, 0, arr.length - 1);
			return -1;
		}

		// Swapping

		char temp = arr[p];
		arr[p] = arr[q];
		arr[q] = temp;

		Reverse(arr, p + 1, arr.length - 1);
        Long no=Long.parseLong(new String(arr));
        if(no<=Integer.MAX_VALUE){
           return no.intValue();
        }
        else{
            return -1;
        }

	}

	public static void Reverse(char[] arr, int i, int j) {

		while (i < j) {
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

	}
}