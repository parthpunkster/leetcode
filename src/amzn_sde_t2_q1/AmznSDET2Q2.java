package amzn_sde_t2_q1;

import java.util.*;

public class AmznSDET2Q2 {
    public static ArrayList<ReviewScoreOfProduct> positiveAggregateScore (int scoreCount,ArrayList<ReviewScoreOfProduct> rsop){
        HashMap<Integer,ArrayList<Double>> map = new HashMap<>();
        for (int i = 0 ; i<rsop.size();i++){
            int tmp_pid = rsop.get(i).pid;
            double tmp_value = rsop.get(i).value;
            if (map.containsKey(tmp_pid)){
                map.get(tmp_pid).add(tmp_value);
            }
            else {
                map.put(tmp_pid,new ArrayList<Double>());
                map.get(tmp_pid).add(tmp_value);
            }
        }
        ArrayList<ReviewScoreOfProduct> result = new ArrayList<>();

        Iterator it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry pair = (Map.Entry)it.next();
            int tmp_pid = (int)pair.getKey();
            ArrayList<Double> tmpArray = (ArrayList<Double>) pair.getValue();
            Double[] tmpSorted = tmpArray.toArray(new Double[0]);
            Arrays.sort(tmpSorted);
            double finalScore = 0.0;
            for (int i = 0 ; i<scoreCount;i++){
                finalScore += tmpSorted[tmpSorted.length-1-i];
            }
            result.add(new ReviewScoreOfProduct(tmp_pid,finalScore));
            it.remove();
        }
        return result;

    }

    public static void main(String[] args){
        ArrayList<ReviewScoreOfProduct> list = new ArrayList<>();
        list.add(new ReviewScoreOfProduct(1,100.0));
        list.add(new ReviewScoreOfProduct(2,100.0));
        list.add(new ReviewScoreOfProduct(3,100.0));
        list.add(new ReviewScoreOfProduct(4,100.0));

        list.add(new ReviewScoreOfProduct(1,10.0));
        list.add(new ReviewScoreOfProduct(2,20.0));
        list.add(new ReviewScoreOfProduct(3,30.0));
        list.add(new ReviewScoreOfProduct(4,400.0));

        list.add(new ReviewScoreOfProduct(1,20.0));
        list.add(new ReviewScoreOfProduct(2,30.0));
        list.add(new ReviewScoreOfProduct(3,40.0));
        list.add(new ReviewScoreOfProduct(4,50.0));

        list.add(new ReviewScoreOfProduct(1,30.0));
        list.add(new ReviewScoreOfProduct(2,40.0));
        list.add(new ReviewScoreOfProduct(3,50.0));
        list.add(new ReviewScoreOfProduct(4,60.0));

        list.add(new ReviewScoreOfProduct(1,40.0));
        list.add(new ReviewScoreOfProduct(2,50.0));
        list.add(new ReviewScoreOfProduct(3,60.0));
        list.add(new ReviewScoreOfProduct(4,70.0));

        ArrayList<ReviewScoreOfProduct> result = positiveAggregateScore(3,list);
        for(int i = 0 ; i<result.size();i++){
            System.out.print(result.get(i).pid);
            System.out.print("\t");
            System.out.println(result.get(i).value);
        }
    }
}
