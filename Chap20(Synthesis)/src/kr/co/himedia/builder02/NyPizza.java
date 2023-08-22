package kr.co.himedia.builder02;

public class NyPizza extends Pizza{

	public NyPizza(Builder builder) {
		super(builder);
		this.size = builder.size;
	}

	public enum Size {SMALL, MEDIUM, LARGE};
	private final Size size;
	
	public static class Builder extends Pizza.Builder{

		private final Size size;
		
		public Builder(Size size) {
			this.size = size;
		}
		
		@Override
		protected Builder self() {
			return this;
		}

		@Override
		Pizza build() {
			return new NyPizza(this);
		}
		
	}

}
