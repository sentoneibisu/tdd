class Dollar {
    int amount;

    Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(this.amount * multiplier);
    }

    public boolean equals(Object object) {
        // 正解は自明 (return this.amount == object.amount;) だが
        // 三角測量の説明のために回りくどいコードを書いている。
        return true;
    }
}
