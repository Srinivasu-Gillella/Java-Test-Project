
public class whileNumberPlayer {
		private int limit;
	
		
		
		public whileNumberPlayer(int limit) {
		this.limit = limit;
	}
		public void printSqaureNumbers () {
			int i = 1;
			while (i*i < limit) {
				System.out.printf(i*i +" ");
				i++;
			}
			System.out.println();
			}
			
		public void printCubesUptoLimit() {
			int i = 1;
			while (i*i*i < limit) {
				System.out.printf(i*i*i +" ");
				i++;
			}
		}
}
