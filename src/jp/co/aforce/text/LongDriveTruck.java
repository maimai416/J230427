package jp.co.aforce.text;

public class LongDriveTruck extends Truck {
		void sleepInBed() {
			System.out.println("ドライバーが寝ます");
		}
		
		@Override
		String getCarType() {
			return "長距離トラック";
		}

}
