class Franc extends Money {
    Franc(int amount) {
        this.amount = amount;
    }

    String currency() {
        return "CEF";
    }

    Money times(int multiplier) {
        return new Franc(this.amount * multiplier);
    }
}
