package kr.co.himedia.collection;

import java.util.ArrayList;

public class MovieListTest {
	public static void main(String[] args) {
		
		ArrayList<Movie> list = new ArrayList<>();
		list.add(new Movie("방구석에 인어아가씨", "지나가던개", "2014", "한국"));
		list.add(new Movie("죽어버린 별의 넋두리", "지나가던개", "2016", "한국"));
		list.add(new Movie("미래의 여친님이 나에게 인사를 건내왔다", "래영", "2016", "한국"));
		
		for(Movie movie : list){
			System.out.println(movie);
		}
		
	}
}
