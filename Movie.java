package day11homework;

public class Movie {
	

	    private String title;
	    private String director;
	    private String[] actors;

	  
	    public Movie(String title, String director) {
	        this.title = title;
	        this.director = director;
	    }

	 
	    public Movie(String[] actors) {
	        this.actors = actors;
	    }

	   
	    public void printMovieDetails() {
	        System.out.println("Movie Title: " + title);
	        System.out.println("Director: " + director);
	        System.out.println("Actors:");
	        if (actors != null) {
	            for (String actor : actors) {
	                System.out.println(" - " + actor);
	            }
	        } else {
	            System.out.println(" - No actors found.");
	        }
	    }

	    public static void main(String[] args) {
	        
	        Movie movie1 = new Movie("amrut","rohit");

	       
	        String[] actors = {"pk", "raju bhansli", "amir khan"};
	        Movie movie2 = new Movie(actors);

	        
	        movie1.printMovieDetails();
	        System.out.println();
	        movie2.printMovieDetails();
	    }
	}


