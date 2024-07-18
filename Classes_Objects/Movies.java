public class Movies
{
private String title;
private String studio;
private String rating;

public Movies(String title, String studio, String rating)
{
this.title=title;
this.studio=studio;
this.rating=rating;
}
public void displayMovies()
{
    System.out.println("Title :"+title);
    System.out.println("Studio :"+studio);
    System.out.println("Rating :"+rating);
}
public Movies(String title, String studio)
{
this.title=title;
this.studio=studio;
this.rating="PG";
}
public static Movies[] getPG(Movies[] movies)
{
int count=0;
for(Movies movie: movies)
{
    if(movie.rating.equals("PG"))
    {
        count++;
    }
}
Movies[] pgmovies=new Movies[count];
int index=0;
for(Movies movie: movies)
{
    if(movie.rating.equals("PG"))
    {
        pgmovies[index]=movie;
        index++;
    }
}
return pgmovies;
}
public static void main(String args[])
{
Movies m=new Movies("Counjuring","Warner Bros","ABCD");
m.displayMovies();
Movies mov=new Movies("Barbire", "Sony Pictures");
mov.displayMovies();
Movies[] movie={ new Movies("Pursuit Of Happiness","Columbia Pictures", "PG"),
                 new Movies("The Karate Kid", "Paramount Pictures", "PG"),
                 new Movies("Parasite", "Universal Pictures", "ABCD"),
                 new Movies("Minions", "20th Century Studios", "ABCD")
                };
Movies[] pgmovies=getPG(movie);
System.out.println("PG Movies:");
for(Movies obj: pgmovies)
{
    System.out.println(obj.title+", "+obj.studio+", "+obj.rating);
}
}
}






