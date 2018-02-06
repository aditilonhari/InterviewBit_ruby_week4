public class Solution {
    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> a) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		result.add(new ArrayList<Integer>());
		if (a.size() == 0)
			return result;
		Collections.sort(a);
		subsetsHelper(a, result, new ArrayList<Integer>(), 0);
		return result;
	}
	
	public void subsetsHelper(ArrayList<Integer> a, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> temp, int index)
	{
		for (int i = index; i < a.size(); i++)
		{
			temp.add(a.get(i));
			result.add(new ArrayList<Integer>(temp));
			subsetsHelper(a, result, temp, i+1);
			temp.remove(temp.size() - 1);
		}
	}
}
