package builder;

public enum Cheese {
	
	AMERICAN {

		@Override
		public float getCost() {
			
			return 40;
		}
		
	}, ITALIAN {

		@Override
		public float getCost() {
			return 60;
		}
		
	}, FRENCH {

		@Override
		public float getCost() {
			return 50;
		}
		
	};
	
	public abstract float getCost();

}
