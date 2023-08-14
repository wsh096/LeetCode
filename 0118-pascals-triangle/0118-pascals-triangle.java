import java.util.List;
import java.util.ArrayList;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for(int rowNum = 1; rowNum < numRows; rowNum++){
            List<Integer> row = new ArrayList<>();
            List<Integer> preRow = triangle.get(rowNum - 1);

            row.add(1);

            for(int j = 1; j < rowNum; j++){
                row.add(preRow.get(j - 1) + preRow.get(j));
            }
            row.add(1);

            triangle.add(row);
        }
        return triangle;
    }
}