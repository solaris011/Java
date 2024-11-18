public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        int totEuros = this.euros + addition.euros;
        int totCents = this.cents + addition.cents;
        
        Money newMoney = new Money(totEuros, totCents);       
        
        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        // if (compared.cents > 99) {
        //    CompEuros = euros + cents / 100;
        //    CompCents = cents % 100;
        //}
        if (this.euros < compared.euros()) {
            return true;
        }
        
        if (this.euros == compared.euros()) {
            if (this.cents < compared.cents) {
                return true;
            }
        }
        return false;
    }
    
    public Money minus(Money decreaser) {
        int totEuros = this.euros - decreaser.euros;
        int totCents = this.cents - decreaser.cents;
        
        if (totEuros >= 0) {
            if (totCents < 0) {
                totEuros -= 1;
                totCents += 100;
            }             
        } else {
                totEuros = 0;
                totCents = 0;
        }
        
        Money newMoney = new Money(totEuros, totCents);       
        
        return newMoney;
        
    }
}
