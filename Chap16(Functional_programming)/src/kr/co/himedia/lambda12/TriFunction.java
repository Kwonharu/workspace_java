package kr.co.himedia.lambda12;

public interface TriFunction<A, S, D, F> {
	F apply(A a, S s, D d);
	
}
