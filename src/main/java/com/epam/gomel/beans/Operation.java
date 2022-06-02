package com.epam.gomel.beans;

public enum Operation {

    SUM {
        private double sum;

        @Override
        void setInit() {
            sum = 0.0;
        }

        @Override
        void setNext(double next) {
            sum += next;
        }

        @Override
        double getResult() {
            return sum;
        }
    },
    MAX {
        private double max;

        @Override
        void setInit() {
            max = Double.MIN_VALUE;
        }

        @Override
        void setNext(double next) {
            if (next > max) {
                max = next;
            }
        }

        @Override
        double getResult() {
            return max;
        }
    },
    MIN {
        private double min;

        @Override
        void setInit() {
            min = Double.MAX_VALUE;
        }

        @Override
        void setNext(double next) {
            if (next < min) {
                min = next;
            }
        }

        @Override
        double getResult() {
            return min;
        }
    },
    AVG {
        private double sum;
        private int count;

        @Override
        void setInit() {
            sum = 0.0;
            count = 0;
        }

        @Override
        void setNext(double next) {
            sum += next;
            count++;
        }

        @Override
        double getResult() {
            return sum / count;
        }
    };

    abstract void setInit();

    abstract void setNext(double next);

    abstract double getResult();
}
