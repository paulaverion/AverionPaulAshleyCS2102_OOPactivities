public class Tourist //template
{
    private int id;
    private int score;
    private double average;

    public Tourist(int id, int score, double average) 
    {
        this.id = id;
        this.score = score;
        this.average = average;
    }

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public int getScore() 
    {
        return score;
    }

    public void setScore(int score) 
    {
        this.score = score;
    }

    public double getAverage()
    {
        return average;
    }

    public void setAverage(double average) 
    {
        this.average = average;
    }

    public void displayTouristInfo() 
    {
        System.out.println("Tourist ID: " + id);
        System.out.println("Score (Max 10): " + score);
        System.out.println("Average: " + average);
    }
}