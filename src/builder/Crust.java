package builder;

public enum Crust {
	
	THIN {

		@Override
		public float getCost() {
			// TODO Auto-generated method stub
			return 20;
		}
		
	}, STUFFED {
		@Override
		public float getCost() {
			return 30;
		}
	};
	
	public abstract float getCost(); 

}
