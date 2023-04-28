package com.driver;

public class Pizza {

    private int TakeAwayPrice;
    private int price;
    private Boolean isVeg;
    private String bill;
    private int extraCheesePrice;
    private int extraToppingPrice;
    private int takeAwayPrice;

    private boolean isCheeseAdded;
    private boolean isToppingAdded;
    private boolean isTakeAwayAdded;

    private boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        // your code goes here
        this.isCheeseAdded = false;
        this.isToppingAdded = false;
        this.isTakeAwayAdded = false;

        this.isVeg = isVeg;


        if(isVeg == true){
            this.price = 300;
            this.extraToppingPrice = 70;
            this.TakeAwayPrice = 20;
        }else{
            this.price = 400;
            this.extraToppingPrice = 120;
            this.TakeAwayPrice = 20;
        }

        this.extraCheesePrice = 80;
        this.bill = "Base Price Of The Pizza: "+ this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded){
            this.price = this.price + this.extraCheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingAdded){
            this.price = this.price + this.extraToppingPrice;
            isToppingAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAwayAdded){
            this.price = this.price + 20;
            isTakeAwayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated){
            isBillGenerated = true;
            if(isCheeseAdded){
                this.bill = this.bill + "Extra Cheese Added: " + this.extraCheesePrice + "\n";
            }
            if(isToppingAdded){
                this.bill = this.bill + "Extra Toppings Added: " + this.extraToppingPrice + "\n";
            }
            if(isTakeAwayAdded){
                this.bill = this.bill + "Paperbag Added: " + 20 + "\n";
            }
            this.bill = this.bill + "Total Price: " + this.price + "\n";
        }

        return this.bill;
    }
}
