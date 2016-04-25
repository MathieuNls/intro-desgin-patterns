package builder;

public enum Size {

	MEDIUM{
		@Override
		public float getCost() {
			// TODO Auto-generated method stub
			return 20;
		}
	}, LARGE {
		@Override
		public float getCost() {
			// TODO Auto-generated method stub
			return 30;
		}
	};
	
	public abstract float getCost();
	
}
