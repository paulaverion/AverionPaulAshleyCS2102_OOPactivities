class Car
{
    private String color;
    private double price;
    private char size;
    
    public Car(String color, double price, char size)
    {
        this.color = color;
        this.price = price;
        this.size = Character.toUpperCase(size);
    }

    public String getColor()
    {
        return color;
    }

    public double getPrice()
    {
        return price;
    }

    public char getSize()
    {
        return size;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setSize(char size)
    {
        char upCaseSize =  Character.toUpperCase(size);
        if(upCaseSize ==  'S' || upCaseSize == 'M' || upCaseSize == 'L')
        {
            this.size = upCaseSize;
        }
        else
        {
            System.out.println("Invalid size. Please enter S, M or L.");
        }
    }

    public String toString()
    {
        String carSize = "unknown";
        switch(this.size)
        {
            case  'S':
                carSize = "small";
                break;
            case 'M':
                carSize = "medium";
                break;
            case 'L':
                carSize = "large";
                break;
        }
        String formattedPrice = String.format("%.2f", this.price);
        return ("Car (" + this.color + ") - P" + formattedPrice + " - " + carSize);
    }
}