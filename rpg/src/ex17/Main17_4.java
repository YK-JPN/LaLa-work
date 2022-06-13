package ex17;

import java.io.IOException;

public class Main17_4 {

	public static void main(String[] args) throws IOException {
		throw new IOException();
	}
//	throws～を入れない場合、そもそもIOExceptionが呼び出される事なく
//	java.lang.Errorの方が動いてしまうので今回はthrows宣言を絶対に入れる必要がある。

}
