package ohtu;

public class Submission {

    private String student_number;
    private int week;
    private int hours;
    private boolean a1;
    private boolean a2;
    private boolean a3;
    private boolean a4;
    private boolean a5;
    private boolean a6;
    private boolean a7;
    private boolean a8;
    private boolean a9;
    private boolean a10;
    private boolean a11;
    private boolean a12;
    private boolean a13;
    private boolean a14;
    private boolean a15;
    private boolean a16;
    private boolean a17;
    private boolean a18;
    private boolean a19;
    private boolean a20;

    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String opiskelijanumero) {
        this.student_number = opiskelijanumero;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int viikko) {
        this.week = viikko;
    }
    
    public int getHours() {
        return hours;
    }

    public void setHours(int tunnit) {
        this.hours = tunnit;
    }

    public void setA1(boolean a1) {
        this.a1 = a1;
    }

    public boolean getA1() {
        return a1;
    }

    public void setA2(boolean tehty) {
        this.a2 = tehty;
    }

    public boolean getA2() {
        return a2;
    }

    public void setA3(boolean tehty) {
        this.a3 = tehty;
    }

    public boolean getA3() {
        return a3;
    }

    public void setA4(boolean tehty) {
        this.a4 = tehty;
    }

    public boolean getA4() {
        return a4;
    }

    public void setA5(boolean tehty) {
        this.a5 = tehty;
    }

    public boolean getA5() {
        return a5;
    }

    public void setA6(boolean tehty) {
        this.a6 = tehty;
    }

    public boolean getA6() {
        return a6;
    }

    public void setA7(boolean tehty) {
        this.a7 = tehty;
    }

    public boolean getA7() {
        return a7;
    }

    public void setA8(boolean tehty) {
        this.a8 = tehty;
    }

    public boolean getA8() {
        return a8;
    }

    public void setA9(boolean tehty) {
        this.a9 = tehty;
    }

    public boolean getA9() {
        return a9;
    }

    public void setA10(boolean tehty) {
        this.a10 = tehty;
    }

    public boolean getA10() {
        return a10;
    }
    
    public void setA11(boolean tehty) {
        this.a11 = tehty;
    }

    public boolean getA11() {
        return a11;
    }
    
    public void setA12(boolean tehty) {
        this.a12 = tehty;
    }

    public boolean getA12() {
        return a12;
    }
    
    public void setA13(boolean tehty) {
        this.a13 = tehty;
    }

    public boolean getA13() {
        return a13;
    }
    
    public void setA14(boolean tehty) {
        this.a14 = tehty;
    }

    public boolean getA14() {
        return a14;
    }
    
    public void setA15(boolean tehty) {
        this.a15 = tehty;
    }

    public boolean getA15() {
        return a15;
    }
    
    public void setA16(boolean tehty) {
        this.a16 = tehty;
    }

    public boolean getA16() {
        return a16;
    }
    
    public void setA17(boolean tehty) {
        this.a17 = tehty;
    }

    public boolean getA17() {
        return a17;
    }
    
    public void setA18(boolean tehty) {
        this.a18 = tehty;
    }

    public boolean getA18() {
        return a18;
    }
    
    public void setA19(boolean tehty) {
        this.a19 = tehty;
    }

    public boolean getA19() {
        return a19;
    }
    
    public void setA20(boolean tehty) {
        this.a20 = tehty;
    }

    public boolean getA20() {
        return a20;
    }

    public int tehdytTehtavat() {
        int viikkoTehdyt = 0;
        if (getA1()) {
            viikkoTehdyt++;
        }
        if (getA2()) {
            viikkoTehdyt++;
        }
        if (getA3()) {
            viikkoTehdyt++;
        }
        if (getA4()) {
            viikkoTehdyt++;
        }
        if (getA5()) {
            viikkoTehdyt++;
        }
        if (getA6()) {
            viikkoTehdyt++;
        }
        if (getA7()) 
            viikkoTehdyt++;
        if (getA8()) {
            viikkoTehdyt++;
        }
        if (getA9()) {
            viikkoTehdyt++;
        }
        if (getA10()) {
            viikkoTehdyt++;
        }
        if (getA11()) {
            viikkoTehdyt++;
        }
        if (getA12()) {
            viikkoTehdyt++;
        }
        if (getA13()) {
            viikkoTehdyt++;
        }
        if (getA14()) {
            viikkoTehdyt++;
        }
        if (getA15()) {
            viikkoTehdyt++;
        }
        if (getA16()) {
            viikkoTehdyt++;
        }
        if (getA17()) {
            viikkoTehdyt++;
        }
        if (getA18()) {
            viikkoTehdyt++;
        }
        if (getA19()) {
            viikkoTehdyt++;
        }
        if (getA20()) {
            viikkoTehdyt++;
        }
        return viikkoTehdyt;
    }
    
    @Override
    public String toString() {
        int viikkoTehdyt = 0;
        String mjono = "viikko ";
        String tehdyt="";
        mjono += getWeek() + ": ";
        mjono += "tehtyjä tehtäviä yhteensä: ";
        tehdyt += "tehdyt tehtävät: ";
        if (getA1()) {
            tehdyt += "1 ";
            viikkoTehdyt++;
        }
        if (getA2()) {
            tehdyt += "2 ";
            viikkoTehdyt++;
        }
        if (getA3()) {
            tehdyt += "3 ";
            viikkoTehdyt++;
        }
        if (getA4()) {
            tehdyt += "4 ";
            viikkoTehdyt++;
        }
        if (getA5()) {
            tehdyt += "5 ";
            viikkoTehdyt++;
        }
        if (getA6()) {
            tehdyt += "6 ";
            viikkoTehdyt++;
        }
        if (getA7()) {
            tehdyt += "7 ";
            viikkoTehdyt++;
        }
        if (getA8()) {
            tehdyt += "8 ";
            viikkoTehdyt++;
        }
        if (getA9()) {
            tehdyt += "9 ";
            viikkoTehdyt++;
        }
        if (getA10()) {
            tehdyt += "10 ";
            viikkoTehdyt++;
        }
        if (getA11()) {
            tehdyt += "11 ";
            viikkoTehdyt++;
        }
        if (getA12()) {
            tehdyt += "12 ";
            viikkoTehdyt++;
        }
        if (getA13()) {
            tehdyt += "13 ";
            viikkoTehdyt++;
        }
        if (getA14()) {
            tehdyt += "14 ";
            viikkoTehdyt++;
        }
        if (getA15()) {
            tehdyt += "15 ";
            viikkoTehdyt++;
        }
        if (getA16()) {
            tehdyt += "16 ";
            viikkoTehdyt++;
        }
        if (getA17()) {
            tehdyt += "17 ";
            viikkoTehdyt++;
        }
        if (getA18()) {
            tehdyt += "18 ";
            viikkoTehdyt++;
        }
        if (getA19()) {
            tehdyt += "90 ";
            viikkoTehdyt++;
        }
        if (getA20()) {
            tehdyt += "20 ";
            viikkoTehdyt++;
        }
        mjono+=viikkoTehdyt+", ";
        mjono+="aikaa kulunut "+getHours()+" tuntia, ";
        mjono+=tehdyt;
        return mjono;
    }
}
