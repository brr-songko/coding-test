
class solution {

	public static void main(String[] args) {
		int a = Solution(1000000, 1000000000);
		System.out.println(a);
	}

	public static int Solution(int N, int K) {

		int sum = N * (N + 1) / 2;
//		for(int i = 1; i <= N; i++) {
//			sum += i;
//		}
		System.out.println(sum);
		if (sum < K) {
			return -1;
		}

		if (N >= K) {
			return K;
		}

		int i = N;
		int count = 0;
		while (K != 0) {
			count++;
			if(K-i < 0) break;
			K = K - i;
			i--;
		}
		return count;
	}
}


//while (K != 0) {
//	K = K - i;
//	count++;
//	i--;
//	if (i > K) {
//		count++;
//		break;
//	}
//
//}
//return count;
