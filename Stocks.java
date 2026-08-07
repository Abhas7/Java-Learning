interface Holder {
    void viewQuote();

}

interface Broker extends Holder {
    void getQuote();

}
interface Exchange extends Broker {
    void setQuote();

}

class Stock implements Exchange {
    public void getQuote() {                                                         
        System.out.println("Get Quote");
    }

    public void setQuote() {
        System.out.println("Set Quote");

    }

    public void viewQuote(){




        
    }

}