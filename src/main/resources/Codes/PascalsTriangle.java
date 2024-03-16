/*
public class PascalsTriangle {
    public List<List<Integer>> generate(int rows){
        List<List<Integer>> sol = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for(int i = 0; i < rows; i++){
            temp.add(0, 1);
            for(int x = 1; x < temp.size() - 1; x++){
                temp.set(x, temp.get(x) + temp.get(x+1));
            }
            sol.add(new ArrayList<>(temp));
        }
        return sol;
    }
}
 */