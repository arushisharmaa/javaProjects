package inClassLessons;

public class ACIIArt {

	public static void writeChars(char ch, int x) {
		for(int i = 1; i <= x; i++) {
			System.out.print(ch);
		}
	}
		
		public static void main(String[] args) {
			for(int i = 1; i <= 4; i++) {
				writeChars(' ', 4-i );
				writeChars('S', i+15 );
				writeChars('S', i+15 );
				System.out.println();
			}
			for(int i = 1; i <= 4; i++) {
				writeChars('S', 19);
				writeChars(' ', 8);
				System.out.println();
			}
			for(int i = 1; i <= 8; i++) {
				writeChars(' ', 18);
				writeChars('S', 20);
				System.out.println();
			}
			for(int i = 4; i >= 1; i--) {
				writeChars(' ', 4-i );
				writeChars('S', i+15 );
				writeChars('S', i+15 );
				System.out.println();
			}
		}

	}
