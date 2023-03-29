/**
 * Calculate interests rate
 */
public class InterestRate {

    static Integer days[] = {31,59,92,122,153,184,213,245,275,304,337,366,394,427,458,486,519,549,580,611,640,672,703,731,762,792,822,853,884,912,945,976,1004,1037,1067,1095,1127,1157,1186,1218,1249,1280,1310,1340,1371,1402,1431,1459,1492,1522,1553,1583,1613,1645,1675,1704,1736,1767,1798,1827,1858,1886,1919,1949,1980,2011,2040,2072,2102,2131,2164,2192,2221,2253,2284,2313,2345,2376};
    static Double installments[] = {21957.59,21020.84,22439.24,21509.24,21748.37,21696.07,21071.01,21876.15,21256.15,20924.22,21993.81,20826.36,20501.17,21826.77,21225.33,20359.44,21659.74,20800.6,21016.11,20963.81,20385.99,21120.27,20806.89,19981.5,20702.29,20395.66,20345.04,20545.37,
            20493.07,19698.04,20880.23,20336.15,19556.32,20713.19,19940.1,19414.59,20310.39,19788.25,19505.25,20148.42,19865.41,19813.11,19535.17,19484.55,19656.2,19603.89,19113.81,18847.68,19878.01,19180.85,19342.37,19079.61,19029.0,19392.54,18927.76,18673.44,19230.56,18976.24,
            18923.93,18477.72,18819.33,18186.28,19098.51,18472.21,18610.11,18557.8,18135.21,18636.65,18219.12,17988.42,18653.07,17713.85,17841.63,18312.7,18087.06,17694.84,18150.73,1265584.15};

    static Integer baseDays = 360;
    static double loan = 2238751.97;

    public static double calcLoan(Integer [] days, Double [] installments, Integer baseDays, Double rate) {
        double result = 0;

        for(int i = 0; i < days.length; i++) {
            result += installments[i] / Math.pow(1+rate, (double) days[i] / baseDays);
        }

        return result;
    }

    public static void main(String[] args) {

        double rateMin = 0, rateMax = 1;

        for(int i = 0; i < 30; i++) {

            double rateMid = (rateMin + rateMax) / 2;
            double loanMid = calcLoan(days, installments, baseDays, rateMid);

            if (loanMid > loan) rateMin = rateMid;
            if (loanMid < loan) rateMax = rateMid;
        }

        System.out.println(rateMin);
    }
}
