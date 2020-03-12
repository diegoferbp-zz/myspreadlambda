package com.serverless.model.range;

public class Range {

    private int from;
    private int to;

    public int getFrom() {
        return from;
    }
    public int getTo() {
        return to;
    }

    public static class Builder {

        private int from;
        private int to;

        public Builder from(int from){
            this.from = from;
            return this;
        }

        public Builder to(int to){
            this.to = to;
            return this;
        }

        public Range build(){
            Range range = new Range();
            range.from = this.from;
            range.to = this.to;
            return range;
        }
    }

    private Range(){

    }
}
