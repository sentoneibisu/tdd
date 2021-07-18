class Franc extends Money {
    Franc(int amount) {
        this.amount = amount;
        this.currency = "CEF";
    }

    Money times(int multiplier) {
        return new Franc(this.amount * multiplier);
    }
}
