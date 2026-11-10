import java.util.ArrayList;

class Movie {
    String title;
    String director;
    String[] actors;
    ArrayList<String> reviews;

    Movie(String title, String director, String[] actors) {
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.reviews = new ArrayList<>();
    }

       void addReview(String review) {
        reviews.add(review);
    }

        void getReviews() {
        System.out.println("Reviews:");

        for (String review : reviews) {
            System.out.println(review);
        }
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);

        System.out.println("Actors:");
        for (String actor : actors) {
            System.out.println(actor);
        }
    }

    public static void main(String[] args) {

        String[] actors = {"Actor 1", "Actor 2", "Actor 3"};

               Movie m = new Movie("3 Idiots","Rajkumar Hirani",actors);

        m.display();

        m.addReview("Very good movie");
        m.addReview("Inspirational movie");

        m.getReviews();
    }
}