package chap17;

public class Main688 {

	public static void main(String[] args) {
		String filename = "gravitation.wmv";
		try {
			if (!filename.endsWith(".mp3")) {
				throw new UnsupportedMusicFIleException
					(filename+"のファイル形式は未対応です。");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
